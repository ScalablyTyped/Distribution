package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start[TEvent /* <: js.Object */] extends StObject {
  
  var end: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.undefined
  
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
  
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
}
object Start {
  
  inline def apply[TEvent /* <: js.Object */](): Start[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start[TEvent]]
  }
  
  extension [Self <: Start[?], TEvent /* <: js.Object */](x: Self & Start[TEvent]) {
    
    inline def setEnd(value: /* event */ TEvent => typings.std.Date): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: /* event */ TEvent => typings.std.Date): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTitle(value: /* event */ TEvent => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: /* event */ TEvent => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
