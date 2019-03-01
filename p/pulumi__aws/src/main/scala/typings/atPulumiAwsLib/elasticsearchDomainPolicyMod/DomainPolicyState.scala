package typings
package atPulumiAwsLib.elasticsearchDomainPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainPolicyState extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DomainPolicyState {
  @scala.inline
  def apply(
    accessPolicies: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DomainPolicyState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainPolicyState]
  }
}

