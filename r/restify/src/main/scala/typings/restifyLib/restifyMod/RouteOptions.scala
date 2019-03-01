package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var contentType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var url: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    path: java.lang.String | stdLib.RegExp = null,
    url: java.lang.String | stdLib.RegExp = null,
    urlParamPattern: stdLib.RegExp = null,
    version: java.lang.String = null,
    versions: js.Array[java.lang.String] = null
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

