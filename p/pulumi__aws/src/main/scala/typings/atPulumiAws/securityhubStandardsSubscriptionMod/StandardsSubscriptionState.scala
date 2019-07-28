package typings.atPulumiAws.securityhubStandardsSubscriptionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardsSubscriptionState extends js.Object {
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: js.UndefOr[Input[String]] = js.undefined
}

object StandardsSubscriptionState {
  @scala.inline
  def apply(standardsArn: Input[String] = null): StandardsSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (standardsArn != null) __obj.updateDynamic("standardsArn")(standardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscriptionState]
  }
}

