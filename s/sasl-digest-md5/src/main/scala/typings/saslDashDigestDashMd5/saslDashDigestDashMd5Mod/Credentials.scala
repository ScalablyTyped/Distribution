package typings.saslDashDigestDashMd5.saslDashDigestDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[String] = js.undefined
  var host: String
  var password: String
  var realm: js.UndefOr[String] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var serviceType: String
  var username: String
}

object Credentials {
  @scala.inline
  def apply(
    host: String,
    password: String,
    serviceType: String,
    username: String,
    authzid: String = null,
    realm: String = null,
    serviceName: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(host = host, password = password, serviceType = serviceType, username = username)
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Credentials]
  }
}

