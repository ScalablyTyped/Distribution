package typings
package atPulumiAwsLib.inspectorAssessmentTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTemplateArgs extends js.Object {
  /**
    * The duration of the inspector run.
    */
  val duration: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AssessmentTemplateArgs {
  @scala.inline
  def apply(
    duration: atPulumiPulumiLib.outputMod.Input[scala.Double],
    rulesPackageArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.updateDynamic("rulesPackageArns")(rulesPackageArns.asInstanceOf[js.Any])
    __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
}

