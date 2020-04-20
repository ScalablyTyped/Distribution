package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var event: Event_
  var source: js.Any
  var target: js.Any
}

object AnonSource {
  @scala.inline
  def apply(event: Event_, source: js.Any, target: js.Any): AnonSource = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

