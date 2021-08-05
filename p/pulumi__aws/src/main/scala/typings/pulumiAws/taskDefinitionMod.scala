package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecs.TaskDefinitionInferenceAccelerator
import typings.pulumiAws.outputMod.ecs.TaskDefinitionPlacementConstraint
import typings.pulumiAws.outputMod.ecs.TaskDefinitionProxyConfiguration
import typings.pulumiAws.outputMod.ecs.TaskDefinitionVolume
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskDefinitionMod {
  
  @JSImport("@pulumi/aws/ecs/taskDefinition", "TaskDefinition")
  @js.native
  class TaskDefinition protected () extends CustomResource {
    /**
      * Create a TaskDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskDefinitionArgs) = this()
    def this(name: String, args: TaskDefinitionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Full ARN of the Task Definition (including both `family` and `revision`).
      */
    val arn: Output_[String] = js.native
    
    /**
      * A list of valid [container
      * definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
      * provided as a single valid JSON document. Please note that you should only
      * provide values that are part of the container definition document. For a
      * detailed description of what parameters are available, see the [Task Definition
      * Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
      * section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
      */
    val containerDefinitions: Output_[String] = js.native
    
    /**
      * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val cpu: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
      */
    val executionRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A unique name for your task definition.
      */
    val family: Output_[String] = js.native
    
    /**
      * Configuration block(s) with Inference Accelerators settings. Detailed below.
      */
    val inferenceAccelerators: Output_[js.UndefOr[js.Array[TaskDefinitionInferenceAccelerator]]] = js.native
    
    /**
      * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
      */
    val ipcMode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val memory: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
      */
    val networkMode: Output_[String] = js.native
    
    /**
      * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
      */
    val pidMode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
      */
    val placementConstraints: Output_[js.UndefOr[js.Array[TaskDefinitionPlacementConstraint]]] = js.native
    
    /**
      * The proxy configuration details for the App Mesh proxy.
      */
    val proxyConfiguration: Output_[js.UndefOr[TaskDefinitionProxyConfiguration]] = js.native
    
    /**
      * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
      */
    val requiresCompatibilities: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The revision of the task in a particular family.
      */
    val revision: Output_[Double] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
      */
    val taskRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A set of volume blocks that containers in your task may use.
      */
    val volumes: Output_[js.UndefOr[js.Array[TaskDefinitionVolume]]] = js.native
  }
  /* static members */
  object TaskDefinition {
    
    @JSImport("@pulumi/aws/ecs/taskDefinition", "TaskDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): TaskDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TaskDefinition]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TaskDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TaskDefinition]
    inline def get(name: String, id: Input[ID], state: TaskDefinitionState): TaskDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TaskDefinition]
    inline def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): TaskDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TaskDefinition]
    
    /**
      * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean]
  }
  
  trait TaskDefinitionArgs extends StObject {
    
    /**
      * A list of valid [container
      * definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
      * provided as a single valid JSON document. Please note that you should only
      * provide values that are part of the container definition document. For a
      * detailed description of what parameters are available, see the [Task Definition
      * Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
      * section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
      */
    val containerDefinitions: Input[String]
    
    /**
      * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val cpu: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
      */
    val executionRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique name for your task definition.
      */
    val family: Input[String]
    
    /**
      * Configuration block(s) with Inference Accelerators settings. Detailed below.
      */
    val inferenceAccelerators: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]]
        ]
      ] = js.undefined
    
    /**
      * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
      */
    val ipcMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val memory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
      */
    val networkMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
      */
    val pidMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
      */
    val placementConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]]
        ]
      ] = js.undefined
    
    /**
      * The proxy configuration details for the App Mesh proxy.
      */
    val proxyConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration]] = js.undefined
    
    /**
      * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
      */
    val requiresCompatibilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
      */
    val taskRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of volume blocks that containers in your task may use.
      */
    val volumes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]]]] = js.undefined
  }
  object TaskDefinitionArgs {
    
    inline def apply(containerDefinitions: Input[String], family: Input[String]): TaskDefinitionArgs = {
      val __obj = js.Dynamic.literal(containerDefinitions = containerDefinitions.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDefinitionArgs]
    }
    
    extension [Self <: TaskDefinitionArgs](x: Self) {
      
      inline def setContainerDefinitions(value: Input[String]): Self = StObject.set(x, "containerDefinitions", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: Input[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
      
      inline def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setInferenceAccelerators(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]]
            ]
      ): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
      
      inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
      
      inline def setInferenceAcceleratorsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value :_*))
      
      inline def setIpcMode(value: Input[String]): Self = StObject.set(x, "ipcMode", value.asInstanceOf[js.Any])
      
      inline def setIpcModeUndefined: Self = StObject.set(x, "ipcMode", js.undefined)
      
      inline def setMemory(value: Input[String]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setNetworkMode(value: Input[String]): Self = StObject.set(x, "networkMode", value.asInstanceOf[js.Any])
      
      inline def setNetworkModeUndefined: Self = StObject.set(x, "networkMode", js.undefined)
      
      inline def setPidMode(value: Input[String]): Self = StObject.set(x, "pidMode", value.asInstanceOf[js.Any])
      
      inline def setPidModeUndefined: Self = StObject.set(x, "pidMode", js.undefined)
      
      inline def setPlacementConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]]
            ]
      ): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
      
      inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
      
      inline def setPlacementConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]*): Self = StObject.set(x, "placementConstraints", js.Array(value :_*))
      
      inline def setProxyConfiguration(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration]): Self = StObject.set(x, "proxyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setProxyConfigurationUndefined: Self = StObject.set(x, "proxyConfiguration", js.undefined)
      
      inline def setRequiresCompatibilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "requiresCompatibilities", value.asInstanceOf[js.Any])
      
      inline def setRequiresCompatibilitiesUndefined: Self = StObject.set(x, "requiresCompatibilities", js.undefined)
      
      inline def setRequiresCompatibilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "requiresCompatibilities", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTaskRoleArn(value: Input[String]): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
      
      inline def setTaskRoleArnUndefined: Self = StObject.set(x, "taskRoleArn", js.undefined)
      
      inline def setVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
      
      inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
      
      inline def setVolumesVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]*): Self = StObject.set(x, "volumes", js.Array(value :_*))
    }
  }
  
  trait TaskDefinitionState extends StObject {
    
    /**
      * Full ARN of the Task Definition (including both `family` and `revision`).
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of valid [container
      * definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
      * provided as a single valid JSON document. Please note that you should only
      * provide values that are part of the container definition document. For a
      * detailed description of what parameters are available, see the [Task Definition
      * Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
      * section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
      */
    val containerDefinitions: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val cpu: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
      */
    val executionRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique name for your task definition.
      */
    val family: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) with Inference Accelerators settings. Detailed below.
      */
    val inferenceAccelerators: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]]
        ]
      ] = js.undefined
    
    /**
      * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
      */
    val ipcMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
      */
    val memory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
      */
    val networkMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
      */
    val pidMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
      */
    val placementConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]]
        ]
      ] = js.undefined
    
    /**
      * The proxy configuration details for the App Mesh proxy.
      */
    val proxyConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration]] = js.undefined
    
    /**
      * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
      */
    val requiresCompatibilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The revision of the task in a particular family.
      */
    val revision: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
      */
    val taskRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of volume blocks that containers in your task may use.
      */
    val volumes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]]]] = js.undefined
  }
  object TaskDefinitionState {
    
    inline def apply(): TaskDefinitionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskDefinitionState]
    }
    
    extension [Self <: TaskDefinitionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setContainerDefinitions(value: Input[String]): Self = StObject.set(x, "containerDefinitions", value.asInstanceOf[js.Any])
      
      inline def setContainerDefinitionsUndefined: Self = StObject.set(x, "containerDefinitions", js.undefined)
      
      inline def setCpu(value: Input[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
      
      inline def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setInferenceAccelerators(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]]
            ]
      ): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
      
      inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
      
      inline def setInferenceAcceleratorsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator]*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value :_*))
      
      inline def setIpcMode(value: Input[String]): Self = StObject.set(x, "ipcMode", value.asInstanceOf[js.Any])
      
      inline def setIpcModeUndefined: Self = StObject.set(x, "ipcMode", js.undefined)
      
      inline def setMemory(value: Input[String]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setNetworkMode(value: Input[String]): Self = StObject.set(x, "networkMode", value.asInstanceOf[js.Any])
      
      inline def setNetworkModeUndefined: Self = StObject.set(x, "networkMode", js.undefined)
      
      inline def setPidMode(value: Input[String]): Self = StObject.set(x, "pidMode", value.asInstanceOf[js.Any])
      
      inline def setPidModeUndefined: Self = StObject.set(x, "pidMode", js.undefined)
      
      inline def setPlacementConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]]
            ]
      ): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
      
      inline def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
      
      inline def setPlacementConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint]*): Self = StObject.set(x, "placementConstraints", js.Array(value :_*))
      
      inline def setProxyConfiguration(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration]): Self = StObject.set(x, "proxyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setProxyConfigurationUndefined: Self = StObject.set(x, "proxyConfiguration", js.undefined)
      
      inline def setRequiresCompatibilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "requiresCompatibilities", value.asInstanceOf[js.Any])
      
      inline def setRequiresCompatibilitiesUndefined: Self = StObject.set(x, "requiresCompatibilities", js.undefined)
      
      inline def setRequiresCompatibilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "requiresCompatibilities", js.Array(value :_*))
      
      inline def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTaskRoleArn(value: Input[String]): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
      
      inline def setTaskRoleArnUndefined: Self = StObject.set(x, "taskRoleArn", js.undefined)
      
      inline def setVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
      
      inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
      
      inline def setVolumesVarargs(value: Input[typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume]*): Self = StObject.set(x, "volumes", js.Array(value :_*))
    }
  }
}
