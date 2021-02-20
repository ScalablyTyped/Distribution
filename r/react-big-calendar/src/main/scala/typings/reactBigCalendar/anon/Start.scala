package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Start[TEvent /* <: js.Object */] extends StObject {
  
  var end: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.native
  
  var start: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.native
  
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
  
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
}
object Start {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Start[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start[TEvent]]
  }
  
  @scala.inline
  implicit class StartMutableBuilder[Self <: Start[_], TEvent /* <: js.Object */] (val x: Self with Start[TEvent]) extends AnyVal {
    
    @scala.inline
    def setEnd(value: /* event */ TEvent => typings.std.Date): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: /* event */ TEvent => typings.std.Date): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTitle(value: /* event */ TEvent => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: /* event */ TEvent => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
