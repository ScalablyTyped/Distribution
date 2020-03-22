package typings.primereact

import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventTarget extends js.Object {
  var originalEvent: Event_
  var target: AnonName
  var value: Date | js.Array[Date]
}

object AnonOriginalEventTarget {
  @scala.inline
  def apply(originalEvent: Event_, target: AnonName, value: Date | js.Array[Date]): AnonOriginalEventTarget = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventTarget]
  }
}

