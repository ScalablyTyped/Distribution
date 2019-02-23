package typings
package atPulumiAwsLib.inspectorAssessmentTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTargetArgs extends js.Object {
  /**
    * The name of the assessment target.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  val resourceGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

