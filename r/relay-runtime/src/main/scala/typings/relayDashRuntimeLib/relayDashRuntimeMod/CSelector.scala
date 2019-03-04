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
    val __obj = js.Dynamic.literal(dataID = dataID, node = node.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[CSelector[TNode]]
  }
}

