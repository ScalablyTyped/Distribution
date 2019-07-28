package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CReaderSelector[TReaderNode] extends js.Object {
  var dataID: DataID
  var node: TReaderNode
  var variables: Variables
}

object CReaderSelector {
  @scala.inline
  def apply[TReaderNode](dataID: DataID, node: TReaderNode, variables: Variables): CReaderSelector[TReaderNode] = {
    val __obj = js.Dynamic.literal(dataID = dataID, node = node.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[CReaderSelector[TReaderNode]]
  }
}

