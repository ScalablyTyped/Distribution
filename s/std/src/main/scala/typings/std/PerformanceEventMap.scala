package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEventMap extends StObject {
  
  /* standard dom */
  var resourcetimingbufferfull: Event
}
object PerformanceEventMap {
  
  inline def apply(resourcetimingbufferfull: Event): PerformanceEventMap = {
    val __obj = js.Dynamic.literal(resourcetimingbufferfull = resourcetimingbufferfull.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEventMap]
  }
  
  extension [Self <: PerformanceEventMap](x: Self) {
    
    inline def setResourcetimingbufferfull(value: Event): Self = StObject.set(x, "resourcetimingbufferfull", value.asInstanceOf[js.Any])
  }
}
