package typings.primereact

import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventEvent extends js.Object {
  var originalEvent: Event_
  var value: Date | js.Array[Date]
}

object AnonOriginalEventEvent {
  @scala.inline
  def apply(originalEvent: Event_, value: Date | js.Array[Date]): AnonOriginalEventEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventEvent]
  }
}

