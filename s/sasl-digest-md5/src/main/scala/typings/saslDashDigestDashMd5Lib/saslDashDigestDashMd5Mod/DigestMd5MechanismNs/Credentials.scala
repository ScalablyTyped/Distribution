package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod.DigestMd5MechanismNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var password: java.lang.String
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  var serviceType: java.lang.String
  var username: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(
    host: java.lang.String,
    password: java.lang.String,
    serviceType: java.lang.String,
    username: java.lang.String,
    authzid: java.lang.String = null,
    realm: java.lang.String = null,
    serviceName: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("serviceType")(serviceType)
    __obj.updateDynamic("username")(username)
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Credentials]
  }
}

