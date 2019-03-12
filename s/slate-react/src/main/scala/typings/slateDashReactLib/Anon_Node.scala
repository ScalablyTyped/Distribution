package typings
package slateDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: slateLib.slateMod.Node
  var `type`: slateDashReactLib.slateDashReactMod.SlateType
}

object Anon_Node {
  @scala.inline
  def apply(node: slateLib.slateMod.Node, `type`: slateDashReactLib.slateDashReactMod.SlateType): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Node]
  }
}

