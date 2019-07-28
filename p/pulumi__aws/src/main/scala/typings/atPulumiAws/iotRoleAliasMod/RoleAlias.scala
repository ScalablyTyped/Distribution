package typings.atPulumiAws.iotRoleAliasMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/roleAlias", "RoleAlias")
@js.native
class RoleAlias protected () extends CustomResource {
  /**
    * Create a RoleAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RoleAliasArgs) = this()
  def this(name: String, args: RoleAliasArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the role alias.
    */
  val alias: Output[String] = js.native
  /**
    * The ARN assigned by AWS to this role alias.
    */
  val arn: Output[String] = js.native
  /**
    * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
    */
  val credentialDuration: Output[js.UndefOr[Double]] = js.native
  /**
    * The identity of the role to which the alias refers.
    */
  val roleArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/roleAlias", "RoleAlias")
@js.native
object RoleAlias extends js.Object {
  /**
    * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): RoleAlias = js.native
  def get(name: String, id: Input[ID], state: RoleAliasState): RoleAlias = js.native
  def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): RoleAlias = js.native
  /**
    * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = js.native
}

