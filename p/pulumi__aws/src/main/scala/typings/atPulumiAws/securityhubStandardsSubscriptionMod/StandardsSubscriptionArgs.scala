package typings.atPulumiAws.securityhubStandardsSubscriptionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardsSubscriptionArgs extends js.Object {
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: Input[String]
}

object StandardsSubscriptionArgs {
  @scala.inline
  def apply(standardsArn: Input[String]): StandardsSubscriptionArgs = {
    val __obj = js.Dynamic.literal(standardsArn = standardsArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StandardsSubscriptionArgs]
  }
}

