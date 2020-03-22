package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIpVer extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var ipVer: js.UndefOr[Double] = js.undefined
  var netType: js.UndefOr[String] = js.undefined
  var port: Double
}

object AnonIpVer {
  @scala.inline
  def apply(port: Double, address: String = null, ipVer: Int | Double = null, netType: String = null): AnonIpVer = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (ipVer != null) __obj.updateDynamic("ipVer")(ipVer.asInstanceOf[js.Any])
    if (netType != null) __obj.updateDynamic("netType")(netType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIpVer]
  }
}

