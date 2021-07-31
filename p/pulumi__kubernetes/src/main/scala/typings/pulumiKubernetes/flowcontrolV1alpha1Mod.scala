package typings.pulumiKubernetes

import typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaListArgs
import typings.pulumiKubernetes.flowSchemaMod.FlowSchemaArgs
import typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationListArgs
import typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfigurationArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowcontrolV1alpha1Mod {
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FlowSchema {
    
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchema")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.flowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.flowSchemaMod.FlowSchema]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.flowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.flowSchemaMod.FlowSchema]
    
    /**
      * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FlowSchemaList {
    
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "FlowSchemaList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.flowSchemaListMod.FlowSchemaList]
    
    /**
      * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityLevelConfiguration {
    
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityLevelConfigurationMod.PriorityLevelConfiguration]
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PriorityLevelConfigurationList {
    
    @JSImport("@pulumi/kubernetes/flowcontrol/v1alpha1", "PriorityLevelConfigurationList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.priorityLevelConfigurationListMod.PriorityLevelConfigurationList]
    
    /**
      * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean]
  }
}
