package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiTestV2
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataCenterId: js.UndefOr[Id] = js.undefined
  
  var deviceId: js.UndefOr[Id] = js.undefined
  
  var methodName: js.UndefOr[String] = js.undefined
}
object ApiTestV2 {
  
  @scala.inline
  def apply(): ApiTestV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestV2]
  }
  
  @scala.inline
  implicit class ApiTestV2MutableBuilder[Self <: ApiTestV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: Id): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
  }
}
