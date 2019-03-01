package typings
package atPulumiAwsLib.organizationsOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationState extends js.Object {
  /**
    * ARN of the organization
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * ARN of the master account
    */
  val masterAccountArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Email address of the master account
    */
  val masterAccountEmail: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of the master account
    */
  val masterAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object OrganizationState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    awsServiceAccessPrincipals: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    featureSet: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountEmail: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): OrganizationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsServiceAccessPrincipals != null) __obj.updateDynamic("awsServiceAccessPrincipals")(awsServiceAccessPrincipals.asInstanceOf[js.Any])
    if (featureSet != null) __obj.updateDynamic("featureSet")(featureSet.asInstanceOf[js.Any])
    if (masterAccountArn != null) __obj.updateDynamic("masterAccountArn")(masterAccountArn.asInstanceOf[js.Any])
    if (masterAccountEmail != null) __obj.updateDynamic("masterAccountEmail")(masterAccountEmail.asInstanceOf[js.Any])
    if (masterAccountId != null) __obj.updateDynamic("masterAccountId")(masterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationState]
  }
}

