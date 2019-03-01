package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonPathInput extends js.Object {
  var jsonPath: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_JsonPathInput {
  @scala.inline
  def apply(jsonPath: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_JsonPathInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jsonPath")(jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JsonPathInput]
  }
}

