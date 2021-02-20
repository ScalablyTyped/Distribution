package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScriptDagEdge extends StObject {
  
  /**
    * The ID of the node at which the edge starts.
    */
  var source: String = js.native
  
  /**
    * The ID of the node at which the edge ends.
    */
  var target: String = js.native
  
  /**
    * The target of the edge.
    */
  var targetParameter: js.UndefOr[String] = js.native
}
object GetScriptDagEdge {
  
  @scala.inline
  def apply(source: String, target: String): GetScriptDagEdge = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagEdge]
  }
  
  @scala.inline
  implicit class GetScriptDagEdgeMutableBuilder[Self <: GetScriptDagEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameter(value: String): Self = StObject.set(x, "targetParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameterUndefined: Self = StObject.set(x, "targetParameter", js.undefined)
  }
}
