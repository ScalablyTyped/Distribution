package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: Event_
  var value: Boolean
}

object AnonEvent {
  @scala.inline
  def apply(event: Event_, value: Boolean): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

