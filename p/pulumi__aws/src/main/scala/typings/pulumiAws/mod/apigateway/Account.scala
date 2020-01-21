package typings.pulumiAws.mod.apigateway

import typings.pulumiAws.accountMod.AccountArgs
import typings.pulumiAws.accountMod.AccountState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.Account")
@js.native
class Account protected ()
  extends typings.pulumiAws.apigatewayMod.Account {
  /**
    * Create a Account resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AccountArgs) = this()
  def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.Account")
@js.native
object Account extends js.Object {
  /**
    * Get an existing Account resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.accountMod.Account = js.native
  def get(name: String, id: Input[ID], state: AccountState): typings.pulumiAws.accountMod.Account = js.native
  def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.pulumiAws.accountMod.Account = js.native
  /**
    * Returns true if the given object is an instance of Account.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/account.Account */ Boolean = js.native
}

