package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.batch.ComputeEnvironmentComputeResources
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeEnvironmentMod {
  
  @JSImport("@pulumi/aws/batch/computeEnvironment", "ComputeEnvironment")
  @js.native
  class ComputeEnvironment protected () extends CustomResource {
    /**
      * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComputeEnvironmentArgs) = this()
    def this(name: String, args: ComputeEnvironmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the compute environment.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
      */
    val computeEnvironmentName: Output_[String] = js.native
    
    /**
      * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
      */
    val computeEnvironmentNamePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
      */
    val computeResources: Output_[js.UndefOr[ComputeEnvironmentComputeResources]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
      */
    val ecsClusterArn: Output_[String] = js.native
    
    /**
      * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
      */
    val serviceRole: Output_[String] = js.native
    
    /**
      * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
      */
    val state: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The current status of the compute environment (for example, CREATING or VALID).
      */
    val status: Output_[String] = js.native
    
    /**
      * A short, human-readable string to provide additional details about the current status of the compute environment.
      */
    val statusReason: Output_[String] = js.native
    
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of compute environment. Valid items are `EC2` or `SPOT`.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object ComputeEnvironment {
    
    @JSImport("@pulumi/aws/batch/computeEnvironment", "ComputeEnvironment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ComputeEnvironment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ComputeEnvironment]
    inline def get(name: String, id: Input[ID], state: ComputeEnvironmentState): ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ComputeEnvironment]
    inline def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ComputeEnvironment]
    
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean]
  }
  
  trait ComputeEnvironmentArgs extends StObject {
    
    /**
      * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
      */
    val computeEnvironmentName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
      */
    val computeEnvironmentNamePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
      */
    val computeResources: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources]] = js.undefined
    
    /**
      * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
      */
    val serviceRole: Input[String]
    
    /**
      * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The type of compute environment. Valid items are `EC2` or `SPOT`.
      */
    val `type`: Input[String]
  }
  object ComputeEnvironmentArgs {
    
    inline def apply(serviceRole: Input[String], `type`: Input[String]): ComputeEnvironmentArgs = {
      val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeEnvironmentArgs]
    }
    
    extension [Self <: ComputeEnvironmentArgs](x: Self) {
      
      inline def setComputeEnvironmentName(value: Input[String]): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentNamePrefix(value: Input[String]): Self = StObject.set(x, "computeEnvironmentNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentNamePrefixUndefined: Self = StObject.set(x, "computeEnvironmentNamePrefix", js.undefined)
      
      inline def setComputeEnvironmentNameUndefined: Self = StObject.set(x, "computeEnvironmentName", js.undefined)
      
      inline def setComputeResources(value: Input[typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources]): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
      
      inline def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
      
      inline def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeEnvironmentState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the compute environment.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
      */
    val computeEnvironmentName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
      */
    val computeEnvironmentNamePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
      */
    val computeResources: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
      */
    val ecsClusterArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
      */
    val serviceRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current status of the compute environment (for example, CREATING or VALID).
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A short, human-readable string to provide additional details about the current status of the compute environment.
      */
    val statusReason: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The type of compute environment. Valid items are `EC2` or `SPOT`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object ComputeEnvironmentState {
    
    inline def apply(): ComputeEnvironmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeEnvironmentState]
    }
    
    extension [Self <: ComputeEnvironmentState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setComputeEnvironmentName(value: Input[String]): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentNamePrefix(value: Input[String]): Self = StObject.set(x, "computeEnvironmentNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentNamePrefixUndefined: Self = StObject.set(x, "computeEnvironmentNamePrefix", js.undefined)
      
      inline def setComputeEnvironmentNameUndefined: Self = StObject.set(x, "computeEnvironmentName", js.undefined)
      
      inline def setComputeResources(value: Input[typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources]): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
      
      inline def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
      
      inline def setEcsClusterArn(value: Input[String]): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
      
      inline def setEcsClusterArnUndefined: Self = StObject.set(x, "ecsClusterArn", js.undefined)
      
      inline def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusReason(value: Input[String]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
      
      inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
