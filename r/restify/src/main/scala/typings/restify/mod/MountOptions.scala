package typings.restify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountOptions extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  var method: String
  var name: String
  var path: js.UndefOr[String | RegExp] = js.undefined
  var url: js.UndefOr[String | RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[RegExp] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}

object MountOptions {
  @scala.inline
  def apply(
    method: String,
    name: String,
    contentType: String | js.Array[String] = null,
    path: String | RegExp = null,
    url: String | RegExp = null,
    urlParamPattern: RegExp = null,
    version: String = null,
    versions: js.Array[String] = null
  ): MountOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParamPattern != null) __obj.updateDynamic("urlParamPattern")(urlParamPattern.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
}

