package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var data: js.Any
  var originalEvent: Event_
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(data: js.Any, originalEvent: Event_, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

