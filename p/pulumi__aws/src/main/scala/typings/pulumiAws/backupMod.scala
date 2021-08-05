package typings.pulumiAws

import typings.pulumiAws.getPlanMod.GetPlanArgs
import typings.pulumiAws.getPlanMod.GetPlanResult
import typings.pulumiAws.getSelectionMod.GetSelectionArgs
import typings.pulumiAws.getSelectionMod.GetSelectionResult
import typings.pulumiAws.getVaultMod.GetVaultArgs
import typings.pulumiAws.getVaultMod.GetVaultResult
import typings.pulumiAws.planMod.PlanArgs
import typings.pulumiAws.planMod.PlanState
import typings.pulumiAws.selectionMod.SelectionArgs
import typings.pulumiAws.selectionMod.SelectionState
import typings.pulumiAws.vaultMod.VaultArgs
import typings.pulumiAws.vaultMod.VaultState
import typings.pulumiAws.vaultNotificationsMod.VaultNotificationsArgs
import typings.pulumiAws.vaultNotificationsMod.VaultNotificationsState
import typings.pulumiAws.vaultPolicyMod.VaultPolicyArgs
import typings.pulumiAws.vaultPolicyMod.VaultPolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backupMod {
  
  @JSImport("@pulumi/aws/backup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/backup", "Plan")
  @js.native
  class Plan protected ()
    extends typings.pulumiAws.planMod.Plan {
    /**
      * Create a Plan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlanArgs) = this()
    def this(name: String, args: PlanArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Plan {
    
    @JSImport("@pulumi/aws/backup", "Plan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.planMod.Plan = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.planMod.Plan]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.planMod.Plan]
    inline def get(name: String, id: Input[ID], state: PlanState): typings.pulumiAws.planMod.Plan = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.planMod.Plan]
    inline def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.planMod.Plan]
    
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean]
  }
  
  @JSImport("@pulumi/aws/backup", "Selection")
  @js.native
  class Selection protected ()
    extends typings.pulumiAws.selectionMod.Selection {
    /**
      * Create a Selection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SelectionArgs) = this()
    def this(name: String, args: SelectionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Selection {
    
    @JSImport("@pulumi/aws/backup", "Selection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.selectionMod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.selectionMod.Selection]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.selectionMod.Selection]
    inline def get(name: String, id: Input[ID], state: SelectionState): typings.pulumiAws.selectionMod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.selectionMod.Selection]
    inline def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.selectionMod.Selection]
    
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean]
  }
  
  @JSImport("@pulumi/aws/backup", "Vault")
  @js.native
  class Vault protected ()
    extends typings.pulumiAws.vaultMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Vault {
    
    @JSImport("@pulumi/aws/backup", "Vault")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.vaultMod.Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultMod.Vault]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultMod.Vault]
    inline def get(name: String, id: Input[ID], state: VaultState): typings.pulumiAws.vaultMod.Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultMod.Vault]
    inline def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultMod.Vault]
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean]
  }
  
  @JSImport("@pulumi/aws/backup", "VaultNotifications")
  @js.native
  class VaultNotifications protected ()
    extends typings.pulumiAws.vaultNotificationsMod.VaultNotifications {
    /**
      * Create a VaultNotifications resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultNotificationsArgs) = this()
    def this(name: String, args: VaultNotificationsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VaultNotifications {
    
    @JSImport("@pulumi/aws/backup", "VaultNotifications")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultNotificationsMod.VaultNotifications]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultNotificationsMod.VaultNotifications]
    inline def get(name: String, id: Input[ID], state: VaultNotificationsState): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultNotificationsMod.VaultNotifications]
    inline def get(name: String, id: Input[ID], state: VaultNotificationsState, opts: CustomResourceOptions): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultNotificationsMod.VaultNotifications]
    
    /**
      * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean]
  }
  
  @JSImport("@pulumi/aws/backup", "VaultPolicy")
  @js.native
  class VaultPolicy protected ()
    extends typings.pulumiAws.vaultPolicyMod.VaultPolicy {
    /**
      * Create a VaultPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultPolicyArgs) = this()
    def this(name: String, args: VaultPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VaultPolicy {
    
    @JSImport("@pulumi/aws/backup", "VaultPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VaultPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.vaultPolicyMod.VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultPolicyMod.VaultPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vaultPolicyMod.VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultPolicyMod.VaultPolicy]
    inline def get(name: String, id: Input[ID], state: VaultPolicyState): typings.pulumiAws.vaultPolicyMod.VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultPolicyMod.VaultPolicy]
    inline def get(name: String, id: Input[ID], state: VaultPolicyState, opts: CustomResourceOptions): typings.pulumiAws.vaultPolicyMod.VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vaultPolicyMod.VaultPolicy]
    
    /**
      * Returns true if the given object is an instance of VaultPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean]
  }
  
  inline def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlan")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPlanResult]]
  inline def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlan")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPlanResult]]
  
  inline def getSelection(args: GetSelectionArgs): js.Promise[GetSelectionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelection")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSelectionResult]]
  inline def getSelection(args: GetSelectionArgs, opts: InvokeOptions): js.Promise[GetSelectionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelection")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSelectionResult]]
  
  inline def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVaultResult]]
  inline def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVaultResult]]
}
