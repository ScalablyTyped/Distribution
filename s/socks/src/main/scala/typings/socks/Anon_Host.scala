package typings.socks

import typings.socks.typingsCommonConstantsMod.SocksProxyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var ipaddress: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: Double
  var `type`: SocksProxyType
  var userId: js.UndefOr[String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    port: Double,
    `type`: SocksProxyType,
    host: String = null,
    ipaddress: String = null,
    password: String = null,
    userId: String = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal(port = port)
    __obj.updateDynamic("type")(`type`)
    if (host != null) __obj.updateDynamic("host")(host)
    if (ipaddress != null) __obj.updateDynamic("ipaddress")(ipaddress)
    if (password != null) __obj.updateDynamic("password")(password)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Anon_Host]
  }
}

