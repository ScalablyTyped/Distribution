package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventProps[T /* <: Event */] extends js.Object {
  var event: T
  var title: java.lang.String
}

object EventProps {
  @scala.inline
  def apply[T /* <: Event */](event: T, title: java.lang.String): EventProps[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[EventProps[T]]
  }
}

