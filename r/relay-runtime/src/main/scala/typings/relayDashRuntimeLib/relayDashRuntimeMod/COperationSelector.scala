package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COperationSelector[TNode, TOperation] extends js.Object {
  var fragment: CSelector[TNode]
  var node: TOperation
  var root: CSelector[TNode]
  var variables: Variables
}

object COperationSelector {
  @scala.inline
  def apply[TNode, TOperation](fragment: CSelector[TNode], node: TOperation, root: CSelector[TNode], variables: Variables): COperationSelector[TNode, TOperation] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fragment")(fragment)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[COperationSelector[TNode, TOperation]]
  }
}

