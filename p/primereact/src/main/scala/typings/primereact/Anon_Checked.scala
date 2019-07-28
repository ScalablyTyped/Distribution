package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: Boolean
  var originalEvent: Event
  var value: js.Any
}

object Anon_Checked {
  @scala.inline
  def apply(checked: Boolean, originalEvent: Event, value: js.Any): Anon_Checked = {
    val __obj = js.Dynamic.literal(checked = checked, originalEvent = originalEvent, value = value)
  
    __obj.asInstanceOf[Anon_Checked]
  }
}

