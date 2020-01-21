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
    * id is the provider-assigned unique ID for this managed resource.
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
    scalaCode: String,
    language: String = null
  ): GetScriptResult = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pythonScript = pythonScript.asInstanceOf[js.Any], scalaCode = scalaCode.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptResult]
  }
}

