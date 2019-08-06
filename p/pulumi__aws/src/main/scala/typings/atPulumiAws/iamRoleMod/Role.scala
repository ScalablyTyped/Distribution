package typings.atPulumiAws.iamRoleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/role", "Role")
@js.native
class Role protected () extends CustomResource {
  /**
    * Create a Role resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RoleArgs) = this()
  def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: Output[String] = js.native
  /**
    * The policy that grants an entity permission to assume the role.
    */
  val assumeRolePolicy: Output[String] = js.native
  /**
    * The creation date of the IAM role.
    */
  val createDate: Output[String] = js.native
  /**
    * The description of the role.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
    */
  val forceDetachPolicies: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
    */
  val maxSessionDuration: Output[js.UndefOr[Double]] = js.native
  /**
    * The name of the role. If omitted, this provider will assign a random, unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The path to the role.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: Output[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of tags for the IAM role
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/role", "Role")
@js.native
object Role extends js.Object {
  /**
    * Get an existing Role resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Role = js.native
  def get(name: String, id: Input[ID], state: RoleState): Role = js.native
  def get(name: String, id: Input[ID], state: RoleState, opts: CustomResourceOptions): Role = js.native
  /**
    * Returns true if the given object is an instance of Role.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/role.Role */ Boolean = js.native
}

