package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/guardduty/organizationAdminAccount", "OrganizationAdminAccount")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationAdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): OrganizationAdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[OrganizationAdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): OrganizationAdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationAdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState): OrganizationAdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[OrganizationAdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState, opts: CustomResourceOptions): OrganizationAdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationAdminAccount]
    
    /**
      * Returns true if the given object is an instance of OrganizationAdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean]
  }
  
  trait OrganizationAdminAccountArgs extends StObject {
    
    /**
      * AWS account identifier to designate as a delegated administrator for GuardDuty.
      */
    val adminAccountId: Input[String]
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
  
  trait OrganizationAdminAccountState extends StObject {
    
    /**
      * AWS account identifier to designate as a delegated administrator for GuardDuty.
      */
    val adminAccountId: js.UndefOr[Input[String]] = js.undefined
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
