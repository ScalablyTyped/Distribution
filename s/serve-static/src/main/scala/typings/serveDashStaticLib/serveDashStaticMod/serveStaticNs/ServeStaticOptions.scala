package typings
package serveDashStaticLib.serveDashStaticMod.serveStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeStaticOptions extends js.Object {
  /**
    * Enable or disable setting Cache-Control response header, defaults to true. 
    * Disabling this will ignore the immutable and maxAge options.
    */
  var cacheControl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set how "dotfiles" are treated when encountered. A dotfile is a file or directory that begins with a dot (".").
    * Note this check is done on the path itself without checking if the path actually exists on the disk.
    * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
    * The default value is 'ignore'.
    * 'allow' No special treatment for dotfiles
    * 'deny' Send a 403 for any request for a dotfile
    * 'ignore' Pretend like the dotfile does not exist and call next()
    */
  var dotfiles: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set file extension fallbacks. When set, if a file is not found, the given extensions will be added to the file name and search for.
    * The first that exists will be served. Example: ['html', 'htm'].
    * The default value is false.
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Let client errors fall-through as unhandled requests, otherwise forward a client error.
    * The default value is false.
    */
  var fallthrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable the immutable directive in the Cache-Control response header.
    * If enabled, the maxAge option should also be specified to enable caching. The immutable directive will prevent supported clients from making conditional requests during the life of the maxAge option to check if the file has changed.
    */
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default this module will send "index.html" files in response to a request on a directory.
    * To disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Enable or disable Last-Modified header, defaults to true. Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Redirect to trailing "/" when the pathname is a dir. Defaults to true.
    */
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to set custom headers on response. Alterations to the headers need to occur synchronously.
    * The function is called as fn(res, path, stat), where the arguments are:
    * res the response object
    * path the file path that is being sent
    * stat the stat object of the file that is being sent
    */
  var setHeaders: js.UndefOr[
    js.Function3[
      /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* path */ java.lang.String, 
      /* stat */ js.Any, 
      _
    ]
  ] = js.undefined
}

object ServeStaticOptions {
  @scala.inline
  def apply(
    cacheControl: js.UndefOr[scala.Boolean] = js.undefined,
    dotfiles: java.lang.String = null,
    etag: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    fallthrough: js.UndefOr[scala.Boolean] = js.undefined,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    lastModified: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Double | java.lang.String = null,
    redirect: js.UndefOr[scala.Boolean] = js.undefined,
    setHeaders: js.Function3[
      /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* path */ java.lang.String, 
      /* stat */ js.Any, 
      _
    ] = null
  ): ServeStaticOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl)
    if (dotfiles != null) __obj.updateDynamic("dotfiles")(dotfiles)
    if (!js.isUndefined(etag)) __obj.updateDynamic("etag")(etag)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(fallthrough)) __obj.updateDynamic("fallthrough")(fallthrough)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders)
    __obj.asInstanceOf[ServeStaticOptions]
  }
}

