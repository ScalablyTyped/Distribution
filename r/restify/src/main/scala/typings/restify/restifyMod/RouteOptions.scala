package typings.restify.restifyMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String | RegExp] = js.undefined
  var url: js.UndefOr[String | RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[RegExp] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    contentType: String | js.Array[String] = null,
    name: String = null,
    path: String | RegExp = null,
    url: String | RegExp = null,
    urlParamPattern: RegExp = null,
    version: String = null,
    versions: js.Array[String] = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParamPattern != null) __obj.updateDynamic("urlParamPattern")(urlParamPattern)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[RouteOptions]
  }
}

