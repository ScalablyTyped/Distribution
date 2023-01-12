package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiTestV2
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataCenterId: js.UndefOr[Id] = js.undefined
  
  var deviceId: js.UndefOr[Id] = js.undefined
  
  var methodName: js.UndefOr[String] = js.undefined
}
object ApiTestV2 {
  
  inline def apply(): ApiTestV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiTestV2] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    inline def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
  }
}
