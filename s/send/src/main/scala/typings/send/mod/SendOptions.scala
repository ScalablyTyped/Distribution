package typings.send.mod

import typings.send.sendStrings.allow
import typings.send.sendStrings.deny
import typings.send.sendStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendOptions extends js.Object {
  
  /**
    * Enable or disable accepting ranged requests, defaults to true.
    * Disabling this will not send Accept-Ranges and ignore the contents of the Range request header.
    */
  var acceptRanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable setting Cache-Control response header, defaults to true.
    * Disabling this will ignore the maxAge option.
    */
  var cacheControl: js.UndefOr[Boolean] = js.native
  
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
  var dotfiles: js.UndefOr[allow | deny | ignore] = js.native
  
  /**
    * Byte offset at which the stream ends, defaults to the length of the file minus 1.
    * The end is inclusive in the stream, meaning end: 3 will include the 4th byte in the stream.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[Boolean] = js.native
  
  /**
    * If a given file doesn't exist, try appending one of the given extensions, in the given order.
    * By default, this is disabled (set to false).
    * An example value that will serve extension-less HTML files: ['html', 'htm'].
    * This is skipped if the requested file already has an extension.
    */
  var extensions: js.UndefOr[js.Array[String] | String | Boolean] = js.native
  
  /**
    * By default send supports "index.html" files, to disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[js.Array[String] | String | Boolean] = js.native
  
  /**
    * Enable or disable Last-Modified header, defaults to true.
    * Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0.
    * This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[String | Double] = js.native
  
  /**
    * Serve files relative to path.
    */
  var root: js.UndefOr[String] = js.native
  
  /**
    * Byte offset at which the stream starts, defaults to 0.
    * The start is inclusive, meaning start: 2 will include the 3rd byte in the stream.
    */
  var start: js.UndefOr[Double] = js.native
}
object SendOptions {
  
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptRanges(value: Boolean): Self = this.set("acceptRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptRanges: Self = this.set("acceptRanges", js.undefined)
    
    @scala.inline
    def setCacheControl(value: Boolean): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    
    @scala.inline
    def setDotfiles(value: allow | deny | ignore): Self = this.set("dotfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotfiles: Self = this.set("dotfiles", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEtag(value: Boolean): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String] | String | Boolean): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: js.Array[String] | String | Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLastModified(value: Boolean): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String | Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
