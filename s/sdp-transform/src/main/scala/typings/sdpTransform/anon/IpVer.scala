package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpVer extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var ipVer: js.UndefOr[Double] = js.undefined
  var netType: js.UndefOr[String] = js.undefined
  var port: Double
}

object IpVer {
  @scala.inline
  def apply(
    port: Double,
    address: String = null,
    ipVer: js.UndefOr[Double] = js.undefined,
    netType: String = null
  ): IpVer = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(ipVer)) __obj.updateDynamic("ipVer")(ipVer.get.asInstanceOf[js.Any])
    if (netType != null) __obj.updateDynamic("netType")(netType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpVer]
  }
}

