package typings.pulumiAws.iamMod

import typings.pulumiAws.accountAliasMod.AccountAliasArgs
import typings.pulumiAws.accountAliasMod.AccountAliasState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "AccountAlias")
@js.native
class AccountAlias protected ()
  extends typings.pulumiAws.accountAliasMod.AccountAlias {
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
object AccountAlias {
  
  @JSImport("@pulumi/aws/iam", "AccountAlias")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  inline def get(name: String, id: Input[ID]): typings.pulumiAws.accountAliasMod.AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountAliasMod.AccountAlias]
  inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.accountAliasMod.AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountAliasMod.AccountAlias]
  inline def get(name: String, id: Input[ID], state: AccountAliasState): typings.pulumiAws.accountAliasMod.AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountAliasMod.AccountAlias]
  inline def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): typings.pulumiAws.accountAliasMod.AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountAliasMod.AccountAlias]
  
  /**
    * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean]
}
