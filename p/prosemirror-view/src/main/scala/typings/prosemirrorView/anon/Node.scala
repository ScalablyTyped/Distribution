package typings.prosemirrorView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typings.std.Node
  var offset: Double
}

object Node {
  @scala.inline
  def apply(node: typings.std.Node, offset: Double): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

