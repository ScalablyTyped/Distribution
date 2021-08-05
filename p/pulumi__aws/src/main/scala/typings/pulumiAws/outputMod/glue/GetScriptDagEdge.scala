package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptDagEdge extends StObject {
  
  /**
    * The ID of the node at which the edge starts.
    */
  var source: String
  
  /**
    * The ID of the node at which the edge ends.
    */
  var target: String
  
  /**
    * The target of the edge.
    */
  var targetParameter: js.UndefOr[String] = js.undefined
}
object GetScriptDagEdge {
  
  inline def apply(source: String, target: String): GetScriptDagEdge = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagEdge]
  }
  
  extension [Self <: GetScriptDagEdge](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetParameter(value: String): Self = StObject.set(x, "targetParameter", value.asInstanceOf[js.Any])
    
    inline def setTargetParameterUndefined: Self = StObject.set(x, "targetParameter", js.undefined)
  }
}
