package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSelector[TNode] extends js.Object {
  var dataID: DataID
  var node: TNode
  var variables: Variables
}

object CSelector {
  @scala.inline
  def apply[TNode](dataID: DataID, node: TNode, variables: Variables): CSelector[TNode] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataID")(dataID)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[CSelector[TNode]]
  }
}

