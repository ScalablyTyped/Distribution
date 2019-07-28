package typings.atPulumiAws.iamMod

import typings.atPulumiAws.iamAccountAliasMod.AccountAliasArgs
import typings.atPulumiAws.iamAccountAliasMod.AccountAliasState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "AccountAlias")
@js.native
class AccountAlias protected ()
  extends typings.atPulumiAws.iamAccountAliasMod.AccountAlias {
  /**
    * Create a AccountAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccountAliasArgs) = this()
  def this(name: String, args: AccountAliasArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  /**
    * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = js.native
}

