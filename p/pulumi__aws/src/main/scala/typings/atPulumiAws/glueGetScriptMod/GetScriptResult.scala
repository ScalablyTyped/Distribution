package typings.atPulumiAws.glueGetScriptMod

import typings.atPulumiAws.typesOutputMod.glue.GetScriptDagEdge
import typings.atPulumiAws.typesOutputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptResult extends js.Object {
  val dagEdges: js.Array[GetScriptDagEdge]
  val dagNodes: js.Array[GetScriptDagNode]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val language: js.UndefOr[String] = js.undefined
  /**
    * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
    */
  val pythonScript: String
  /**
    * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
    */
  val scalaCode: String
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
    val __obj = js.Dynamic.literal(dagEdges = dagEdges, dagNodes = dagNodes, id = id, pythonScript = pythonScript, scalaCode = scalaCode)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GetScriptResult]
  }
}

