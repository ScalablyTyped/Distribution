package typings
package socksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var ipaddress: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var `type`: socksLib.typingsCommonConstantsMod.SocksProxyType
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    port: scala.Double,
    `type`: socksLib.typingsCommonConstantsMod.SocksProxyType,
    host: java.lang.String = null,
    ipaddress: java.lang.String = null,
    password: java.lang.String = null,
    userId: java.lang.String = null
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

