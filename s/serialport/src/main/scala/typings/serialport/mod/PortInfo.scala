package typings.serialport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortInfo extends js.Object {
  
  var locationId: js.UndefOr[String] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var pnpId: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var serialNumber: js.UndefOr[String] = js.native
  
  var vendorId: js.UndefOr[String] = js.native
}
object PortInfo {
  
  @scala.inline
  def apply(path: String): PortInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortInfo]
  }
  
  @scala.inline
  implicit class PortInfoOps[Self <: PortInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setPnpId(value: String): Self = this.set("pnpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePnpId: Self = this.set("pnpId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setVendorId(value: String): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
}
