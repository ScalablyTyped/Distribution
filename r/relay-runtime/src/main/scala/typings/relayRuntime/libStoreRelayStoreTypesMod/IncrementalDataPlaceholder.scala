package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder
  - typings.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends StObject
object IncrementalDataPlaceholder {
  
  inline def DeferPlaceholder(
    data: PayloadData,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): typings.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "defer", label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder]
  }
  
  inline def StreamPlaceholder(
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): typings.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = "stream", label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder]
  }
}
