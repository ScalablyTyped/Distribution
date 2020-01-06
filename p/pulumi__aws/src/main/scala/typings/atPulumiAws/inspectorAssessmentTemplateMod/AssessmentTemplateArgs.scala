package typings.atPulumiAws.inspectorAssessmentTemplateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateArgs extends js.Object {
  /**
    * The duration of the inspector run.
    */
  val duration: Input[Double] = js.native
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: Input[js.Array[Input[String]]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: Input[String] = js.native
}

object AssessmentTemplateArgs {
  @scala.inline
  def apply(
    duration: Input[Double],
    rulesPackageArns: Input[js.Array[Input[String]]],
    targetArn: Input[String],
    name: Input[String] = null
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
}

