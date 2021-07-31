package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationSelector extends StObject {
  
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
  
  @scala.inline
  implicit class NormalizationSelectorMutableBuilder[Self <: NormalizationSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: NormalizationSelectableNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
