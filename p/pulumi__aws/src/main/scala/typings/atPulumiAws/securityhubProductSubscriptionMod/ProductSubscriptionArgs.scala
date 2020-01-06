package typings.atPulumiAws.securityhubProductSubscriptionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSubscriptionArgs extends js.Object {
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: Input[String] = js.native
}

object ProductSubscriptionArgs {
  @scala.inline
  def apply(productArn: Input[String]): ProductSubscriptionArgs = {
    val __obj = js.Dynamic.literal(productArn = productArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProductSubscriptionArgs]
  }
}

