package typings.reactWidgets.anon

import typings.react.mod.SyntheticEvent
import typings.reactWidgets.cjsTypesMod.Value
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastValue extends StObject {
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
}
object LastValue {
  
  inline def apply(lastValue: Value): LastValue = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastValue] (val x: Self) extends AnyVal {
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
