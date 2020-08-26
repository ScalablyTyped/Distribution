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
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup", JSImport.Namespace)
@js.native
object backupMod extends js.Object {
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
  
  def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = js.native
  def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = js.native
  def getSelection(args: GetSelectionArgs): js.Promise[GetSelectionResult] = js.native
  def getSelection(args: GetSelectionArgs, opts: InvokeOptions): js.Promise[GetSelectionResult] = js.native
  def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = js.native
  def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = js.native
  /* static members */
  @js.native
  object Plan extends js.Object {
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.planMod.Plan = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = js.native
    def get(name: String, id: Input[ID], state: PlanState): typings.pulumiAws.planMod.Plan = js.native
    def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): typings.pulumiAws.planMod.Plan = js.native
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Selection extends js.Object {
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.selectionMod.Selection = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = js.native
    def get(name: String, id: Input[ID], state: SelectionState): typings.pulumiAws.selectionMod.Selection = js.native
    def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): typings.pulumiAws.selectionMod.Selection = js.native
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Vault extends js.Object {
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.vaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState): typings.pulumiAws.vaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typings.pulumiAws.vaultMod.Vault = js.native
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
  }
  
}

