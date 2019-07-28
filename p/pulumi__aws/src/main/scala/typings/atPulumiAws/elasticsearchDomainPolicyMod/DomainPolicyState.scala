package typings.atPulumiAws.elasticsearchDomainPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainPolicyState extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[Input[String]] = js.undefined
}

object DomainPolicyState {
  @scala.inline
  def apply(accessPolicies: Input[String | PolicyDocument] = null, domainName: Input[String] = null): DomainPolicyState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainPolicyState]
  }
}

