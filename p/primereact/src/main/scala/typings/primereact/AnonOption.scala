package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOption extends js.Object {
  var option: js.Object
  var originalEvent: Event_
}

object AnonOption {
  @scala.inline
  def apply(option: js.Object, originalEvent: Event_): AnonOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOption]
  }
}

