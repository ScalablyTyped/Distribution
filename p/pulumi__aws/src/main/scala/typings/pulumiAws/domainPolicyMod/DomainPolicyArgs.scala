package typings.pulumiAws.domainPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainPolicyArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: Input[String | PolicyDocument] = js.native
  /**
    * Name of the domain.
    */
  val domainName: Input[String] = js.native
}

object DomainPolicyArgs {
  @scala.inline
  def apply(accessPolicies: Input[String | PolicyDocument], domainName: Input[String]): DomainPolicyArgs = {
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainPolicyArgs]
  }
  @scala.inline
  implicit class DomainPolicyArgsOps[Self <: DomainPolicyArgs] (val x: Self) extends AnyVal {
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
    def setAccessPolicies(value: Input[String | PolicyDocument]): Self = this.set("accessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
  }
  
}

