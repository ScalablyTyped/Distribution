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
    * Key-value map of tags for the Inspector assessment template.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    targetArn: Input[String]
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
  @scala.inline
  implicit class AssessmentTemplateArgsOps[Self <: AssessmentTemplateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Input[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesPackageArnsVarargs(value: Input[String]*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    @scala.inline
    def setRulesPackageArns(value: Input[js.Array[Input[String]]]): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

