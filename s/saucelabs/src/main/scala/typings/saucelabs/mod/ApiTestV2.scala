package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiTestV2
  extends /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var dataCenterId: js.UndefOr[Id] = js.native
  
  var deviceId: js.UndefOr[Id] = js.native
  
  var methodName: js.UndefOr[String] = js.native
}
object ApiTestV2 {
  
  @scala.inline
  def apply(): ApiTestV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestV2]
  }
  
  @scala.inline
  implicit class ApiTestV2Ops[Self <: ApiTestV2] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataCenterId(value: Id): Self = this.set("dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCenterId: Self = this.set("dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: Id): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
  }
}
