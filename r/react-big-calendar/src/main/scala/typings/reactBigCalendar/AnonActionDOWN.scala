package typings.reactBigCalendar

import typings.reactBigCalendar.reactBigCalendarStrings.DOWN
import typings.reactBigCalendar.reactBigCalendarStrings.LEFT
import typings.reactBigCalendar.reactBigCalendarStrings.RIGHT
import typings.reactBigCalendar.reactBigCalendarStrings.UP
import typings.reactBigCalendar.reactBigCalendarStrings.move
import typings.reactBigCalendar.reactBigCalendarStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionDOWN[TEvent /* <: js.Object */] extends js.Object {
  var action: resize | move
  var direction: UP | DOWN | LEFT | RIGHT
  var event: TEvent
}

object AnonActionDOWN {
  @scala.inline
  def apply[TEvent /* <: js.Object */](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): AnonActionDOWN[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionDOWN[TEvent]]
  }
}

