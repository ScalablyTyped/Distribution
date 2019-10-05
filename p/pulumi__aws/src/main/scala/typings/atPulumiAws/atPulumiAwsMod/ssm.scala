package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.ssmActivationMod.ActivationArgs
import typings.atPulumiAws.ssmActivationMod.ActivationState
import typings.atPulumiAws.ssmAssociationMod.AssociationArgs
import typings.atPulumiAws.ssmAssociationMod.AssociationState
import typings.atPulumiAws.ssmDocumentMod.DocumentArgs
import typings.atPulumiAws.ssmDocumentMod.DocumentState
import typings.atPulumiAws.ssmGetDocumentMod.GetDocumentArgs
import typings.atPulumiAws.ssmGetDocumentMod.GetDocumentResult
import typings.atPulumiAws.ssmGetParameterMod.GetParameterArgs
import typings.atPulumiAws.ssmGetParameterMod.GetParameterResult
import typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindowArgs
import typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindowState
import typings.atPulumiAws.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetArgs
import typings.atPulumiAws.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetState
import typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskArgs
import typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState
import typings.atPulumiAws.ssmParameterMod.ParameterArgs
import typings.atPulumiAws.ssmParameterMod.ParameterState
import typings.atPulumiAws.ssmParameterTypeMod.ParameterType
import typings.atPulumiAws.ssmPatchBaselineMod.PatchBaselineArgs
import typings.atPulumiAws.ssmPatchBaselineMod.PatchBaselineState
import typings.atPulumiAws.ssmPatchGroupMod.PatchGroupArgs
import typings.atPulumiAws.ssmPatchGroupMod.PatchGroupState
import typings.atPulumiAws.ssmResourceDataSyncMod.ResourceDataSyncArgs
import typings.atPulumiAws.ssmResourceDataSyncMod.ResourceDataSyncState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ssm")
@js.native
object ssm extends js.Object {
  @js.native
  class Activation protected ()
    extends typings.atPulumiAws.ssmMod.Activation {
    /**
      * Create a Activation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActivationArgs) = this()
    def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Association protected ()
    extends typings.atPulumiAws.ssmMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Document protected ()
    extends typings.atPulumiAws.ssmMod.Document {
    /**
      * Create a Document resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentArgs) = this()
    def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindow protected ()
    extends typings.atPulumiAws.ssmMod.MaintenanceWindow {
    /**
      * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowArgs) = this()
    def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTarget protected ()
    extends typings.atPulumiAws.ssmMod.MaintenanceWindowTarget {
    /**
      * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTargetArgs) = this()
    def this(name: String, args: MaintenanceWindowTargetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTask protected ()
    extends typings.atPulumiAws.ssmMod.MaintenanceWindowTask {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTaskArgs) = this()
    def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Parameter protected ()
    extends typings.atPulumiAws.ssmMod.Parameter {
    /**
      * Create a Parameter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterArgs) = this()
    def this(name: String, args: ParameterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchBaseline protected ()
    extends typings.atPulumiAws.ssmMod.PatchBaseline {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PatchBaselineArgs) = this()
    def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchGroup protected ()
    extends typings.atPulumiAws.ssmMod.PatchGroup {
    /**
      * Create a PatchGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PatchGroupArgs) = this()
    def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceDataSync protected ()
    extends typings.atPulumiAws.ssmMod.ResourceDataSync {
    /**
      * Create a ResourceDataSync resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceDataSyncArgs) = this()
    def this(name: String, args: ResourceDataSyncArgs, opts: CustomResourceOptions) = this()
  }
  
  var SecureStringParameter: ParameterType = js.native
  var StringListParameter: ParameterType = js.native
  var StringParameter: ParameterType = js.native
  def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] with GetParameterResult = js.native
  def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] with GetParameterResult = js.native
  /* static members */
  @js.native
  object Activation extends js.Object {
    /**
      * Get an existing Activation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmActivationMod.Activation = js.native
    def get(name: String, id: Input[ID], state: ActivationState): typings.atPulumiAws.ssmActivationMod.Activation = js.native
    def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): typings.atPulumiAws.ssmActivationMod.Activation = js.native
    /**
      * Returns true if the given object is an instance of Activation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmAssociationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState): typings.atPulumiAws.ssmAssociationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typings.atPulumiAws.ssmAssociationMod.Association = js.native
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Document extends js.Object {
    /**
      * Get an existing Document resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmDocumentMod.Document = js.native
    def get(name: String, id: Input[ID], state: DocumentState): typings.atPulumiAws.ssmDocumentMod.Document = js.native
    def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): typings.atPulumiAws.ssmDocumentMod.Document = js.native
    /**
      * Returns true if the given object is an instance of Document.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindow extends js.Object {
    /**
      * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindowTarget extends js.Object {
    /**
      * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): typings.atPulumiAws.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): typings.atPulumiAws.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindowTask extends js.Object {
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Parameter extends js.Object {
    /**
      * Get an existing Parameter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmParameterMod.Parameter = js.native
    def get(name: String, id: Input[ID], state: ParameterState): typings.atPulumiAws.ssmParameterMod.Parameter = js.native
    def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): typings.atPulumiAws.ssmParameterMod.Parameter = js.native
    /**
      * Returns true if the given object is an instance of Parameter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PatchBaseline extends js.Object {
    /**
      * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
    /**
      * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PatchGroup extends js.Object {
    /**
      * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
    def get(name: String, id: Input[ID], state: PatchGroupState): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
    def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
    /**
      * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceDataSync extends js.Object {
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmResourceDataSyncMod.ResourceDataSync = js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState): typings.atPulumiAws.ssmResourceDataSyncMod.ResourceDataSync = js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): typings.atPulumiAws.ssmResourceDataSyncMod.ResourceDataSync = js.native
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = js.native
  }
  
}

