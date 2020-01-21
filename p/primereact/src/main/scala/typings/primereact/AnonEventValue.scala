package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventValue extends js.Object {
  var event: Event_
  var value: js.Any
}

object AnonEventValue {
  @scala.inline
  def apply(event: Event_, value: js.Any): AnonEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventValue]
  }
}

