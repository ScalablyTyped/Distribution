package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorDeviceMemory extends StObject {
  
  val deviceMemory: js.UndefOr[Double] = js.undefined
}
object NavigatorDeviceMemory {
  
  inline def apply(): NavigatorDeviceMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorDeviceMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorDeviceMemory] (val x: Self) extends AnyVal {
    
    inline def setDeviceMemory(value: Double): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
    
    inline def setDeviceMemoryUndefined: Self = StObject.set(x, "deviceMemory", js.undefined)
  }
}
