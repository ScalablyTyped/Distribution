package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var originalEvent: Event_
  var target: AnonId
  var value: js.Any
}

object AnonTarget {
  @scala.inline
  def apply(originalEvent: Event_, target: AnonId, value: js.Any): AnonTarget = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

