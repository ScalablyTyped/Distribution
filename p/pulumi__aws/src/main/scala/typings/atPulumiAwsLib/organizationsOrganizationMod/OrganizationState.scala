package typings
package atPulumiAwsLib.organizationsOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationState extends js.Object {
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
    */
  val accounts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnEmailId]]]
  ] = js.undefined
  /**
    * ARN of the root
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: js.UndefOr[
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
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnEmailId]]]
  ] = js.undefined
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnIdName]]]
  ] = js.undefined
}

object OrganizationState {
  @scala.inline
  def apply(
    accounts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnEmailId]]] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    awsServiceAccessPrincipals: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    enabledPolicyTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    featureSet: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountEmail: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    nonMasterAccounts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnEmailId]]] = null,
    roots: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnIdName]]] = null
  ): OrganizationState = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsServiceAccessPrincipals != null) __obj.updateDynamic("awsServiceAccessPrincipals")(awsServiceAccessPrincipals.asInstanceOf[js.Any])
    if (enabledPolicyTypes != null) __obj.updateDynamic("enabledPolicyTypes")(enabledPolicyTypes.asInstanceOf[js.Any])
    if (featureSet != null) __obj.updateDynamic("featureSet")(featureSet.asInstanceOf[js.Any])
    if (masterAccountArn != null) __obj.updateDynamic("masterAccountArn")(masterAccountArn.asInstanceOf[js.Any])
    if (masterAccountEmail != null) __obj.updateDynamic("masterAccountEmail")(masterAccountEmail.asInstanceOf[js.Any])
    if (masterAccountId != null) __obj.updateDynamic("masterAccountId")(masterAccountId.asInstanceOf[js.Any])
    if (nonMasterAccounts != null) __obj.updateDynamic("nonMasterAccounts")(nonMasterAccounts.asInstanceOf[js.Any])
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationState]
  }
}

