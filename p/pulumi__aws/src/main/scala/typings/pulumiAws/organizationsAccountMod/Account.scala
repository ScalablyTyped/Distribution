package typings.pulumiAws.organizationsAccountMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations/account", "Account")
@js.native
class Account protected () extends CustomResource {
  /**
    * Create a Account resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccountArgs) = this()
  def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN for this account.
    */
  val arn: Output_[String] = js.native
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
    */
  val email: Output_[String] = js.native
  /**
    * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
    */
  val iamUserAccessToBilling: Output_[js.UndefOr[String]] = js.native
  val joinedMethod: Output_[String] = js.native
  val joinedTimestamp: Output_[String] = js.native
  /**
    * A friendly name for the member account.
    */
  val name: Output_[String] = js.native
  /**
    * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
    */
  val parentId: Output_[String] = js.native
  /**
    * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
    */
  val roleName: Output_[js.UndefOr[String]] = js.native
  val status: Output_[String] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/organizations/account", "Account")
@js.native
object Account extends js.Object {
  /**
    * Get an existing Account resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Account = js.native
  def get(name: String, id: Input[ID], state: AccountState): Account = js.native
  def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): Account = js.native
  /**
    * Returns true if the given object is an instance of Account.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = js.native
}

