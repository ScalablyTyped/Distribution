package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputPathsInputTemplate extends js.Object {
  var inputPaths: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var inputTemplate: Input[String]
}

object Anon_InputPathsInputTemplate {
  @scala.inline
  def apply(inputTemplate: Input[String], inputPaths: Input[StringDictionary[_]] = null): Anon_InputPathsInputTemplate = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InputPathsInputTemplate]
  }
}

