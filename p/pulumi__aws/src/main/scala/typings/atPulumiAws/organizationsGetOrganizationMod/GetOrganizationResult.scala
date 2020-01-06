package typings.atPulumiAws.organizationsGetOrganizationMod

import typings.atPulumiAws.typesOutputMod.organizations.GetOrganizationAccount
import typings.atPulumiAws.typesOutputMod.organizations.GetOrganizationNonMasterAccount
import typings.atPulumiAws.typesOutputMod.organizations.GetOrganizationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationResult extends js.Object {
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: js.Array[GetOrganizationAccount] = js.native
  /**
    * ARN of the root
    */
  val arn: String = js.native
  /**
    * A list of AWS service principal names that have integration enabled with your organization. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.Array[String] = js.native
  /**
    * A list of Organizations policy types that are enabled in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: js.Array[String] = js.native
  /**
    * The FeatureSet of the organization.
    */
  val featureSet: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
    */
  val masterAccountArn: String = js.native
  /**
    * The email address that is associated with the AWS account that is designated as the master account for the organization.
    */
  val masterAccountEmail: String = js.native
  /**
    * The unique identifier (ID) of the master account of an organization.
    */
  val masterAccountId: String = js.native
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: js.Array[GetOrganizationNonMasterAccount] = js.native
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: js.Array[GetOrganizationRoot] = js.native
}

object GetOrganizationResult {
  @scala.inline
  def apply(
    accounts: js.Array[GetOrganizationAccount],
    arn: String,
    awsServiceAccessPrincipals: js.Array[String],
    enabledPolicyTypes: js.Array[String],
    featureSet: String,
    id: String,
    masterAccountArn: String,
    masterAccountEmail: String,
    masterAccountId: String,
    nonMasterAccounts: js.Array[GetOrganizationNonMasterAccount],
    roots: js.Array[GetOrganizationRoot]
  ): GetOrganizationResult = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], awsServiceAccessPrincipals = awsServiceAccessPrincipals.asInstanceOf[js.Any], enabledPolicyTypes = enabledPolicyTypes.asInstanceOf[js.Any], featureSet = featureSet.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], masterAccountArn = masterAccountArn.asInstanceOf[js.Any], masterAccountEmail = masterAccountEmail.asInstanceOf[js.Any], masterAccountId = masterAccountId.asInstanceOf[js.Any], nonMasterAccounts = nonMasterAccounts.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOrganizationResult]
  }
}

