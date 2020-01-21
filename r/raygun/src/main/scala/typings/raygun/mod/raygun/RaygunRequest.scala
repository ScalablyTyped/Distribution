package typings.raygun.mod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunRequest extends js.Object {
  var form: js.UndefOr[KeyValueObject] = js.undefined
  var headers: js.UndefOr[KeyValueObject] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var queryString: js.UndefOr[KeyValueObject] = js.undefined
}

object RaygunRequest {
  @scala.inline
  def apply(
    form: KeyValueObject = null,
    headers: KeyValueObject = null,
    host: String = null,
    hostname: String = null,
    ip: String = null,
    method: String = null,
    path: String = null,
    queryString: KeyValueObject = null
  ): RaygunRequest = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunRequest]
  }
}

