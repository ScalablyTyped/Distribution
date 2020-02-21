package typings.pulumiAws.resourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupState extends js.Object {
  /**
    * The resource group ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of tags that are used to select the EC2 instances to be included in an [Amazon Inspector assessment target](https://www.terraform.io/docs/providers/aws/r/inspector_assessment_target.html).
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResourceGroupState {
  @scala.inline
  def apply(arn: Input[String] = null, tags: Input[StringDictionary[_]] = null): ResourceGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupState]
  }
}

