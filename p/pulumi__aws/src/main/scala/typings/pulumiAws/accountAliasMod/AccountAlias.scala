package typings.pulumiAws.accountAliasMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias")
@js.native
class AccountAlias protected () extends CustomResource {
  /**
    * Create a AccountAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccountAliasArgs) = this()
  def this(name: String, args: AccountAliasArgs, opts: CustomResourceOptions) = this()
  /**
    * The account alias
    */
  val accountAlias: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias")
@js.native
object AccountAlias extends js.Object {
  /**
    * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AccountAlias = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState): AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): AccountAlias = js.native
  /**
    * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = js.native
}

