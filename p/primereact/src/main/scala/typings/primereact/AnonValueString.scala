package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var originalEvent: Event_
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(originalEvent: Event_, value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

