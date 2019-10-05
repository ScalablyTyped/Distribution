package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createNormalizationSelector")
@js.native
object createNormalizationSelector extends js.Object {
  def apply(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
}

