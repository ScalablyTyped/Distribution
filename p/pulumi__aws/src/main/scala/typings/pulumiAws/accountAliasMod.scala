package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias.get")
    @js.native
    def get(name: String, id: Input[ID]): AccountAlias = js.native
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccountAlias = js.native
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountAliasState): AccountAlias = js.native
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): AccountAlias = js.native
    
    /**
      * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/accountAlias", "AccountAlias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = js.native
  }
  
  @js.native
  trait AccountAliasArgs extends StObject {
    
    /**
      * The account alias
      */
    val accountAlias: Input[String] = js.native
  }
  object AccountAliasArgs {
    
    @scala.inline
    def apply(accountAlias: Input[String]): AccountAliasArgs = {
      val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountAliasArgs]
    }
    
    @scala.inline
    implicit class AccountAliasArgsMutableBuilder[Self <: AccountAliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountAlias(value: Input[String]): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountAliasState extends StObject {
    
    /**
      * The account alias
      */
    val accountAlias: js.UndefOr[Input[String]] = js.native
  }
  object AccountAliasState {
    
    @scala.inline
    def apply(): AccountAliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountAliasState]
    }
    
    @scala.inline
    implicit class AccountAliasStateMutableBuilder[Self <: AccountAliasState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountAlias(value: Input[String]): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountAliasUndefined: Self = StObject.set(x, "accountAlias", js.undefined)
    }
  }
}
