package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressIpVer extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var ipVer: js.UndefOr[scala.Double] = js.undefined
  var netType: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
}

object Anon_AddressIpVer {
  @scala.inline
  def apply(
    port: scala.Double,
    address: java.lang.String = null,
    ipVer: scala.Int | scala.Double = null,
    netType: java.lang.String = null
  ): Anon_AddressIpVer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("port")(port)
    if (address != null) __obj.updateDynamic("address")(address)
    if (ipVer != null) __obj.updateDynamic("ipVer")(ipVer.asInstanceOf[js.Any])
    if (netType != null) __obj.updateDynamic("netType")(netType)
    __obj.asInstanceOf[Anon_AddressIpVer]
  }
}

