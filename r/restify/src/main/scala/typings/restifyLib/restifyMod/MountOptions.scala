package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  var contentType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var method: java.lang.String
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var url: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    method: java.lang.String,
    name: java.lang.String,
    contentType: java.lang.String | js.Array[java.lang.String] = null,
    path: java.lang.String | stdLib.RegExp = null,
    url: java.lang.String | stdLib.RegExp = null,
    urlParamPattern: stdLib.RegExp = null,
    version: java.lang.String = null,
    versions: js.Array[java.lang.String] = null
  ): MountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("name")(name)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParamPattern != null) __obj.updateDynamic("urlParamPattern")(urlParamPattern)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[MountOptions]
  }
}

