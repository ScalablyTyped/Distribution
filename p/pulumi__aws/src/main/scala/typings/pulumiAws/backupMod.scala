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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backupMod {
  
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
    
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws/backup", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws/backup", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState): typings.pulumiAws.planMod.Plan = js.native
    @JSImport("@pulumi/aws/backup", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = js.native
    
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup", "Plan.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
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
    
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws/backup", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws/backup", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState): typings.pulumiAws.selectionMod.Selection = js.native
    @JSImport("@pulumi/aws/backup", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = js.native
    
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup", "Selection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Vault {
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup", "Vault.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws/backup", "Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws/backup", "Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState): typings.pulumiAws.vaultMod.Vault = js.native
    @JSImport("@pulumi/aws/backup", "Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = js.native
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup", "Vault.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
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
    
    /**
      * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup", "VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws/backup", "VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws/backup", "VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultNotificationsState): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    @JSImport("@pulumi/aws/backup", "VaultNotifications.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultNotificationsState, opts: CustomResourceOptions): typings.pulumiAws.vaultNotificationsMod.VaultNotifications = js.native
    
    /**
      * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup", "VaultNotifications.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean = js.native
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
    
    /**
      * Get an existing VaultPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup", "VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws/backup", "VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws/backup", "VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultPolicyState): typings.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    @JSImport("@pulumi/aws/backup", "VaultPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultPolicyState, opts: CustomResourceOptions): typings.pulumiAws.vaultPolicyMod.VaultPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of VaultPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup", "VaultPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/backup", "getPlan")
  @js.native
  def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = js.native
  @JSImport("@pulumi/aws/backup", "getPlan")
  @js.native
  def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = js.native
  
  @JSImport("@pulumi/aws/backup", "getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs): js.Promise[GetSelectionResult] = js.native
  @JSImport("@pulumi/aws/backup", "getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs, opts: InvokeOptions): js.Promise[GetSelectionResult] = js.native
  
  @JSImport("@pulumi/aws/backup", "getVault")
  @js.native
  def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = js.native
  @JSImport("@pulumi/aws/backup", "getVault")
  @js.native
  def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = js.native
}
