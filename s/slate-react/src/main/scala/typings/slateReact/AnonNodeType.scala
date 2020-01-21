package typings.slateReact

import typings.slate.mod.Node
import typings.slateReact.mod.SlateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeType extends js.Object {
  var node: Node
  var `type`: SlateType
}

object AnonNodeType {
  @scala.inline
  def apply(node: Node, `type`: SlateType): AnonNodeType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeType]
  }
}

