package typings.pulumiAws.taskDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.TaskDefinitionInferenceAccelerator
import typings.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint
import typings.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration
import typings.pulumiAws.inputMod.ecs.TaskDefinitionVolume
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionState extends js.Object {
  /**
    * Full ARN of the Task Definition (including both `family` and `revision`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of valid [container definitions]
    * (http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a
    * single valid JSON document. Please note that you should only provide values that are part of the container
    * definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters]
    * (https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the
    * official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
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
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
  def apply(
    arn: Input[String] = null,
    containerDefinitions: Input[String] = null,
    cpu: Input[String] = null,
    executionRoleArn: Input[String] = null,
    family: Input[String] = null,
    inferenceAccelerators: Input[js.Array[Input[TaskDefinitionInferenceAccelerator]]] = null,
    ipcMode: Input[String] = null,
    memory: Input[String] = null,
    networkMode: Input[String] = null,
    pidMode: Input[String] = null,
    placementConstraints: Input[js.Array[Input[TaskDefinitionPlacementConstraint]]] = null,
    proxyConfiguration: Input[TaskDefinitionProxyConfiguration] = null,
    requiresCompatibilities: Input[js.Array[Input[String]]] = null,
    revision: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null,
    taskRoleArn: Input[String] = null,
    volumes: Input[js.Array[Input[TaskDefinitionVolume]]] = null
  ): TaskDefinitionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (containerDefinitions != null) __obj.updateDynamic("containerDefinitions")(containerDefinitions.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (inferenceAccelerators != null) __obj.updateDynamic("inferenceAccelerators")(inferenceAccelerators.asInstanceOf[js.Any])
    if (ipcMode != null) __obj.updateDynamic("ipcMode")(ipcMode.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (networkMode != null) __obj.updateDynamic("networkMode")(networkMode.asInstanceOf[js.Any])
    if (pidMode != null) __obj.updateDynamic("pidMode")(pidMode.asInstanceOf[js.Any])
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints.asInstanceOf[js.Any])
    if (proxyConfiguration != null) __obj.updateDynamic("proxyConfiguration")(proxyConfiguration.asInstanceOf[js.Any])
    if (requiresCompatibilities != null) __obj.updateDynamic("requiresCompatibilities")(requiresCompatibilities.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskRoleArn != null) __obj.updateDynamic("taskRoleArn")(taskRoleArn.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionState]
  }
}

