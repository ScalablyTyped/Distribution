package typings
package atPulumiAwsLib.ecsServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceArgs extends js.Object {
  /**
    * ARN of an ECS cluster
    */
  val cluster: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block containing deployment controller configuration. Defined below.
    */
  val deploymentController: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput]] = js.undefined
  /**
    * The upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
    */
  val deploymentMaximumPercent: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
    */
  val deploymentMinimumHealthyPercent: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
    */
  val desiredCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
    */
  val enableEcsManagedTags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
    */
  val healthCheckGracePeriodSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
    */
  val iamRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The launch type on which to run your service. The valid values are `EC2` and `FARGATE`. Defaults to `EC2`.
    */
  val launchType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A load balancer block. Load balancers documented below.
    */
  val loadBalancers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerNameContainerPortElbName]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the service (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes.
    */
  val networkConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AssignPublicIpSecurityGroups]
  ] = js.undefined
  /**
    * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. The maximum number of `ordered_placement_strategy` blocks is `5`. Defined below.
    */
  val orderedPlacementStrategies: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldTypeInput]]]
  ] = js.undefined
  /**
    * rules that are taken into consideration during task placement. Maximum number of
    * `placement_constraints` is `10`. Defined below.
    */
  val placementConstraints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExpressionTypeInput]]
    ]
  ] = js.undefined
  /**
    * The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  val platformVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
    */
  val propagateTags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Fargate tasks do not support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html).
    */
  val schedulingStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`.
    */
  val serviceRegistries: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerNameContainerPortPort]
  ] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
    */
  val taskDefinition: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * If `true`, Terraform will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
    */
  val waitForSteadyState: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object ServiceArgs {
  @scala.inline
  def apply(
    taskDefinition: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    cluster: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deploymentController: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput] = null,
    deploymentMaximumPercent: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    deploymentMinimumHealthyPercent: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    desiredCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    enableEcsManagedTags: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    healthCheckGracePeriodSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    iamRole: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    launchType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    loadBalancers: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerNameContainerPortElbName]
      ]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AssignPublicIpSecurityGroups] = null,
    orderedPlacementStrategies: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldTypeInput]]] = null,
    placementConstraints: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExpressionTypeInput]]
    ] = null,
    platformVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    propagateTags: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    schedulingStrategy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceRegistries: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerNameContainerPortPort] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    waitForSteadyState: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): ServiceArgs = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (deploymentController != null) __obj.updateDynamic("deploymentController")(deploymentController.asInstanceOf[js.Any])
    if (deploymentMaximumPercent != null) __obj.updateDynamic("deploymentMaximumPercent")(deploymentMaximumPercent.asInstanceOf[js.Any])
    if (deploymentMinimumHealthyPercent != null) __obj.updateDynamic("deploymentMinimumHealthyPercent")(deploymentMinimumHealthyPercent.asInstanceOf[js.Any])
    if (desiredCount != null) __obj.updateDynamic("desiredCount")(desiredCount.asInstanceOf[js.Any])
    if (enableEcsManagedTags != null) __obj.updateDynamic("enableEcsManagedTags")(enableEcsManagedTags.asInstanceOf[js.Any])
    if (healthCheckGracePeriodSeconds != null) __obj.updateDynamic("healthCheckGracePeriodSeconds")(healthCheckGracePeriodSeconds.asInstanceOf[js.Any])
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (orderedPlacementStrategies != null) __obj.updateDynamic("orderedPlacementStrategies")(orderedPlacementStrategies.asInstanceOf[js.Any])
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (propagateTags != null) __obj.updateDynamic("propagateTags")(propagateTags.asInstanceOf[js.Any])
    if (schedulingStrategy != null) __obj.updateDynamic("schedulingStrategy")(schedulingStrategy.asInstanceOf[js.Any])
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (waitForSteadyState != null) __obj.updateDynamic("waitForSteadyState")(waitForSteadyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceArgs]
  }
}

