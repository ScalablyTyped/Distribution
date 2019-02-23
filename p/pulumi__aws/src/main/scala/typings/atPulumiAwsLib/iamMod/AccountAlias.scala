package typings
package atPulumiAwsLib.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "AccountAlias")
@js.native
class AccountAlias protected ()
  extends atPulumiAwsLib.iamAccountAliasMod.AccountAlias {
  /**
    * Create a AccountAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountAliasMod.AccountAliasArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountAliasMod.AccountAliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "AccountAlias")
@js.native
object AccountAlias extends js.Object {
  /**
    * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccountAliasMod.AccountAliasState
  ): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccountAliasMod.AccountAliasState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
}

