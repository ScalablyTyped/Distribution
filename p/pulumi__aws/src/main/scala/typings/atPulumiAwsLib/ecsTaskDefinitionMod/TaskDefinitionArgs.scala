package typings
package atPulumiAwsLib.ecsTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionArgs extends js.Object {
  /**
    * A list of valid [container definitions]
    * (http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a
    * single valid JSON document. Please note that you should only provide values that are part of the container
    * definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters]
    * (https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the
    * official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
    */
  val containerDefinitions: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
    */
  val cpu: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  val executionRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique name for your task definition.
    */
  val family: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
    */
  val ipcMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
    */
  val memory: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
    */
  val networkMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
    */
  val pidMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`.
    */
  val placementConstraints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExpressionTypeInput]]
    ]
  ] = js.undefined
  /**
    * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
    */
  val requiresCompatibilities: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
    */
  val taskRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A set of volume blocks that containers in your task may use.
    */
  val volumes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DockerVolumeConfigurationHostPath]
      ]
    ]
  ] = js.undefined
}

object TaskDefinitionArgs {
  @scala.inline
  def apply(
    containerDefinitions: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    family: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    cpu: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    executionRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipcMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    memory: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pidMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    placementConstraints: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExpressionTypeInput]]
    ] = null,
    requiresCompatibilities: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    taskRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    volumes: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DockerVolumeConfigurationHostPath]
      ]
    ] = null
  ): TaskDefinitionArgs = {
    val __obj = js.Dynamic.literal(containerDefinitions = containerDefinitions.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (ipcMode != null) __obj.updateDynamic("ipcMode")(ipcMode.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (networkMode != null) __obj.updateDynamic("networkMode")(networkMode.asInstanceOf[js.Any])
    if (pidMode != null) __obj.updateDynamic("pidMode")(pidMode.asInstanceOf[js.Any])
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints.asInstanceOf[js.Any])
    if (requiresCompatibilities != null) __obj.updateDynamic("requiresCompatibilities")(requiresCompatibilities.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskRoleArn != null) __obj.updateDynamic("taskRoleArn")(taskRoleArn.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionArgs]
  }
}

