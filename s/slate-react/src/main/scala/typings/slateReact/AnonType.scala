package typings.slateReact

import typings.slate.mod.Node
import typings.slateReact.mod.SlateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var node: Node
  var `type`: SlateType
}

object AnonType {
  @scala.inline
  def apply(node: Node, `type`: SlateType): AnonType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

