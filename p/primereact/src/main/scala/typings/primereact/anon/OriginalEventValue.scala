package typings.primereact.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventValue extends js.Object {
  var originalEvent: typings.std.Event
  var value: Date
}

object OriginalEventValue {
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: Date): OriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventValue]
  }
}

