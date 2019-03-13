package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventProps[TEvent /* <: Event */] extends js.Object {
  var event: TEvent
  var title: java.lang.String
}

object EventProps {
  @scala.inline
  def apply[TEvent /* <: Event */](event: TEvent, title: java.lang.String): EventProps[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[EventProps[TEvent]]
  }
}

