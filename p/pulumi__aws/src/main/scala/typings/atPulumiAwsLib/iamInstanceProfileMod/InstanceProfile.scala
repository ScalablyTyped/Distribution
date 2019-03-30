package typings
package atPulumiAwsLib.iamInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/instanceProfile", "InstanceProfile")
@js.native
class InstanceProfile protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a InstanceProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: InstanceProfileArgs) = this()
  def this(name: java.lang.String, args: InstanceProfileArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS to the instance profile.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The creation timestamp of the instance profile.
    */
  val createDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The profile's name. If omitted, Terraform will assign a random, unique name.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Path in which to create the profile.
    */
  val path: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The role name to include in the profile.
    */
  val role: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    *
    * A list of role names to include in the profile.  The current default is 1.  If you see an error message similar to `Cannot exceed quota for InstanceSessionsPerInstanceProfile: 1`, then you must contact AWS support and ask for a limit increase.
    * WARNING: This is deprecated since [version 0.9.3 (April 12, 2017)](https://github.com/hashicorp/terraform/blob/master/CHANGELOG.md#093-april-12-2017), as >= 2 roles are not possible. See [issue #11575](https://github.com/hashicorp/terraform/issues/11575).
    */
  val roles: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileState
  ): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
}

