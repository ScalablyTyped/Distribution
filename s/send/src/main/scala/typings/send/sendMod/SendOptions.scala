package typings.send.sendMod

import typings.send.sendStrings.allow
import typings.send.sendStrings.deny
import typings.send.sendStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  /**
    * Enable or disable accepting ranged requests, defaults to true.
    * Disabling this will not send Accept-Ranges and ignore the contents of the Range request header.
    */
  var acceptRanges: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable setting Cache-Control response header, defaults to true.
    * Disabling this will ignore the maxAge option.
    */
  var cacheControl: js.UndefOr[Boolean] = js.undefined
  /**
    * Set how "dotfiles" are treated when encountered.
    * A dotfile is a file or directory that begins with a dot (".").
    * Note this check is done on the path itself without checking if the path actually exists on the disk.
    * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
    * 'allow' No special treatment for dotfiles.
    * 'deny' Send a 403 for any request for a dotfile.
    * 'ignore' Pretend like the dotfile does not exist and 404.
    * The default value is similar to 'ignore', with the exception that this default will not ignore the files within a directory that begins with a dot, for backward-compatibility.
    */
  var dotfiles: js.UndefOr[allow | deny | ignore] = js.undefined
  /**
    * Byte offset at which the stream ends, defaults to the length of the file minus 1.
    * The end is inclusive in the stream, meaning end: 3 will include the 4th byte in the stream.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[Boolean] = js.undefined
  /**
    * If a given file doesn't exist, try appending one of the given extensions, in the given order.
    * By default, this is disabled (set to false).
    * An example value that will serve extension-less HTML files: ['html', 'htm'].
    * This is skipped if the requested file already has an extension.
    */
  var extensions: js.UndefOr[js.Array[String] | String | Boolean] = js.undefined
  /**
    * By default send supports "index.html" files, to disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[js.Array[String] | String | Boolean] = js.undefined
  /**
    * Enable or disable Last-Modified header, defaults to true.
    * Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0.
    * This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[String | Double] = js.undefined
  /**
    * Serve files relative to path.
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * Byte offset at which the stream starts, defaults to 0.
    * The start is inclusive, meaning start: 2 will include the 3rd byte in the stream.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    acceptRanges: js.UndefOr[Boolean] = js.undefined,
    cacheControl: js.UndefOr[Boolean] = js.undefined,
    dotfiles: allow | deny | ignore = null,
    end: Int | Double = null,
    etag: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] | String | Boolean = null,
    index: js.Array[String] | String | Boolean = null,
    lastModified: js.UndefOr[Boolean] = js.undefined,
    maxAge: String | Double = null,
    root: String = null,
    start: Int | Double = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptRanges)) __obj.updateDynamic("acceptRanges")(acceptRanges)
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl)
    if (dotfiles != null) __obj.updateDynamic("dotfiles")(dotfiles.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(etag)) __obj.updateDynamic("etag")(etag)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

