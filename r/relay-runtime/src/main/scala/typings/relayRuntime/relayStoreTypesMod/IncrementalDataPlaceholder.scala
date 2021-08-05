package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayStoreTypesMod.DeferPlaceholder
  - typings.relayRuntime.relayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends StObject
object IncrementalDataPlaceholder {
  
  inline def DeferPlaceholder(
    data: PayloadData,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): typings.relayRuntime.relayStoreTypesMod.DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "defer", label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.relayStoreTypesMod.DeferPlaceholder]
  }
  
  inline def StreamPlaceholder(
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): typings.relayRuntime.relayStoreTypesMod.StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = "stream", label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.relayStoreTypesMod.StreamPlaceholder]
  }
}
