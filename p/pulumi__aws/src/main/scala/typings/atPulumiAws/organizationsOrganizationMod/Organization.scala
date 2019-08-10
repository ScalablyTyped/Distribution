package typings.atPulumiAws.organizationsOrganizationMod

import typings.atPulumiAws.Anon_ArnEmail
import typings.atPulumiAws.Anon_ArnId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations/organization", "Organization")
@js.native
class Organization protected () extends CustomResource {
  /**
    * Create a Organization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: OrganizationArgs) = this()
  def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: Output[js.Array[Anon_ArnEmail]] = js.native
  /**
    * ARN of the root
    */
  val arn: Output[String] = js.native
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: Output[js.UndefOr[String]] = js.native
  /**
    * ARN of the master account
    */
  val masterAccountArn: Output[String] = js.native
  /**
    * Email address of the master account
    */
  val masterAccountEmail: Output[String] = js.native
  /**
    * Identifier of the master account
    */
  val masterAccountId: Output[String] = js.native
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: Output[js.Array[Anon_ArnEmail]] = js.native
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: Output[js.Array[Anon_ArnId]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/organizations/organization", "Organization")
@js.native
object Organization extends js.Object {
  /**
    * Get an existing Organization resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState): Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): Organization = js.native
  /**
    * Returns true if the given object is an instance of Organization.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
}

