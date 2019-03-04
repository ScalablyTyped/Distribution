package typings
package atPulumiAwsLib.securityhubProductSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductSubscriptionArgs extends js.Object {
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ProductSubscriptionArgs {
  @scala.inline
  def apply(productArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]): ProductSubscriptionArgs = {
    val __obj = js.Dynamic.literal(productArn = productArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProductSubscriptionArgs]
  }
}

