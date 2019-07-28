package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEventValue extends js.Object {
  var originalEvent: Event
  var value: js.Any
}

object Anon_OriginalEventValue {
  @scala.inline
  def apply(originalEvent: Event, value: js.Any): Anon_OriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, value = value)
  
    __obj.asInstanceOf[Anon_OriginalEventValue]
  }
}

