package typings.socks

import typings.socks.constantsMod.SocksProxyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var ipaddress: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: Double
  var `type`: SocksProxyType
  var userId: js.UndefOr[String] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(
    port: Double,
    `type`: SocksProxyType,
    host: String = null,
    ipaddress: String = null,
    password: String = null,
    userId: String = null
  ): AnonHost = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (ipaddress != null) __obj.updateDynamic("ipaddress")(ipaddress.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

