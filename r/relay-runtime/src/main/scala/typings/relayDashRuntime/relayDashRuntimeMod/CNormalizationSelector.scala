package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CNormalizationSelector[TNormalizationNode] extends js.Object {
  var dataID: DataID
  var node: TNormalizationNode
  var variables: Variables
}

object CNormalizationSelector {
  @scala.inline
  def apply[TNormalizationNode](dataID: DataID, node: TNormalizationNode, variables: Variables): CNormalizationSelector[TNormalizationNode] = {
    val __obj = js.Dynamic.literal(dataID = dataID, node = node.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[CNormalizationSelector[TNormalizationNode]]
  }
}

