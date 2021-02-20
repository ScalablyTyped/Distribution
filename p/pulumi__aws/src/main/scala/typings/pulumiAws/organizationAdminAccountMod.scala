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

object organizationAdminAccountMod {
  
  @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount")
  @js.native
  class OrganizationAdminAccount protected () extends CustomResource {
    /**
      * Create a OrganizationAdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationAdminAccountArgs) = this()
    def this(name: String, args: OrganizationAdminAccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AWS account identifier to designate as a delegated administrator for GuardDuty.
      */
    val adminAccountId: Output_[String] = js.native
  }
  /* static members */
  object OrganizationAdminAccount {
    
    /**
      * Get an existing OrganizationAdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID]): OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState): OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState, opts: CustomResourceOptions): OrganizationAdminAccount = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationAdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean = js.native
  }
  
  @js.native
  trait OrganizationAdminAccountArgs extends StObject {
    
    /**
      * AWS account identifier to designate as a delegated administrator for GuardDuty.
      */
    val adminAccountId: Input[String] = js.native
  }
  object OrganizationAdminAccountArgs {
    
    @scala.inline
    def apply(adminAccountId: Input[String]): OrganizationAdminAccountArgs = {
      val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationAdminAccountArgs]
    }
    
    @scala.inline
    implicit class OrganizationAdminAccountArgsMutableBuilder[Self <: OrganizationAdminAccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminAccountId(value: Input[String]): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationAdminAccountState extends StObject {
    
    /**
      * AWS account identifier to designate as a delegated administrator for GuardDuty.
      */
    val adminAccountId: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationAdminAccountState {
    
    @scala.inline
    def apply(): OrganizationAdminAccountState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationAdminAccountState]
    }
    
    @scala.inline
    implicit class OrganizationAdminAccountStateMutableBuilder[Self <: OrganizationAdminAccountState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminAccountId(value: Input[String]): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminAccountIdUndefined: Self = StObject.set(x, "adminAccountId", js.undefined)
    }
  }
}
