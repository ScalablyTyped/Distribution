package typings.pulumiAws.deploymentGroupMod

import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter
import typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupArgs extends js.Object {
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: js.UndefOr[Input[DeploymentGroupAlarmConfiguration]] = js.native
  /**
    * The name of the application.
    */
  val appName: Input[String] = js.native
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: js.UndefOr[Input[DeploymentGroupAutoRollbackConfiguration]] = js.native
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfig]] = js.native
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: Input[String] = js.native
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: js.UndefOr[Input[DeploymentGroupDeploymentStyle]] = js.native
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagFilter]]]] = js.native
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagSet]]]] = js.native
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: js.UndefOr[Input[DeploymentGroupEcsService]] = js.native
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: js.UndefOr[Input[DeploymentGroupLoadBalancerInfo]] = js.native
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupOnPremisesInstanceTagFilter]]]] = js.native
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: Input[String] = js.native
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: js.UndefOr[Input[js.Array[Input[DeploymentGroupTriggerConfiguration]]]] = js.native
}

object DeploymentGroupArgs {
  @scala.inline
  def apply(
    appName: Input[String],
    deploymentGroupName: Input[String],
    serviceRoleArn: Input[String],
    alarmConfiguration: Input[DeploymentGroupAlarmConfiguration] = null,
    autoRollbackConfiguration: Input[DeploymentGroupAutoRollbackConfiguration] = null,
    autoscalingGroups: Input[js.Array[Input[String]]] = null,
    blueGreenDeploymentConfig: Input[DeploymentGroupBlueGreenDeploymentConfig] = null,
    deploymentConfigName: Input[String] = null,
    deploymentStyle: Input[DeploymentGroupDeploymentStyle] = null,
    ec2TagFilters: Input[js.Array[Input[DeploymentGroupEc2TagFilter]]] = null,
    ec2TagSets: Input[js.Array[Input[DeploymentGroupEc2TagSet]]] = null,
    ecsService: Input[DeploymentGroupEcsService] = null,
    loadBalancerInfo: Input[DeploymentGroupLoadBalancerInfo] = null,
    onPremisesInstanceTagFilters: Input[js.Array[Input[DeploymentGroupOnPremisesInstanceTagFilter]]] = null,
    triggerConfigurations: Input[js.Array[Input[DeploymentGroupTriggerConfiguration]]] = null
  ): DeploymentGroupArgs = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfig != null) __obj.updateDynamic("blueGreenDeploymentConfig")(blueGreenDeploymentConfig.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    if (ec2TagSets != null) __obj.updateDynamic("ec2TagSets")(ec2TagSets.asInstanceOf[js.Any])
    if (ecsService != null) __obj.updateDynamic("ecsService")(ecsService.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters.asInstanceOf[js.Any])
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupArgs]
  }
}

