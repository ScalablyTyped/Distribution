package typings.pulumiAws.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.ServiceCapacityProviderStrategy
import typings.pulumiAws.inputMod.ecs.ServiceDeploymentController
import typings.pulumiAws.inputMod.ecs.ServiceLoadBalancer
import typings.pulumiAws.inputMod.ecs.ServiceNetworkConfiguration
import typings.pulumiAws.inputMod.ecs.ServiceOrderedPlacementStrategy
import typings.pulumiAws.inputMod.ecs.ServicePlacementConstraint
import typings.pulumiAws.inputMod.ecs.ServiceServiceRegistries
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceArgs extends js.Object {
  /**
    * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
    */
  val capacityProviderStrategies: js.UndefOr[Input[js.Array[Input[ServiceCapacityProviderStrategy]]]] = js.native
  /**
    * ARN of an ECS cluster
    */
  val cluster: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing deployment controller configuration. Defined below.
    */
  val deploymentController: js.UndefOr[Input[ServiceDeploymentController]] = js.native
  /**
    * The upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
    */
  val deploymentMaximumPercent: js.UndefOr[Input[Double]] = js.native
  /**
    * The lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
    */
  val deploymentMinimumHealthyPercent: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
    */
  val desiredCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
    */
  val enableEcsManagedTags: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g. `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `orderedPlacementStrategy` and `placementConstraints` updates.
    */
  val forceNewDeployment: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
    */
  val healthCheckGracePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
    */
  val iamRole: js.UndefOr[Input[String]] = js.native
  /**
    * The launch type on which to run your service. The valid values are `EC2` and `FARGATE`. Defaults to `EC2`.
    */
  val launchType: js.UndefOr[Input[String]] = js.native
  /**
    * A load balancer block. Load balancers documented below.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[ServiceLoadBalancer]]]] = js.native
  /**
    * The name of the service (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes.
    */
  val networkConfiguration: js.UndefOr[Input[ServiceNetworkConfiguration]] = js.native
  /**
    * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. Defined below.
    */
  val orderedPlacementStrategies: js.UndefOr[Input[js.Array[Input[ServiceOrderedPlacementStrategy]]]] = js.native
  /**
    * rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. Defined below.
    */
  val placementConstraints: js.UndefOr[Input[js.Array[Input[ServicePlacementConstraint]]]] = js.native
  /**
    * The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  val platformVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
    */
  val propagateTags: js.UndefOr[Input[String]] = js.native
  /**
    * The scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
    */
  val schedulingStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`.
    */
  val serviceRegistries: js.UndefOr[Input[ServiceServiceRegistries]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
    */
  val taskDefinition: js.UndefOr[Input[String]] = js.native
  val waitForSteadyState: js.UndefOr[Input[Boolean]] = js.native
}

object ServiceArgs {
  @scala.inline
  def apply(): ServiceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceArgs]
  }
  @scala.inline
  implicit class ServiceArgsOps[Self <: ServiceArgs] (val x: Self) extends AnyVal {
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
    def setCapacityProviderStrategiesVarargs(value: Input[ServiceCapacityProviderStrategy]*): Self = this.set("capacityProviderStrategies", js.Array(value :_*))
    @scala.inline
    def setCapacityProviderStrategies(value: Input[js.Array[Input[ServiceCapacityProviderStrategy]]]): Self = this.set("capacityProviderStrategies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityProviderStrategies: Self = this.set("capacityProviderStrategies", js.undefined)
    @scala.inline
    def setCluster(value: Input[String]): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setDeploymentController(value: Input[ServiceDeploymentController]): Self = this.set("deploymentController", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentController: Self = this.set("deploymentController", js.undefined)
    @scala.inline
    def setDeploymentMaximumPercent(value: Input[Double]): Self = this.set("deploymentMaximumPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentMaximumPercent: Self = this.set("deploymentMaximumPercent", js.undefined)
    @scala.inline
    def setDeploymentMinimumHealthyPercent(value: Input[Double]): Self = this.set("deploymentMinimumHealthyPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentMinimumHealthyPercent: Self = this.set("deploymentMinimumHealthyPercent", js.undefined)
    @scala.inline
    def setDesiredCount(value: Input[Double]): Self = this.set("desiredCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredCount: Self = this.set("desiredCount", js.undefined)
    @scala.inline
    def setEnableEcsManagedTags(value: Input[Boolean]): Self = this.set("enableEcsManagedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEcsManagedTags: Self = this.set("enableEcsManagedTags", js.undefined)
    @scala.inline
    def setForceNewDeployment(value: Input[Boolean]): Self = this.set("forceNewDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceNewDeployment: Self = this.set("forceNewDeployment", js.undefined)
    @scala.inline
    def setHealthCheckGracePeriodSeconds(value: Input[Double]): Self = this.set("healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckGracePeriodSeconds: Self = this.set("healthCheckGracePeriodSeconds", js.undefined)
    @scala.inline
    def setIamRole(value: Input[String]): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRole: Self = this.set("iamRole", js.undefined)
    @scala.inline
    def setLaunchType(value: Input[String]): Self = this.set("launchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    @scala.inline
    def setLoadBalancersVarargs(value: Input[ServiceLoadBalancer]*): Self = this.set("loadBalancers", js.Array(value :_*))
    @scala.inline
    def setLoadBalancers(value: Input[js.Array[Input[ServiceLoadBalancer]]]): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancers: Self = this.set("loadBalancers", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkConfiguration(value: Input[ServiceNetworkConfiguration]): Self = this.set("networkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfiguration: Self = this.set("networkConfiguration", js.undefined)
    @scala.inline
    def setOrderedPlacementStrategiesVarargs(value: Input[ServiceOrderedPlacementStrategy]*): Self = this.set("orderedPlacementStrategies", js.Array(value :_*))
    @scala.inline
    def setOrderedPlacementStrategies(value: Input[js.Array[Input[ServiceOrderedPlacementStrategy]]]): Self = this.set("orderedPlacementStrategies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedPlacementStrategies: Self = this.set("orderedPlacementStrategies", js.undefined)
    @scala.inline
    def setPlacementConstraintsVarargs(value: Input[ServicePlacementConstraint]*): Self = this.set("placementConstraints", js.Array(value :_*))
    @scala.inline
    def setPlacementConstraints(value: Input[js.Array[Input[ServicePlacementConstraint]]]): Self = this.set("placementConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementConstraints: Self = this.set("placementConstraints", js.undefined)
    @scala.inline
    def setPlatformVersion(value: Input[String]): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    @scala.inline
    def setPropagateTags(value: Input[String]): Self = this.set("propagateTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagateTags: Self = this.set("propagateTags", js.undefined)
    @scala.inline
    def setSchedulingStrategy(value: Input[String]): Self = this.set("schedulingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedulingStrategy: Self = this.set("schedulingStrategy", js.undefined)
    @scala.inline
    def setServiceRegistries(value: Input[ServiceServiceRegistries]): Self = this.set("serviceRegistries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRegistries: Self = this.set("serviceRegistries", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTaskDefinition(value: Input[String]): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefinition: Self = this.set("taskDefinition", js.undefined)
    @scala.inline
    def setWaitForSteadyState(value: Input[Boolean]): Self = this.set("waitForSteadyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForSteadyState: Self = this.set("waitForSteadyState", js.undefined)
  }
  
}

