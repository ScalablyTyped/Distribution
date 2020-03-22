package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueNumber extends js.Object {
  var originalEvent: Event_
  var value: Double
}

object AnonValueNumber {
  @scala.inline
  def apply(originalEvent: Event_, value: Double): AnonValueNumber = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueNumber]
  }
}

