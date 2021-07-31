package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptDagNode extends StObject {
  
  /**
    * Nested configuration an argument or property of a node. Defined below.
    */
  var args: js.Array[GetScriptDagNodeArg]
  
  /**
    * A node identifier that is unique within the node's graph.
    */
  var id: String
  
  /**
    * The line number of the node.
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of node this is.
    */
  var nodeType: String
}
object GetScriptDagNode {
  
  @scala.inline
  def apply(args: js.Array[GetScriptDagNodeArg], id: String, nodeType: String): GetScriptDagNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNode]
  }
  
  @scala.inline
  implicit class GetScriptDagNodeMutableBuilder[Self <: GetScriptDagNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[GetScriptDagNodeArg]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: GetScriptDagNodeArg*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
  }
}
