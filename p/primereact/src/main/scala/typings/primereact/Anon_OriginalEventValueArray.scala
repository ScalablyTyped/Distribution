package typings.primereact

import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEventValueArray extends js.Object {
  var originalEvent: Event
  var value: Date | js.Array[Date]
}

object Anon_OriginalEventValueArray {
  @scala.inline
  def apply(originalEvent: Event, value: Date | js.Array[Date]): Anon_OriginalEventValueArray = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginalEventValueArray]
  }
}

