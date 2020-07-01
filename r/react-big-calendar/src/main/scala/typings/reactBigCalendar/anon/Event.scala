package typings.reactBigCalendar.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[TEvent /* <: js.Object */] extends js.Object {
  var event: TEvent
  var style: CSSProperties
}

object Event {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](event: TEvent, style: CSSProperties): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
}

