package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetValue extends js.Object {
  var originalEvent: Event_
  var target: AnonIdName
  var value: Boolean
}

object AnonTargetValue {
  @scala.inline
  def apply(originalEvent: Event_, target: AnonIdName, value: Boolean): AnonTargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetValue]
  }
}

