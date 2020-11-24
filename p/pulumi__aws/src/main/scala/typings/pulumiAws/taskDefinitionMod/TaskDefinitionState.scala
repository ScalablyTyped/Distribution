package typings.pulumiAws.taskDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator
import typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint
import typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration
import typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionState extends js.Object {
  
  /**
    * Full ARN of the Task Definition (including both `family` and `revision`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of valid [container
    * definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
    * provided as a single valid JSON document. Please note that you should only
    * provide values that are part of the container definition document. For a
    * detailed description of what parameters are available, see the [Task Definition
    * Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
    * section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
    */
  val containerDefinitions: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val cpu: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique name for your task definition.
    */
  val family: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block(s) with Inference Accelerators settings. Detailed below.
    */
  val inferenceAccelerators: js.UndefOr[Input[js.Array[Input[TaskDefinitionInferenceAccelerator]]]] = js.native
  
  /**
    * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
    */
  val ipcMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val memory: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
    */
  val networkMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
    */
  val pidMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
    */
  val placementConstraints: js.UndefOr[Input[js.Array[Input[TaskDefinitionPlacementConstraint]]]] = js.native
  
  /**
    * The proxy configuration details for the App Mesh proxy.
    */
  val proxyConfiguration: js.UndefOr[Input[TaskDefinitionProxyConfiguration]] = js.native
  
  /**
    * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
    */
  val requiresCompatibilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The revision of the task in a particular family.
    */
  val revision: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
    */
  val taskRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A set of volume blocks that containers in your task may use.
    */
  val volumes: js.UndefOr[Input[js.Array[Input[TaskDefinitionVolume]]]] = js.native
}
object TaskDefinitionState {
  
  @scala.inline
  def apply(): TaskDefinitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionState]
  }
  
  @scala.inline
  implicit class TaskDefinitionStateOps[Self <: TaskDefinitionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setContainerDefinitions(value: Input[String]): Self = this.set("containerDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerDefinitions: Self = this.set("containerDefinitions", js.undefined)
    
    @scala.inline
    def setCpu(value: Input[String]): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: Input[String]): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("executionRoleArn", js.undefined)
    
    @scala.inline
    def setFamily(value: Input[String]): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorsVarargs(value: Input[TaskDefinitionInferenceAccelerator]*): Self = this.set("inferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setInferenceAccelerators(value: Input[js.Array[Input[TaskDefinitionInferenceAccelerator]]]): Self = this.set("inferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceAccelerators: Self = this.set("inferenceAccelerators", js.undefined)
    
    @scala.inline
    def setIpcMode(value: Input[String]): Self = this.set("ipcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpcMode: Self = this.set("ipcMode", js.undefined)
    
    @scala.inline
    def setMemory(value: Input[String]): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setNetworkMode(value: Input[String]): Self = this.set("networkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkMode: Self = this.set("networkMode", js.undefined)
    
    @scala.inline
    def setPidMode(value: Input[String]): Self = this.set("pidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePidMode: Self = this.set("pidMode", js.undefined)
    
    @scala.inline
    def setPlacementConstraintsVarargs(value: Input[TaskDefinitionPlacementConstraint]*): Self = this.set("placementConstraints", js.Array(value :_*))
    
    @scala.inline
    def setPlacementConstraints(value: Input[js.Array[Input[TaskDefinitionPlacementConstraint]]]): Self = this.set("placementConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementConstraints: Self = this.set("placementConstraints", js.undefined)
    
    @scala.inline
    def setProxyConfiguration(value: Input[TaskDefinitionProxyConfiguration]): Self = this.set("proxyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyConfiguration: Self = this.set("proxyConfiguration", js.undefined)
    
    @scala.inline
    def setRequiresCompatibilitiesVarargs(value: Input[String]*): Self = this.set("requiresCompatibilities", js.Array(value :_*))
    
    @scala.inline
    def setRequiresCompatibilities(value: Input[js.Array[Input[String]]]): Self = this.set("requiresCompatibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresCompatibilities: Self = this.set("requiresCompatibilities", js.undefined)
    
    @scala.inline
    def setRevision(value: Input[Double]): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTaskRoleArn(value: Input[String]): Self = this.set("taskRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskRoleArn: Self = this.set("taskRoleArn", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Input[TaskDefinitionVolume]*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: Input[js.Array[Input[TaskDefinitionVolume]]]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
}
