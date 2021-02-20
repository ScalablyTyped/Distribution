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

object adminAccountMod {
  
  @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount")
  @js.native
  class AdminAccount protected () extends CustomResource {
    /**
      * Create a AdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AdminAccountArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AdminAccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
      */
    val accountId: Output_[String] = js.native
  }
  /* static members */
  object AdminAccount {
    
    /**
      * Get an existing AdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID]): AdminAccount = js.native
    @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AdminAccount = js.native
    @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdminAccountState): AdminAccount = js.native
    @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdminAccountState, opts: CustomResourceOptions): AdminAccount = js.native
    
    /**
      * Returns true if the given object is an instance of AdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fms/adminAccount.AdminAccount */ Boolean = js.native
  }
  
  @js.native
  trait AdminAccountArgs extends StObject {
    
    /**
      * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
  }
  object AdminAccountArgs {
    
    @scala.inline
    def apply(): AdminAccountArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminAccountArgs]
    }
    
    @scala.inline
    implicit class AdminAccountArgsMutableBuilder[Self <: AdminAccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    }
  }
  
  @js.native
  trait AdminAccountState extends StObject {
    
    /**
      * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
  }
  object AdminAccountState {
    
    @scala.inline
    def apply(): AdminAccountState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminAccountState]
    }
    
    @scala.inline
    implicit class AdminAccountStateMutableBuilder[Self <: AdminAccountState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    }
  }
}
