package typings.primereact

import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventValue extends js.Object {
  var originalEvent: Event_
  var value: Date
}

object AnonOriginalEventValue {
  @scala.inline
  def apply(originalEvent: Event_, value: Date): AnonOriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventValue]
  }
}

