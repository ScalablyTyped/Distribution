package typings.pulumiAws.quicksightUserMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/quicksight/user", "User")
@js.native
class User protected () extends CustomResource {
  /**
    * Create a User resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserArgs) = this()
  def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the user
    */
  val arn: Output_[String] = js.native
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: Output_[String] = js.native
  /**
    * The email address of the user that you want to register.
    */
  val email: Output_[String] = js.native
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
    */
  val iamArn: Output_[js.UndefOr[String]] = js.native
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
    */
  val identityType: Output_[String] = js.native
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
    */
  val sessionName: Output_[js.UndefOr[String]] = js.native
  /**
    * The Amazon QuickSight user name that you want to create for the user you are registering.
    */
  val userName: Output_[js.UndefOr[String]] = js.native
  /**
    * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
    */
  val userRole: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/quicksight/user", "User")
@js.native
object User extends js.Object {
  /**
    * Get an existing User resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): User = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): User = js.native
  def get(name: String, id: Input[ID], state: UserState): User = js.native
  def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): User = js.native
  /**
    * Returns true if the given object is an instance of User.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/user.User */ Boolean = js.native
}

