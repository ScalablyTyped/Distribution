package typings
package slateDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeType extends js.Object {
  var node: slateLib.slateMod.Node
  var `type`: slateDashReactLib.slateDashReactMod.SlateType
}

object Anon_NodeType {
  @scala.inline
  def apply(node: slateLib.slateMod.Node, `type`: slateDashReactLib.slateDashReactMod.SlateType): Anon_NodeType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NodeType]
  }
}

