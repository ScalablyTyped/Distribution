package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreflightDeviceDataCollector extends StObject {
  
  var preflightDeviceDataCollector: js.UndefOr[Boolean] = js.undefined
}
object PreflightDeviceDataCollector {
  
  inline def apply(): PreflightDeviceDataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreflightDeviceDataCollector]
  }
  
  extension [Self <: PreflightDeviceDataCollector](x: Self) {
    
    inline def setPreflightDeviceDataCollector(value: Boolean): Self = StObject.set(x, "preflightDeviceDataCollector", value.asInstanceOf[js.Any])
    
    inline def setPreflightDeviceDataCollectorUndefined: Self = StObject.set(x, "preflightDeviceDataCollector", js.undefined)
  }
}
