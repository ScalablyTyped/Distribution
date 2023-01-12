package typings.reactWidgets.anon

import typings.react.mod.SyntheticEvent
import typings.reactWidgets.esmTypesMod.Value
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastValueOriginalEvent extends StObject {
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
}
object LastValueOriginalEvent {
  
  inline def apply(lastValue: Value): LastValueOriginalEvent = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastValueOriginalEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastValueOriginalEvent] (val x: Self) extends AnyVal {
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
