package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: js.Any
  var originalEvent: Event
}

object Anon_Node {
  @scala.inline
  def apply(node: js.Any, originalEvent: Event): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node, originalEvent = originalEvent)
  
    __obj.asInstanceOf[Anon_Node]
  }
}

