package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventEventValue extends StObject {
  
  var originalEvent: typings.std.Event = js.native
  
  var value: Double | (js.Tuple2[Double, Double]) = js.native
}
object OriginalEventEventValue {
  
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: Double | (js.Tuple2[Double, Double])): OriginalEventEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEventValue]
  }
  
  @scala.inline
  implicit class OriginalEventEventValueMutableBuilder[Self <: OriginalEventEventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
