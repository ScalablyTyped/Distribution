package typings.atPulumiAws.iotMod

import typings.atPulumiAws.iotRoleAliasMod.RoleAliasArgs
import typings.atPulumiAws.iotRoleAliasMod.RoleAliasState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "RoleAlias")
@js.native
class RoleAlias protected ()
  extends typings.atPulumiAws.iotRoleAliasMod.RoleAlias {
  /**
    * Create a RoleAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RoleAliasArgs) = this()
  def this(name: String, args: RoleAliasArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iot", "RoleAlias")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
  def get(name: String, id: Input[ID], state: RoleAliasState): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
  def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
  /**
    * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = js.native
}

