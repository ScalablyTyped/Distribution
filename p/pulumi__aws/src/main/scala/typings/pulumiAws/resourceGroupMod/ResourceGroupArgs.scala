package typings.pulumiAws.resourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupArgs extends js.Object {
  /**
    * Key-value map of tags that are used to select the EC2 instances to be included in an [Amazon Inspector assessment target](https://www.terraform.io/docs/providers/aws/r/inspector_assessment_target.html).
    */
  val tags: Input[StringDictionary[_]] = js.native
}

object ResourceGroupArgs {
  @scala.inline
  def apply(tags: Input[StringDictionary[_]]): ResourceGroupArgs = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupArgs]
  }
}

