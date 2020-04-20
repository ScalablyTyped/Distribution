package typings.prosemirrorView

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: Node
  var offset: Double
}

object AnonNode {
  @scala.inline
  def apply(node: Node, offset: Double): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

