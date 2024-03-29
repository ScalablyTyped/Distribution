package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceData extends StObject {
  
  var deviceData: js.UndefOr[String] = js.undefined
}
object DeviceData {
  
  inline def apply(): DeviceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceData] (val x: Self) extends AnyVal {
    
    inline def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    inline def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
  }
}
