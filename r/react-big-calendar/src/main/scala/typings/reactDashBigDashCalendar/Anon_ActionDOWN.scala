package typings.reactDashBigDashCalendar

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DOWN
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.LEFT
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.RIGHT
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.UP
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.move
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionDOWN[TEvent /* <: js.Object */] extends js.Object {
  var action: resize | move
  var direction: UP | DOWN | LEFT | RIGHT
  var event: TEvent
}

object Anon_ActionDOWN {
  @scala.inline
  def apply[TEvent /* <: js.Object */](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): Anon_ActionDOWN[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionDOWN[TEvent]]
  }
}

