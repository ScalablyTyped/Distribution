package typings.pulumiAws.assessmentTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateState extends js.Object {
  /**
    * The template assessment ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The duration of the inspector run.
    */
  val duration: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value map of tags for the Inspector assessment template.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
}

object AssessmentTemplateState {
  @scala.inline
  def apply(): AssessmentTemplateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTemplateState]
  }
  @scala.inline
  implicit class AssessmentTemplateStateOps[Self <: AssessmentTemplateState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDuration(value: Input[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRulesPackageArnsVarargs(value: Input[String]*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    @scala.inline
    def setRulesPackageArns(value: Input[js.Array[Input[String]]]): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesPackageArns: Self = this.set("rulesPackageArns", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
  }
  
}

