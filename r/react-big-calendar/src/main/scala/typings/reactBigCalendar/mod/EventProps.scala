package typings.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventProps[TEvent /* <: js.Object */] extends js.Object {
  var event: TEvent
  var title: String
}

object EventProps {
  @scala.inline
  def apply[TEvent](event: TEvent, title: String): EventProps[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProps[TEvent]]
  }
}

