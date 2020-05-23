package typings.primereact.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventTarget extends js.Object {
  var originalEvent: typings.std.Event
  var target: Name
  var value: Date | js.Array[Date]
}

object OriginalEventTarget {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: Name, value: Date | js.Array[Date]): OriginalEventTarget = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTarget]
  }
}

