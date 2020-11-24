package typings.pulumiKubernetes

import typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaListArgs
import typings.pulumiKubernetes.flowSchemaMod.FlowSchemaArgs
import typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationListArgs
import typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfigurationArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", JSImport.Namespace)
@js.native
object flowcontrolV1alpha1Mod extends js.Object {
  
  @js.native
  class FlowSchema protected ()
    extends typings.pulumiKubernetes.flowSchemaMod.FlowSchema {
    /**
      * Create a FlowSchema resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FlowSchemaArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object FlowSchema extends js.Object {
    
    /**
      * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.flowSchemaMod.FlowSchema = js.native
    
    /**
      * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = js.native
  }
  
  @js.native
  class FlowSchemaList protected ()
    extends typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList {
    /**
      * Create a FlowSchemaList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FlowSchemaListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object FlowSchemaList extends js.Object {
    
    /**
      * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = js.native
    
    /**
      * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = js.native
  }
  
  @js.native
  class PriorityLevelConfiguration protected ()
    extends typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration {
    /**
      * Create a PriorityLevelConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityLevelConfigurationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object PriorityLevelConfiguration extends js.Object {
    
    /**
      * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = js.native
  }
  
  @js.native
  class PriorityLevelConfigurationList protected ()
    extends typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList {
    /**
      * Create a PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityLevelConfigurationListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object PriorityLevelConfigurationList extends js.Object {
    
    /**
      * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = js.native
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = js.native
  }
}
