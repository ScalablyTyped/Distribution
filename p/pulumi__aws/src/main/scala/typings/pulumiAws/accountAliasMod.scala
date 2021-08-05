package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountAliasMod {
  
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
  object AccountAlias {
    
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias")
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
    inline def get(name: String, id: Input[ID]): AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AccountAlias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccountAlias]
    inline def get(name: String, id: Input[ID], state: AccountAliasState): AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AccountAlias]
    inline def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): AccountAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccountAlias]
    
    /**
      * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean]
  }
  
  trait AccountAliasArgs extends StObject {
    
    /**
      * The account alias
      */
    val accountAlias: Input[String]
  }
  object AccountAliasArgs {
    
    inline def apply(accountAlias: Input[String]): AccountAliasArgs = {
      val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountAliasArgs]
    }
    
    extension [Self <: AccountAliasArgs](x: Self) {
      
      inline def setAccountAlias(value: Input[String]): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountAliasState extends StObject {
    
    /**
      * The account alias
      */
    val accountAlias: js.UndefOr[Input[String]] = js.undefined
  }
  object AccountAliasState {
    
    inline def apply(): AccountAliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountAliasState]
    }
    
    extension [Self <: AccountAliasState](x: Self) {
      
      inline def setAccountAlias(value: Input[String]): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
      
      inline def setAccountAliasUndefined: Self = StObject.set(x, "accountAlias", js.undefined)
    }
  }
}
