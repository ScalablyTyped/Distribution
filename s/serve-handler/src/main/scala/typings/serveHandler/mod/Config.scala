package typings.serveHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var cleanUrls: js.UndefOr[Boolean | js.Array[String]] = js.undefined
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
  var directoryListing: js.UndefOr[Boolean | js.Array[String]] = js.undefined
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
  var etag: js.UndefOr[Boolean] = js.undefined
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
  var headers: js.UndefOr[js.Array[Header]] = js.undefined
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
  var public: js.UndefOr[String] = js.undefined
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
  var redirects: js.UndefOr[js.Array[Redirect]] = js.undefined
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
  var renderSingle: js.UndefOr[Boolean] = js.undefined
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
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
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
  var symlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * #### Remove or add trailing slashes to all paths.
    *
    * By default, the package will try to make assumptions for when to add
    * trailing slashes to your URLs or not. If you want to remove them, set
    * this property to `false` and `true` if you want to force them on all
    * URLs.
    */
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
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
  var unlisted: js.UndefOr[js.Array[String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    cleanUrls: Boolean | js.Array[String] = null,
    directoryListing: Boolean | js.Array[String] = null,
    etag: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[Header] = null,
    public: String = null,
    redirects: js.Array[Redirect] = null,
    renderSingle: js.UndefOr[Boolean] = js.undefined,
    rewrites: js.Array[Rewrite] = null,
    symlinks: js.UndefOr[Boolean] = js.undefined,
    trailingSlash: js.UndefOr[Boolean] = js.undefined,
    unlisted: js.Array[String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (cleanUrls != null) __obj.updateDynamic("cleanUrls")(cleanUrls.asInstanceOf[js.Any])
    if (directoryListing != null) __obj.updateDynamic("directoryListing")(directoryListing.asInstanceOf[js.Any])
    if (!js.isUndefined(etag)) __obj.updateDynamic("etag")(etag.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(renderSingle)) __obj.updateDynamic("renderSingle")(renderSingle.get.asInstanceOf[js.Any])
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites.asInstanceOf[js.Any])
    if (!js.isUndefined(symlinks)) __obj.updateDynamic("symlinks")(symlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailingSlash)) __obj.updateDynamic("trailingSlash")(trailingSlash.get.asInstanceOf[js.Any])
    if (unlisted != null) __obj.updateDynamic("unlisted")(unlisted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

