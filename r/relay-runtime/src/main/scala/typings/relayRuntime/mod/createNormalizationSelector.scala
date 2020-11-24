package typings.relayRuntime.mod

import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.NormalizationSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "createNormalizationSelector")
@js.native
object createNormalizationSelector extends js.Object {
  
  def apply(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
}
