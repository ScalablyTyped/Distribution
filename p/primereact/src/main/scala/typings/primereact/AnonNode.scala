package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: js.Any
  var originalEvent: Event_
}

object AnonNode {
  @scala.inline
  def apply(node: js.Any, originalEvent: Event_): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

