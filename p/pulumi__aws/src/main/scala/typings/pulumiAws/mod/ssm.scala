package typings.pulumiAws.mod

import typings.pulumiAws.activationMod.ActivationArgs
import typings.pulumiAws.activationMod.ActivationState
import typings.pulumiAws.documentMod.DocumentArgs
import typings.pulumiAws.documentMod.DocumentState
import typings.pulumiAws.enumsSsmMod.ParameterType
import typings.pulumiAws.getDocumentMod.GetDocumentArgs
import typings.pulumiAws.getDocumentMod.GetDocumentResult
import typings.pulumiAws.getParameterMod.GetParameterArgs
import typings.pulumiAws.getParameterMod.GetParameterResult
import typings.pulumiAws.getPatchBaselineMod.GetPatchBaselineArgs
import typings.pulumiAws.getPatchBaselineMod.GetPatchBaselineResult
import typings.pulumiAws.maintenanceWindowMod.MaintenanceWindowArgs
import typings.pulumiAws.maintenanceWindowMod.MaintenanceWindowState
import typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetArgs
import typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetState
import typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskArgs
import typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskState
import typings.pulumiAws.parameterMod.ParameterArgs
import typings.pulumiAws.parameterMod.ParameterState
import typings.pulumiAws.patchBaselineMod.PatchBaselineArgs
import typings.pulumiAws.patchBaselineMod.PatchBaselineState
import typings.pulumiAws.patchGroupMod.PatchGroupArgs
import typings.pulumiAws.patchGroupMod.PatchGroupState
import typings.pulumiAws.resourceDataSyncMod.ResourceDataSyncArgs
import typings.pulumiAws.resourceDataSyncMod.ResourceDataSyncState
import typings.pulumiAws.ssmAssociationMod.AssociationArgs
import typings.pulumiAws.ssmAssociationMod.AssociationState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssm {
  
  @JSImport("@pulumi/aws", "ssm")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "ssm.Activation")
  @js.native
  class Activation protected ()
    extends typings.pulumiAws.ssmMod.Activation {
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
  /* static members */
  object Activation {
    
    @JSImport("@pulumi/aws", "ssm.Activation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Activation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.activationMod.Activation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activationMod.Activation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.activationMod.Activation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activationMod.Activation]
    inline def get(name: String, id: Input[ID], state: ActivationState): typings.pulumiAws.activationMod.Activation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activationMod.Activation]
    inline def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): typings.pulumiAws.activationMod.Activation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activationMod.Activation]
    
    /**
      * Returns true if the given object is an instance of Activation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.Association")
  @js.native
  class Association protected ()
    extends typings.pulumiAws.ssmMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Association {
    
    @JSImport("@pulumi/aws", "ssm.Association")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.ssmAssociationMod.Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ssmAssociationMod.Association]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ssmAssociationMod.Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ssmAssociationMod.Association]
    inline def get(name: String, id: Input[ID], state: AssociationState): typings.pulumiAws.ssmAssociationMod.Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ssmAssociationMod.Association]
    inline def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typings.pulumiAws.ssmAssociationMod.Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ssmAssociationMod.Association]
    
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.Document")
  @js.native
  class Document protected ()
    extends typings.pulumiAws.ssmMod.Document {
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
  /* static members */
  object Document {
    
    @JSImport("@pulumi/aws", "ssm.Document")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Document resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.documentMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.documentMod.Document]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.documentMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.documentMod.Document]
    inline def get(name: String, id: Input[ID], state: DocumentState): typings.pulumiAws.documentMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.documentMod.Document]
    inline def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): typings.pulumiAws.documentMod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.documentMod.Document]
    
    /**
      * Returns true if the given object is an instance of Document.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.MaintenanceWindow")
  @js.native
  class MaintenanceWindow protected ()
    extends typings.pulumiAws.ssmMod.MaintenanceWindow {
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
  /* static members */
  object MaintenanceWindow {
    
    @JSImport("@pulumi/aws", "ssm.MaintenanceWindow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowState): typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowMod.MaintenanceWindow]
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.MaintenanceWindowTarget")
  @js.native
  class MaintenanceWindowTarget protected ()
    extends typings.pulumiAws.ssmMod.MaintenanceWindowTarget {
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
  /* static members */
  object MaintenanceWindowTarget {
    
    @JSImport("@pulumi/aws", "ssm.MaintenanceWindowTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget]
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.MaintenanceWindowTask")
  @js.native
  class MaintenanceWindowTask protected ()
    extends typings.pulumiAws.ssmMod.MaintenanceWindowTask {
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
  /* static members */
  object MaintenanceWindowTask {
    
    @JSImport("@pulumi/aws", "ssm.MaintenanceWindowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask]
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.Parameter")
  @js.native
  class Parameter protected ()
    extends typings.pulumiAws.ssmMod.Parameter {
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
  /* static members */
  object Parameter {
    
    @JSImport("@pulumi/aws", "ssm.Parameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Parameter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.parameterMod.Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.parameterMod.Parameter]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.parameterMod.Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.parameterMod.Parameter]
    inline def get(name: String, id: Input[ID], state: ParameterState): typings.pulumiAws.parameterMod.Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.parameterMod.Parameter]
    inline def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): typings.pulumiAws.parameterMod.Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.parameterMod.Parameter]
    
    /**
      * Returns true if the given object is an instance of Parameter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean]
  }
  
  object ParameterType {
    
    @JSImport("@pulumi/aws", "ssm.ParameterType.SecureString")
    @js.native
    val SecureString: typings.pulumiAws.pulumiAwsStrings.SecureString = js.native
    
    @JSImport("@pulumi/aws", "ssm.ParameterType.String")
    @js.native
    val String: typings.pulumiAws.pulumiAwsStrings.String = js.native
    
    @JSImport("@pulumi/aws", "ssm.ParameterType.StringList")
    @js.native
    val StringList: typings.pulumiAws.pulumiAwsStrings.StringList = js.native
  }
  
  @JSImport("@pulumi/aws", "ssm.PatchBaseline")
  @js.native
  class PatchBaseline protected ()
    extends typings.pulumiAws.ssmMod.PatchBaseline {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PatchBaselineArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PatchBaseline {
    
    @JSImport("@pulumi/aws", "ssm.PatchBaseline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.patchBaselineMod.PatchBaseline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchBaselineMod.PatchBaseline]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.patchBaselineMod.PatchBaseline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchBaselineMod.PatchBaseline]
    inline def get(name: String, id: Input[ID], state: PatchBaselineState): typings.pulumiAws.patchBaselineMod.PatchBaseline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchBaselineMod.PatchBaseline]
    inline def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): typings.pulumiAws.patchBaselineMod.PatchBaseline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchBaselineMod.PatchBaseline]
    
    /**
      * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.PatchGroup")
  @js.native
  class PatchGroup protected ()
    extends typings.pulumiAws.ssmMod.PatchGroup {
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
  /* static members */
  object PatchGroup {
    
    @JSImport("@pulumi/aws", "ssm.PatchGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.patchGroupMod.PatchGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchGroupMod.PatchGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.patchGroupMod.PatchGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchGroupMod.PatchGroup]
    inline def get(name: String, id: Input[ID], state: PatchGroupState): typings.pulumiAws.patchGroupMod.PatchGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchGroupMod.PatchGroup]
    inline def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): typings.pulumiAws.patchGroupMod.PatchGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.patchGroupMod.PatchGroup]
    
    /**
      * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.ResourceDataSync")
  @js.native
  class ResourceDataSync protected ()
    extends typings.pulumiAws.ssmMod.ResourceDataSync {
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
  /* static members */
  object ResourceDataSync {
    
    @JSImport("@pulumi/aws", "ssm.ResourceDataSync")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.resourceDataSyncMod.ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceDataSyncMod.ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resourceDataSyncMod.ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceDataSyncMod.ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: ResourceDataSyncState): typings.pulumiAws.resourceDataSyncMod.ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceDataSyncMod.ResourceDataSync]
    inline def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): typings.pulumiAws.resourceDataSyncMod.ResourceDataSync = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceDataSyncMod.ResourceDataSync]
    
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ssm.SecureStringParameter")
  @js.native
  def SecureStringParameter: ParameterType = js.native
  inline def SecureStringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureStringParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "ssm.StringListParameter")
  @js.native
  def StringListParameter: ParameterType = js.native
  inline def StringListParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringListParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "ssm.StringParameter")
  @js.native
  def StringParameter: ParameterType = js.native
  inline def StringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringParameter")(x.asInstanceOf[js.Any])
  
  inline def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDocumentResult]]
  inline def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDocumentResult]]
  
  inline def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetParameterResult]]
  inline def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetParameterResult]]
  
  inline def getPatchBaseline(args: GetPatchBaselineArgs): js.Promise[GetPatchBaselineResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPatchBaseline")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPatchBaselineResult]]
  inline def getPatchBaseline(args: GetPatchBaselineArgs, opts: InvokeOptions): js.Promise[GetPatchBaselineResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPatchBaseline")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPatchBaselineResult]]
}
