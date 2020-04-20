package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationSelector extends js.Object {
  val dataID: DataID
  val node: NormalizationSelectableNode
  val variables: Variables
}

object NormalizationSelector {
  @scala.inline
  def apply(dataID: DataID, node: NormalizationSelectableNode, variables: Variables): NormalizationSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelector]
  }
}

