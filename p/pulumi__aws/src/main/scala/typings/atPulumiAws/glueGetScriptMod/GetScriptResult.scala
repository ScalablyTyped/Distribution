package typings.atPulumiAws.glueGetScriptMod

import typings.atPulumiAws.Anon_ArgsId
import typings.atPulumiAws.Anon_Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptResult extends js.Object {
  val dagEdges: js.Array[Anon_Source]
  val dagNodes: js.Array[Anon_ArgsId]
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
    dagEdges: js.Array[Anon_Source],
    dagNodes: js.Array[Anon_ArgsId],
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

