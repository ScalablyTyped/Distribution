package typings
package atPulumiAwsLib.glueGetScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
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
  def apply(id: java.lang.String, pythonScript: java.lang.String, scalaCode: java.lang.String): GetScriptResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("pythonScript")(pythonScript)
    __obj.updateDynamic("scalaCode")(scalaCode)
    __obj.asInstanceOf[GetScriptResult]
  }
}

