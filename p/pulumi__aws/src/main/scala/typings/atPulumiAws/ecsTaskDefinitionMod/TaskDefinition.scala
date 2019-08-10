package typings.atPulumiAws.ecsTaskDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ContainerNameKey
import typings.atPulumiAws.Anon_DockerVolumeConfiguration
import typings.atPulumiAws.Anon_ExpressionType
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val arn: Output[String] = js.native
  /**
    * A list of valid [container definitions]
    * (http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a
    * single valid JSON document. Please note that you should only provide values that are part of the container
    * definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters]
    * (https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the
    * official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
    */
  val containerDefinitions: Output[String] = js.native
  /**
    * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val cpu: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  val executionRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * A unique name for your task definition.
    */
  val family: Output[String] = js.native
  /**
    * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
    */
  val ipcMode: Output[js.UndefOr[String]] = js.native
  /**
    * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val memory: Output[js.UndefOr[String]] = js.native
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
    */
  val networkMode: Output[String] = js.native
  /**
    * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
    */
  val pidMode: Output[js.UndefOr[String]] = js.native
  /**
    * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
    */
  val placementConstraints: Output[js.UndefOr[js.Array[Anon_ExpressionType]]] = js.native
  /**
    * The proxy configuration details for the App Mesh proxy.
    */
  val proxyConfiguration: Output[js.UndefOr[Anon_ContainerNameKey]] = js.native
  /**
    * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
    */
  val requiresCompatibilities: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The revision of the task in a particular family.
    */
  val revision: Output[Double] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
    */
  val taskRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * A set of volume blocks that containers in your task may use.
    */
  val volumes: Output[js.UndefOr[js.Array[Anon_DockerVolumeConfiguration]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecs/taskDefinition", "TaskDefinition")
@js.native
object TaskDefinition extends js.Object {
  /**
    * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TaskDefinition = js.native
  def get(name: String, id: Input[ID], state: TaskDefinitionState): TaskDefinition = js.native
  def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): TaskDefinition = js.native
  /**
    * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = js.native
}

