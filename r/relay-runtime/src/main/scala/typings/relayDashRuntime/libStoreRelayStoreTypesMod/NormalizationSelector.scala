package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationSelector extends js.Object {
  var dataID: String
  var node: NormalizationSelectableNode
  var variables: Variables
}

object NormalizationSelector {
  @scala.inline
  def apply(dataID: String, node: NormalizationSelectableNode, variables: Variables): NormalizationSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID, node = node, variables = variables)
  
    __obj.asInstanceOf[NormalizationSelector]
  }
}

