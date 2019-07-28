package typings.atPulumiAws.iamGetPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyArgs extends js.Object {
  /**
    * ARN of the IAM policy.
    */
  val arn: String
}

object GetPolicyArgs {
  @scala.inline
  def apply(arn: String): GetPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetPolicyArgs]
  }
}

