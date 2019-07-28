package typings.restifyDashPlugins.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeStatic extends js.Object {
  var appendRequestPath: js.UndefOr[Boolean] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var directory: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var `match`: js.UndefOr[js.Any] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
}

object ServeStatic {
  @scala.inline
  def apply(
    appendRequestPath: js.UndefOr[Boolean] = js.undefined,
    charSet: String = null,
    default: js.Any = null,
    directory: String = null,
    etag: String = null,
    file: String = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    `match`: js.Any = null,
    maxAge: Int | Double = null
  ): ServeStatic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendRequestPath)) __obj.updateDynamic("appendRequestPath")(appendRequestPath)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (default != null) __obj.updateDynamic("default")(default)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeStatic]
  }
}

