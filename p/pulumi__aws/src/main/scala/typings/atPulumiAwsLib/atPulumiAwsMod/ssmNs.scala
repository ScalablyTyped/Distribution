package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ssm")
@js.native
object ssmNs extends js.Object {
  @js.native
  class Activation protected ()
    extends atPulumiAwsLib.ssmMod.Activation {
    /**
      * Create a Activation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmActivationMod.ActivationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmActivationMod.ActivationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Association protected ()
    extends atPulumiAwsLib.ssmMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmAssociationMod.AssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmAssociationMod.AssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Document protected ()
    extends atPulumiAwsLib.ssmMod.Document {
    /**
      * Create a Document resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmDocumentMod.DocumentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmDocumentMod.DocumentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindow protected ()
    extends atPulumiAwsLib.ssmMod.MaintenanceWindow {
    /**
      * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTarget protected ()
    extends atPulumiAwsLib.ssmMod.MaintenanceWindowTarget {
    /**
      * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTask protected ()
    extends atPulumiAwsLib.ssmMod.MaintenanceWindowTask {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Parameter protected ()
    extends atPulumiAwsLib.ssmMod.Parameter {
    /**
      * Create a Parameter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmParameterMod.ParameterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmParameterMod.ParameterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchBaseline protected ()
    extends atPulumiAwsLib.ssmMod.PatchBaseline {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmPatchBaselineMod.PatchBaselineArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmPatchBaselineMod.PatchBaselineArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchGroup protected ()
    extends atPulumiAwsLib.ssmMod.PatchGroup {
    /**
      * Create a PatchGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmPatchGroupMod.PatchGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmPatchGroupMod.PatchGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceDataSync protected ()
    extends atPulumiAwsLib.ssmMod.ResourceDataSync {
    /**
      * Create a ResourceDataSync resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSyncArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSyncArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  var SecureStringParameter: atPulumiAwsLib.ssmParameterTypeMod.ParameterType = js.native
  var StringListParameter: atPulumiAwsLib.ssmParameterTypeMod.ParameterType = js.native
  var StringParameter: atPulumiAwsLib.ssmParameterTypeMod.ParameterType = js.native
  def getDocument(args: atPulumiAwsLib.ssmGetDocumentMod.GetDocumentArgs): js.Promise[atPulumiAwsLib.ssmGetDocumentMod.GetDocumentResult] = js.native
  def getDocument(
    args: atPulumiAwsLib.ssmGetDocumentMod.GetDocumentArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ssmGetDocumentMod.GetDocumentResult] = js.native
  def getParameter(args: atPulumiAwsLib.ssmGetParameterMod.GetParameterArgs): js.Promise[atPulumiAwsLib.ssmGetParameterMod.GetParameterResult] = js.native
  def getParameter(
    args: atPulumiAwsLib.ssmGetParameterMod.GetParameterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ssmGetParameterMod.GetParameterResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmActivationMod.Activation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmActivationMod.ActivationState
    ): atPulumiAwsLib.ssmActivationMod.Activation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmActivationMod.ActivationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmActivationMod.Activation = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmAssociationMod.Association = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmAssociationMod.AssociationState
    ): atPulumiAwsLib.ssmAssociationMod.Association = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmAssociationMod.AssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmAssociationMod.Association = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmDocumentMod.Document = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmDocumentMod.DocumentState
    ): atPulumiAwsLib.ssmDocumentMod.Document = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmDocumentMod.DocumentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmDocumentMod.Document = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState
    ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetState
    ): atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTargetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmMaintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState
    ): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmParameterMod.Parameter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmParameterMod.ParameterState
    ): atPulumiAwsLib.ssmParameterMod.Parameter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmParameterMod.ParameterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmParameterMod.Parameter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmPatchBaselineMod.PatchBaseline = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmPatchBaselineMod.PatchBaselineState
    ): atPulumiAwsLib.ssmPatchBaselineMod.PatchBaseline = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmPatchBaselineMod.PatchBaselineState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmPatchBaselineMod.PatchBaseline = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmPatchGroupMod.PatchGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmPatchGroupMod.PatchGroupState
    ): atPulumiAwsLib.ssmPatchGroupMod.PatchGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmPatchGroupMod.PatchGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmPatchGroupMod.PatchGroup = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSync = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSyncState
    ): atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSync = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSyncState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ssmResourceDataSyncMod.ResourceDataSync = js.native
  }
  
}

