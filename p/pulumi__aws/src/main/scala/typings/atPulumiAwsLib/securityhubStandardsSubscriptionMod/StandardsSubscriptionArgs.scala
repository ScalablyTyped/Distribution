package typings
package atPulumiAwsLib.securityhubStandardsSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardsSubscriptionArgs extends js.Object {
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object StandardsSubscriptionArgs {
  @scala.inline
  def apply(standardsArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]): StandardsSubscriptionArgs = {
    val __obj = js.Dynamic.literal(standardsArn = standardsArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StandardsSubscriptionArgs]
  }
}

