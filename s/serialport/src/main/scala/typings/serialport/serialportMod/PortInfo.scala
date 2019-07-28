package typings.serialport.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortInfo extends js.Object {
  var comName: String
  var locationId: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var pnpId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var serialNumber: js.UndefOr[String] = js.undefined
  var vendorId: js.UndefOr[String] = js.undefined
}

object PortInfo {
  @scala.inline
  def apply(
    comName: String,
    locationId: String = null,
    manufacturer: String = null,
    pnpId: String = null,
    productId: String = null,
    serialNumber: String = null,
    vendorId: String = null
  ): PortInfo = {
    val __obj = js.Dynamic.literal(comName = comName)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (pnpId != null) __obj.updateDynamic("pnpId")(pnpId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId)
    __obj.asInstanceOf[PortInfo]
  }
}

