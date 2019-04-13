package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortInfo extends js.Object {
  var comName: java.lang.String
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var pnpId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  var vendorId: js.UndefOr[java.lang.String] = js.undefined
}

object PortInfo {
  @scala.inline
  def apply(
    comName: java.lang.String,
    locationId: java.lang.String = null,
    manufacturer: java.lang.String = null,
    pnpId: java.lang.String = null,
    productId: java.lang.String = null,
    serialNumber: java.lang.String = null,
    vendorId: java.lang.String = null
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

