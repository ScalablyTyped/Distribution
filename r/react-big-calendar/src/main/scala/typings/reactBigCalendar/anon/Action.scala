package typings.reactBigCalendar.anon

import typings.reactBigCalendar.reactBigCalendarStrings.DOWN
import typings.reactBigCalendar.reactBigCalendarStrings.LEFT
import typings.reactBigCalendar.reactBigCalendarStrings.RIGHT
import typings.reactBigCalendar.reactBigCalendarStrings.UP
import typings.reactBigCalendar.reactBigCalendarStrings.move
import typings.reactBigCalendar.reactBigCalendarStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[TEvent /* <: js.Object */] extends StObject {
  
  var action: resize | move
  
  var direction: UP | DOWN | LEFT | RIGHT
  
  var event: TEvent
}
object Action {
  
  inline def apply[TEvent /* <: js.Object */](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): Action[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action[?], TEvent /* <: js.Object */] (val x: Self & Action[TEvent]) extends AnyVal {
    
    inline def setAction(value: resize | move): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: UP | DOWN | LEFT | RIGHT): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
