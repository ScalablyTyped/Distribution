package typings
package atPulumiAwsLib.iamGetPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyArgs extends js.Object {
  /**
    * ARN of the IAM policy.
    */
  val arn: java.lang.String
}

object GetPolicyArgs {
  @scala.inline
  def apply(arn: java.lang.String): GetPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetPolicyArgs]
  }
}

