package typings.pulumiAws.logResourcePolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogResourcePolicyArgs extends js.Object {
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: Input[String] = js.native
  /**
    * Name of the resource policy.
    */
  val policyName: Input[String] = js.native
}

object LogResourcePolicyArgs {
  @scala.inline
  def apply(policyDocument: Input[String], policyName: Input[String]): LogResourcePolicyArgs = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogResourcePolicyArgs]
  }
  @scala.inline
  implicit class LogResourcePolicyArgsOps[Self <: LogResourcePolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyDocument(value: Input[String]): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyName(value: Input[String]): Self = this.set("policyName", value.asInstanceOf[js.Any])
  }
  
}

