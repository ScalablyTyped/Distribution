package typings
package atPulumiAwsLib.elasticsearchDomainPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainPolicyArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the domain.
    */
  val domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DomainPolicyArgs {
  @scala.inline
  def apply(
    accessPolicies: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): DomainPolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainPolicyArgs]
  }
}

