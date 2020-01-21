package typings.pulumiAws.assessmentTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTargetArgs extends js.Object {
  /**
    * The name of the assessment target.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  val resourceGroupArn: js.UndefOr[Input[String]] = js.native
}

object AssessmentTargetArgs {
  @scala.inline
  def apply(name: Input[String] = null, resourceGroupArn: Input[String] = null): AssessmentTargetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTargetArgs]
  }
}

