package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationSelector extends StObject {
  
  val dataID: DataID
  
  val node: NormalizationSelectableNode
  
  val variables: Variables
}
object NormalizationSelector {
  
  inline def apply(dataID: DataID, node: NormalizationSelectableNode, variables: Variables): NormalizationSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelector]
  }
  
  extension [Self <: NormalizationSelector](x: Self) {
    
    inline def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NormalizationSelectableNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
