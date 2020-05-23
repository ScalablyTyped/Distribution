package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: js.Any
  var originalEvent: typings.std.Event
}

object Node {
  @scala.inline
  def apply(node: js.Any, originalEvent: typings.std.Event): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

