package typings.reactWidgets.anon

import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawValue extends StObject {
  
  var lastValue: js.UndefOr[Double] = js.undefined
  
  var originalEvent: (SyntheticEvent[HTMLDivElement | HTMLButtonElement, Event]) | Null
  
  var rawValue: Double
}
object RawValue {
  
  inline def apply(rawValue: Double): RawValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any], originalEvent = null)
    __obj.asInstanceOf[RawValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawValue] (val x: Self) extends AnyVal {
    
    inline def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
    
    inline def setOriginalEvent(value: SyntheticEvent[HTMLDivElement | HTMLButtonElement, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventNull: Self = StObject.set(x, "originalEvent", null)
    
    inline def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
