package typings.pulumiAws.getScriptMod

import typings.pulumiAws.outputMod.glue.GetScriptDagEdge
import typings.pulumiAws.outputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptResult extends js.Object {
  val dagEdges: js.Array[GetScriptDagEdge] = js.native
  val dagNodes: js.Array[GetScriptDagNode] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val language: js.UndefOr[String] = js.native
  /**
    * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
    */
  val pythonScript: String = js.native
  /**
    * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
    */
  val scalaCode: String = js.native
}

object GetScriptResult {
  @scala.inline
  def apply(
    dagEdges: js.Array[GetScriptDagEdge],
    dagNodes: js.Array[GetScriptDagNode],
    id: String,
    pythonScript: String,
    scalaCode: String
  ): GetScriptResult = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pythonScript = pythonScript.asInstanceOf[js.Any], scalaCode = scalaCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptResult]
  }
  @scala.inline
  implicit class GetScriptResultOps[Self <: GetScriptResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPythonScript(value: String): Self = this.set("pythonScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalaCode(value: String): Self = this.set("scalaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

