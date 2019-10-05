package typings.raygun.raygunMod.raygun

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
    if (form != null) __obj.updateDynamic("form")(form)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    __obj.asInstanceOf[RaygunRequest]
  }
}

