package typings.slateDashReact

import typings.slate.slateMod.Node
import typings.slateDashReact.slateDashReactMod.SlateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: Node
  var `type`: SlateType
}

object Anon_Node {
  @scala.inline
  def apply(node: Node, `type`: SlateType): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Node]
  }
}

