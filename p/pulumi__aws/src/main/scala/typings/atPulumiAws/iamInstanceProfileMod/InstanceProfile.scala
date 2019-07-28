package typings.atPulumiAws.iamInstanceProfileMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/instanceProfile", "InstanceProfile")
@js.native
class InstanceProfile protected () extends CustomResource {
  /**
    * Create a InstanceProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: InstanceProfileArgs) = this()
  def this(name: String, args: InstanceProfileArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS to the instance profile.
    */
  val arn: Output[String] = js.native
  /**
    * The creation timestamp of the instance profile.
    */
  val createDate: Output[String] = js.native
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * Path in which to create the profile.
    */
  val path: Output[js.UndefOr[String]] = js.native
  /**
    * The role name to include in the profile.
    */
  val role: Output[String] = js.native
  val roles: Output[js.Array[String]] = js.native
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/instanceProfile", "InstanceProfile")
@js.native
object InstanceProfile extends js.Object {
  /**
    * Get an existing InstanceProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): InstanceProfile = js.native
  def get(name: String, id: Input[ID], state: InstanceProfileState): InstanceProfile = js.native
  def get(name: String, id: Input[ID], state: InstanceProfileState, opts: CustomResourceOptions): InstanceProfile = js.native
  /**
    * Returns true if the given object is an instance of InstanceProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/instanceProfile.InstanceProfile */ Boolean = js.native
}

