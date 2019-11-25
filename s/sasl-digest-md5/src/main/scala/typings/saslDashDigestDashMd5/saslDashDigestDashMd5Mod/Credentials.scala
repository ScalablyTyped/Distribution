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
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (authzid != null) __obj.updateDynamic("authzid")(authzid.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

