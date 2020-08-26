package typings.pulumiAws.userGroupMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userGroup", "UserGroup")
@js.native
class UserGroup protected () extends CustomResource {
  /**
    * Create a UserGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserGroupArgs) = this()
  def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The description of the user group.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the user group.
    */
  val name: Output_[String] = js.native
  /**
    * The precedence of the user group.
    */
  val precedence: Output_[js.UndefOr[Double]] = js.native
  /**
    * The ARN of the IAM role to be associated with the user group.
    */
  val roleArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The user pool ID.
    */
  val userPoolId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/userGroup", "UserGroup")
@js.native
object UserGroup extends js.Object {
  /**
    * Get an existing UserGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UserGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserGroup = js.native
  def get(name: String, id: Input[ID], state: UserGroupState): UserGroup = js.native
  def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): UserGroup = js.native
  /**
    * Returns true if the given object is an instance of UserGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
}

