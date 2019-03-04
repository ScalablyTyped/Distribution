package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputPathsInputTemplate extends js.Object {
  var inputPaths: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var inputTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_InputPathsInputTemplate {
  @scala.inline
  def apply(
    inputTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    inputPaths: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_InputPathsInputTemplate = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InputPathsInputTemplate]
  }
}

