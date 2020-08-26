package typings.serveStatic.mod

import typings.expressServeStaticCore.mod.Response
import typings.serveStatic.serveStaticBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeStaticOptions extends js.Object {
  /**
    * Enable or disable setting Cache-Control response header, defaults to true. 
    * Disabling this will ignore the immutable and maxAge options.
    */
  var cacheControl: js.UndefOr[Boolean] = js.native
  /**
    * Set how "dotfiles" are treated when encountered. A dotfile is a file or directory that begins with a dot (".").
    * Note this check is done on the path itself without checking if the path actually exists on the disk.
    * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
    * The default value is 'ignore'.
    * 'allow' No special treatment for dotfiles
    * 'deny' Send a 403 for any request for a dotfile
    * 'ignore' Pretend like the dotfile does not exist and call next()
    */
  var dotfiles: js.UndefOr[String] = js.native
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[Boolean] = js.native
  /**
    * Set file extension fallbacks. When set, if a file is not found, the given extensions will be added to the file name and search for.
    * The first that exists will be served. Example: ['html', 'htm'].
    * The default value is false.
    */
  var extensions: js.UndefOr[js.Array[String] | `false`] = js.native
  /**
    * Let client errors fall-through as unhandled requests, otherwise forward a client error.
    * The default value is false.
    */
  var fallthrough: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable the immutable directive in the Cache-Control response header.
    * If enabled, the maxAge option should also be specified to enable caching. The immutable directive will prevent supported clients from making conditional requests during the life of the maxAge option to check if the file has changed.
    */
  var immutable: js.UndefOr[Boolean] = js.native
  /**
    * By default this module will send "index.html" files in response to a request on a directory.
    * To disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  /**
    * Enable or disable Last-Modified header, defaults to true. Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[Boolean] = js.native
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[Double | String] = js.native
  /**
    * Redirect to trailing "/" when the pathname is a dir. Defaults to true.
    */
  var redirect: js.UndefOr[Boolean] = js.native
  /**
    * Function to set custom headers on response. Alterations to the headers need to occur synchronously.
    * The function is called as fn(res, path, stat), where the arguments are:
    * res the response object
    * path the file path that is being sent
    * stat the stat object of the file that is being sent
    */
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response[_], /* path */ String, /* stat */ js.Any, _]] = js.native
}

object ServeStaticOptions {
  @scala.inline
  def apply(): ServeStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStaticOptions]
  }
  @scala.inline
  implicit class ServeStaticOptionsOps[Self <: ServeStaticOptions] (val x: Self) extends AnyVal {
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
    def setCacheControl(value: Boolean): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setDotfiles(value: String): Self = this.set("dotfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotfiles: Self = this.set("dotfiles", js.undefined)
    @scala.inline
    def setEtag(value: Boolean): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String] | `false`): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFallthrough(value: Boolean): Self = this.set("fallthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallthrough: Self = this.set("fallthrough", js.undefined)
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: Boolean | String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLastModified(value: Boolean): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setMaxAge(value: Double | String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setRedirect(value: Boolean): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSetHeaders(value: (/* res */ Response[_], /* path */ String, /* stat */ js.Any) => _): Self = this.set("setHeaders", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
  }
  
}

