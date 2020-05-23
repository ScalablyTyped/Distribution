package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var originalEvent: typings.std.Event
  var target: Id
  var value: js.Any
}

object Target {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: Id, value: js.Any): Target = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

