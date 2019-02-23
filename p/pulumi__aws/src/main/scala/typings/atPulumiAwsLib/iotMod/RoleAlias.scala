package typings
package atPulumiAwsLib.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "RoleAlias")
@js.native
class RoleAlias protected ()
  extends atPulumiAwsLib.iotRoleAliasMod.RoleAlias {
  /**
    * Create a RoleAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.iotRoleAliasMod.RoleAliasArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.iotRoleAliasMod.RoleAliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotRoleAliasMod.RoleAliasState
  ): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotRoleAliasMod.RoleAliasState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
}

