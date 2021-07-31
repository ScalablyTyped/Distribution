package typings.pulumiAws

import typings.pulumiAws.adminAccountMod.AdminAccountArgs
import typings.pulumiAws.adminAccountMod.AdminAccountState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fmsMod {
  
  @JSImport("@pulumi/aws/fms", "AdminAccount")
  @js.native
  class AdminAccount protected ()
    extends typings.pulumiAws.adminAccountMod.AdminAccount {
    /**
      * Create a AdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AdminAccountArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AdminAccountArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AdminAccount {
    
    @JSImport("@pulumi/aws/fms", "AdminAccount")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.adminAccountMod.AdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.adminAccountMod.AdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.adminAccountMod.AdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.adminAccountMod.AdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: AdminAccountState): typings.pulumiAws.adminAccountMod.AdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.adminAccountMod.AdminAccount]
    @scala.inline
    def get(name: String, id: Input[ID], state: AdminAccountState, opts: CustomResourceOptions): typings.pulumiAws.adminAccountMod.AdminAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.adminAccountMod.AdminAccount]
    
    /**
      * Returns true if the given object is an instance of AdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fms/adminAccount.AdminAccount */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/fms/adminAccount.AdminAccount */ Boolean]
  }
}
