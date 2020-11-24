package typings.speedtestNet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceData extends js.Object {
  
  var externalIp: String = js.native
  
  var internalIp: String = js.native
  
  var isVpn: Boolean = js.native
  
  var macAddr: String = js.native
  
  var name: String = js.native
}
object InterfaceData {
  
  @scala.inline
  def apply(externalIp: String, internalIp: String, isVpn: Boolean, macAddr: String, name: String): InterfaceData = {
    val __obj = js.Dynamic.literal(externalIp = externalIp.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], isVpn = isVpn.asInstanceOf[js.Any], macAddr = macAddr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceData]
  }
  
  @scala.inline
  implicit class InterfaceDataOps[Self <: InterfaceData] (val x: Self) extends AnyVal {
    
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
    def setExternalIp(value: String): Self = this.set("externalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalIp(value: String): Self = this.set("internalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVpn(value: Boolean): Self = this.set("isVpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddr(value: String): Self = this.set("macAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
