package typings.serialport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortInfo extends js.Object {
  var locationId: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var path: String
  var pnpId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var serialNumber: js.UndefOr[String] = js.undefined
  var vendorId: js.UndefOr[String] = js.undefined
}

object PortInfo {
  @scala.inline
  def apply(
    path: String,
    locationId: String = null,
    manufacturer: String = null,
    pnpId: String = null,
    productId: String = null,
    serialNumber: String = null,
    vendorId: String = null
  ): PortInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (pnpId != null) __obj.updateDynamic("pnpId")(pnpId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortInfo]
  }
}

