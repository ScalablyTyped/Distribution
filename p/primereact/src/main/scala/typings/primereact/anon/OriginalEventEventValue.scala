package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEventEventValue extends StObject {
  
  var originalEvent: typings.std.Event
  
  var value: Double | (js.Tuple2[Double, Double])
}
object OriginalEventEventValue {
  
  inline def apply(originalEvent: typings.std.Event, value: Double | (js.Tuple2[Double, Double])): OriginalEventEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEventValue]
  }
  
  extension [Self <: OriginalEventEventValue](x: Self) {
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
