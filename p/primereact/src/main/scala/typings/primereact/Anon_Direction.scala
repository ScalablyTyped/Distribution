package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: String
  var originalEvent: Event
  var value: js.Any
}

object Anon_Direction {
  @scala.inline
  def apply(direction: String, originalEvent: Event, value: js.Any): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

