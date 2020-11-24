package typings.pulumiAws.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecs.ServiceCapacityProviderStrategy
import typings.pulumiAws.outputMod.ecs.ServiceDeploymentController
import typings.pulumiAws.outputMod.ecs.ServiceLoadBalancer
import typings.pulumiAws.outputMod.ecs.ServiceNetworkConfiguration
import typings.pulumiAws.outputMod.ecs.ServiceOrderedPlacementStrategy
import typings.pulumiAws.outputMod.ecs.ServicePlacementConstraint
import typings.pulumiAws.outputMod.ecs.ServiceServiceRegistries
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(name: String) = this()
  def this(name: String, args: ServiceArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
    */
  val capacityProviderStrategies: Output_[js.UndefOr[js.Array[ServiceCapacityProviderStrategy]]] = js.native
  
  /**
    * ARN of an ECS cluster
    */
  val cluster: Output_[String] = js.native
  
  /**
    * Configuration block containing deployment controller configuration. Defined below.
    */
  val deploymentController: Output_[js.UndefOr[ServiceDeploymentController]] = js.native
  
  /**
    * The upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
    */
  val deploymentMaximumPercent: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
    */
  val deploymentMinimumHealthyPercent: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
    */
  val desiredCount: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
    */
  val enableEcsManagedTags: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g. `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `orderedPlacementStrategy` and `placementConstraints` updates.
    */
  val forceNewDeployment: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
    */
  val healthCheckGracePeriodSeconds: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
    */
  val iamRole: Output_[String] = js.native
  
  /**
    * The launch type on which to run your service. The valid values are `EC2` and `FARGATE`. Defaults to `EC2`.
    */
  val launchType: Output_[String] = js.native
  
  /**
    * A load balancer block. Load balancers documented below.
    */
  val loadBalancers: Output_[js.UndefOr[js.Array[ServiceLoadBalancer]]] = js.native
  
  /**
    * The name of the service (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: Output_[String] = js.native
  
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes.
    */
  val networkConfiguration: Output_[js.UndefOr[ServiceNetworkConfiguration]] = js.native
  
  /**
    * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. Defined below.
    */
  val orderedPlacementStrategies: Output_[js.UndefOr[js.Array[ServiceOrderedPlacementStrategy]]] = js.native
  
  /**
    * rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. Defined below.
    */
  val placementConstraints: Output_[js.UndefOr[js.Array[ServicePlacementConstraint]]] = js.native
  
  /**
    * The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  val platformVersion: Output_[String] = js.native
  
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
    */
  val propagateTags: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
    */
  val schedulingStrategy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`.
    */
  val serviceRegistries: Output_[js.UndefOr[ServiceServiceRegistries]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
    */
  val taskDefinition: Output_[js.UndefOr[String]] = js.native
  
  val waitForSteadyState: Output_[js.UndefOr[Boolean]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Service = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): Service = js.native
  
  /**
    * Returns true if the given object is an instance of Service.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
}
