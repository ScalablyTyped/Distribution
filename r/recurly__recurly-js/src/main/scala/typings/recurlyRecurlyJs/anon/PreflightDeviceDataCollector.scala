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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreflightDeviceDataCollector] (val x: Self) extends AnyVal {
    
    inline def setPreflightDeviceDataCollector(value: Boolean): Self = StObject.set(x, "preflightDeviceDataCollector", value.asInstanceOf[js.Any])
    
    inline def setPreflightDeviceDataCollectorUndefined: Self = StObject.set(x, "preflightDeviceDataCollector", js.undefined)
  }
}
