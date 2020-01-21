package typings.pulumiAws.standardsSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsSubscriptionArgs extends js.Object {
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: Input[String] = js.native
}

object StandardsSubscriptionArgs {
  @scala.inline
  def apply(standardsArn: Input[String]): StandardsSubscriptionArgs = {
    val __obj = js.Dynamic.literal(standardsArn = standardsArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StandardsSubscriptionArgs]
  }
}

