package typings.atPulumiAws.ecsServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AssignPublicIp
import typings.atPulumiAws.Anon_ContainerName
import typings.atPulumiAws.Anon_ContainerNameContainerPort
import typings.atPulumiAws.Anon_ExpressionType
import typings.atPulumiAws.Anon_FieldType
import typings.atPulumiAws.Anon_Type
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs/service", "Service")
@js.native
class Service protected () extends CustomResource {
  /**
    * Create a Service resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServiceArgs) = this()
  def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  /**
    * ARN of an ECS cluster
    */
  val cluster: Output[String] = js.native
  /**
    * Configuration block containing deployment controller configuration. Defined below.
    */
  val deploymentController: Output[js.UndefOr[Anon_Type]] = js.native
  /**
    * The upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
    */
  val deploymentMaximumPercent: Output[js.UndefOr[Double]] = js.native
  /**
    * The lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
    */
  val deploymentMinimumHealthyPercent: Output[js.UndefOr[Double]] = js.native
  /**
    * The number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
    */
  val desiredCount: Output[js.UndefOr[Double]] = js.native
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
    */
  val enableEcsManagedTags: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
    */
  val healthCheckGracePeriodSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
    */
  val iamRole: Output[String] = js.native
  /**
    * The launch type on which to run your service. The valid values are `EC2` and `FARGATE`. Defaults to `EC2`.
    */
  val launchType: Output[js.UndefOr[String]] = js.native
  /**
    * A load balancer block. Load balancers documented below.
    */
  val loadBalancers: Output[js.UndefOr[js.Array[Anon_ContainerName]]] = js.native
  /**
    * The name of the service (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: Output[String] = js.native
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes.
    */
  val networkConfiguration: Output[js.UndefOr[Anon_AssignPublicIp]] = js.native
  /**
    * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. The maximum number of `orderedPlacementStrategy` blocks is `5`. Defined below.
    */
  val orderedPlacementStrategies: Output[js.UndefOr[js.Array[Anon_FieldType]]] = js.native
  /**
    * rules that are taken into consideration during task placement. Maximum number of
    * `placementConstraints` is `10`. Defined below.
    */
  val placementConstraints: Output[js.UndefOr[js.Array[Anon_ExpressionType]]] = js.native
  /**
    * The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  val platformVersion: Output[String] = js.native
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
    */
  val propagateTags: Output[js.UndefOr[String]] = js.native
  /**
    * The scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Fargate tasks do not support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html).
    */
  val schedulingStrategy: Output[js.UndefOr[String]] = js.native
  /**
    * The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`.
    */
  val serviceRegistries: Output[js.UndefOr[Anon_ContainerNameContainerPort]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
    */
  val taskDefinition: Output[String] = js.native
  /**
    * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
    */
  val waitForSteadyState: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecs/service", "Service")
@js.native
object Service extends js.Object {
  /**
    * Get an existing Service resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): Service = js.native
  /**
    * Returns true if the given object is an instance of Service.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
}

