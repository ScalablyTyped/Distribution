package typings
package atPulumiAwsLib.glueGetScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptResult extends js.Object {
  val dagEdges: js.Array[atPulumiAwsLib.Anon_Source]
  val dagNodes: js.Array[atPulumiAwsLib.Anon_ArgsId]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
    */
  val pythonScript: java.lang.String
  /**
    * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
    */
  val scalaCode: java.lang.String
}

object GetScriptResult {
  @scala.inline
  def apply(
    dagEdges: js.Array[atPulumiAwsLib.Anon_Source],
    dagNodes: js.Array[atPulumiAwsLib.Anon_ArgsId],
    id: java.lang.String,
    pythonScript: java.lang.String,
    scalaCode: java.lang.String,
    language: java.lang.String = null
  ): GetScriptResult = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges, dagNodes = dagNodes, id = id, pythonScript = pythonScript, scalaCode = scalaCode)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GetScriptResult]
  }
}

