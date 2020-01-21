package typings.pulumiAws.productSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSubscriptionState extends js.Object {
  /**
    * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: js.UndefOr[Input[String]] = js.native
}

object ProductSubscriptionState {
  @scala.inline
  def apply(arn: Input[String] = null, productArn: Input[String] = null): ProductSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (productArn != null) __obj.updateDynamic("productArn")(productArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSubscriptionState]
  }
}

