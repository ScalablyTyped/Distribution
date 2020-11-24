package typings.pulumiAws.getScriptMod

import typings.pulumiAws.inputMod.glue.GetScriptDagEdge
import typings.pulumiAws.inputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScriptArgs extends js.Object {
  
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[GetScriptDagEdge] = js.native
  
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[GetScriptDagNode] = js.native
  
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[String] = js.native
}
object GetScriptArgs {
  
  @scala.inline
  def apply(dagEdges: js.Array[GetScriptDagEdge], dagNodes: js.Array[GetScriptDagNode]): GetScriptArgs = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptArgs]
  }
  
  @scala.inline
  implicit class GetScriptArgsOps[Self <: GetScriptArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDagEdgesVarargs(value: GetScriptDagEdge*): Self = this.set("dagEdges", js.Array(value :_*))
    
    @scala.inline
    def setDagEdges(value: js.Array[GetScriptDagEdge]): Self = this.set("dagEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagNodesVarargs(value: GetScriptDagNode*): Self = this.set("dagNodes", js.Array(value :_*))
    
    @scala.inline
    def setDagNodes(value: js.Array[GetScriptDagNode]): Self = this.set("dagNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
