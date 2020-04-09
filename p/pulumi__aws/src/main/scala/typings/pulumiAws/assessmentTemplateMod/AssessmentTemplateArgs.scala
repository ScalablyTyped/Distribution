package typings.pulumiAws.assessmentTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
    * Key-value mapping of tags for the Inspector assessment template.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
}

