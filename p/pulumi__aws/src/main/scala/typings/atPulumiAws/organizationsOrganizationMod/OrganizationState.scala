package typings.atPulumiAws.organizationsOrganizationMod

import typings.atPulumiAws.typesInputMod.organizations.OrganizationAccount
import typings.atPulumiAws.typesInputMod.organizations.OrganizationNonMasterAccount
import typings.atPulumiAws.typesInputMod.organizations.OrganizationRoot
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationState extends js.Object {
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationAccount]]]] = js.undefined
  /**
    * ARN of the root
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: js.UndefOr[Input[String]] = js.undefined
  /**
    * ARN of the master account
    */
  val masterAccountArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Email address of the master account
    */
  val masterAccountEmail: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of the master account
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: js.UndefOr[Input[js.Array[Input[OrganizationNonMasterAccount]]]] = js.undefined
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: js.UndefOr[Input[js.Array[Input[OrganizationRoot]]]] = js.undefined
}

object OrganizationState {
  @scala.inline
  def apply(
    accounts: Input[js.Array[Input[OrganizationAccount]]] = null,
    arn: Input[String] = null,
    awsServiceAccessPrincipals: Input[js.Array[Input[String]]] = null,
    enabledPolicyTypes: Input[js.Array[Input[String]]] = null,
    featureSet: Input[String] = null,
    masterAccountArn: Input[String] = null,
    masterAccountEmail: Input[String] = null,
    masterAccountId: Input[String] = null,
    nonMasterAccounts: Input[js.Array[Input[OrganizationNonMasterAccount]]] = null,
    roots: Input[js.Array[Input[OrganizationRoot]]] = null
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

