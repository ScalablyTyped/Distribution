package typings.serveHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * #### Have the `.html` extension stripped from paths.
    *
    * By default, all `.html` files can be accessed without their extension.
    * If one of these extensions is used at the end of a filename, it will
    * automatically perform a redirect with status code `301` to the same path,
    * but with the extension dropped. You can disable the feature by setting
    * this to `false`.
    *
    * However, you can also restrict it to certain paths by passing an array of
    * strings (**NOTE:** the paths can only contain globs that are matched
    * using `minimatch`).
    */
  var cleanUrls: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * ### Disable directory listing or restrict it to certain paths.
    *
    * For paths are not files, but directories, the package will automatically
    * render a good-looking list of all the files and directories contained
    * inside that directory. If you'd like to disable this for all paths, set
    * this option to `false`. Furthermore, you can also restrict it to certain
    * directory paths if you want, by passing an array of strings.
    *
    * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
    */
  var directoryListing: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * #### Calculate a strong `ETag` response header, instead of `Last-Modified`.
    *
    * HTTP response headers will contain a strong `ETag` response header,
    * instead of a `Last-Modified` header. Opt-in because calculating the hash
    * value may be computationally expensive for large files.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag
    * @see https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Last-Modified
    */
  var etag: js.UndefOr[Boolean] = js.native
  /**
    * #### Set custom headers for specific paths.
    *
    * Allows you to set custom headers (and overwrite the default ones) for
    * certain paths. If you define the `ETag` header for a path, the handler
    * will automatically reply with status code `304` for that path if a
    * request comes in with a matching `If-None-Match` header. If you set a
    * header `value` to `null` it removes any previous defined header with the
    * same key.
    *
    * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
    */
  var headers: js.UndefOr[js.Array[Header]] = js.native
  /**
    * #### Set a sub directory to be served.
    *
    * By default, the current working directory will be served. If you only
    * want to serve a specific path, you can use this options to pass an
    * absolute path or a custom directory to be served relative to the current
    * working directory.
    *
    * **NOTE:** The path cannot contain globs or regular expressions.
    */
  var public: js.UndefOr[String] = js.native
  /**
    * #### Forward paths to different paths or external URLs.
    *
    * In order to redirect visits to a certain path to a different one (or even
    * an external URL), you can use this option. By default, all of them are
    * performed with the status code `301`, but this behavior can be adjusted
    * by setting the `type` property directly on the object.
    *
    * **NOTE:** The paths can contain globs (matched using `minimatch`) or
    * regular expressions (match using `path-to-regexp`).
    */
  var redirects: js.UndefOr[js.Array[Redirect]] = js.native
  /**
    * #### If a directory only contains one file, render it.
    *
    * Sometimes you might want to have a directory path actually render a file,
    * if the directory only contains one. This is only useful for any files
    * that are not `.html` files (for those, `cleanUrls` is faster). This is
    * disabled by default and can be enabled by setting this option to `true`.
    * After that, if you access your directory `/test` (for example), you will
    * see an image being rendered if the directory contains a single image
    * file.
    */
  var renderSingle: js.UndefOr[Boolean] = js.native
  /**
    * #### Rewrite paths to different paths.
    *
    * If you want your visitors to receive a response under a certain path, but
    * actually serve a completely different one behind the curtains, this
    * option is what you need.
    *
    * **NOTE:** The paths can contain globs (matched using `minimatch`) or
    * regular expressions (match using `path-to-regexp`).
    */
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.native
  /**
    * #### Resolve symlinks instead of rendering a 404 error.
    *
    * For security purposes, symlinks are disabled by default. If serve-handler
    * encounters a symlink, it will treat it as if it doesn't exist in the
    * first place. In turn, a 404 error is rendered for that path. However,
    * this behavior can easily be adjusted by setting this option to `true`.
    * Once this property is set, all symlinks will automatically be resolved to
    * their targets.
    */
  var symlinks: js.UndefOr[Boolean] = js.native
  /**
    * #### Remove or add trailing slashes to all paths.
    *
    * By default, the package will try to make assumptions for when to add
    * trailing slashes to your URLs or not. If you want to remove them, set
    * this property to `false` and `true` if you want to force them on all
    * URLs.
    */
  var trailingSlash: js.UndefOr[Boolean] = js.native
  /**
    * #### Exclude paths from the directory listing.
    *
    * In certain cases, you might not want a file or directory to appear in the
    * directory listing. In these situations, there are two ways of solving
    * this problem. Either you disable the directory listing entirely, or you
    * exclude certain paths from those listings by adding them all to this
    * config property.
    *
    * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
    */
  var unlisted: js.UndefOr[js.Array[String]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setCleanUrlsVarargs(value: String*): Self = this.set("cleanUrls", js.Array(value :_*))
    @scala.inline
    def setCleanUrls(value: Boolean | js.Array[String]): Self = this.set("cleanUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanUrls: Self = this.set("cleanUrls", js.undefined)
    @scala.inline
    def setDirectoryListingVarargs(value: String*): Self = this.set("directoryListing", js.Array(value :_*))
    @scala.inline
    def setDirectoryListing(value: Boolean | js.Array[String]): Self = this.set("directoryListing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryListing: Self = this.set("directoryListing", js.undefined)
    @scala.inline
    def setEtag(value: Boolean): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: Header*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setRedirectsVarargs(value: Redirect*): Self = this.set("redirects", js.Array(value :_*))
    @scala.inline
    def setRedirects(value: js.Array[Redirect]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    @scala.inline
    def setRenderSingle(value: Boolean): Self = this.set("renderSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderSingle: Self = this.set("renderSingle", js.undefined)
    @scala.inline
    def setRewritesVarargs(value: Rewrite*): Self = this.set("rewrites", js.Array(value :_*))
    @scala.inline
    def setRewrites(value: js.Array[Rewrite]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewrites: Self = this.set("rewrites", js.undefined)
    @scala.inline
    def setSymlinks(value: Boolean): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    @scala.inline
    def setTrailingSlash(value: Boolean): Self = this.set("trailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingSlash: Self = this.set("trailingSlash", js.undefined)
    @scala.inline
    def setUnlistedVarargs(value: String*): Self = this.set("unlisted", js.Array(value :_*))
    @scala.inline
    def setUnlisted(value: js.Array[String]): Self = this.set("unlisted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlisted: Self = this.set("unlisted", js.undefined)
  }
  
}

