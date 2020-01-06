package typings.atPulumiAws.iamGetPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyArgs extends js.Object {
  /**
    * ARN of the IAM policy.
    */
  val arn: String = js.native
}

object GetPolicyArgs {
  @scala.inline
  def apply(arn: String): GetPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPolicyArgs]
  }
}

