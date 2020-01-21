package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventValueEvent extends js.Object {
  var originalEvent: Event_
  var value: String
}

object AnonOriginalEventValueEvent {
  @scala.inline
  def apply(originalEvent: Event_, value: String): AnonOriginalEventValueEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventValueEvent]
  }
}

