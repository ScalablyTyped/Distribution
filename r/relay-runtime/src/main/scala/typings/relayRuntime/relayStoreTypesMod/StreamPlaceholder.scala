package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.relayRuntimeStrings.stream_
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamPlaceholder
  extends StObject
     with IncrementalDataPlaceholder {
  
  val kind: stream_
  
  val label: String
  
  val node: NormalizationSelectableNode
  
  val parentID: DataID
  
  val path: js.Array[String]
  
  val variables: Variables
}
object StreamPlaceholder {
  
  inline def apply(
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = "stream", label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamPlaceholder]
  }
  
  extension [Self <: StreamPlaceholder](x: Self) {
    
    inline def setKind(value: stream_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NormalizationSelectableNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParentID(value: DataID): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
