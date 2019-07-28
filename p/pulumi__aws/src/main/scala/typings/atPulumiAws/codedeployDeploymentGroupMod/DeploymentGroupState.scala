package typings.atPulumiAws.codedeployDeploymentGroupMod

import typings.atPulumiAws.Anon_AlarmsEnabled
import typings.atPulumiAws.Anon_ClusterNameServiceName
import typings.atPulumiAws.Anon_DeploymentOptionDeploymentType
import typings.atPulumiAws.Anon_DeploymentReadyOptionGreenFleetProvisioningOption
import typings.atPulumiAws.Anon_Ec2TagFiltersAnonKeyTypeValueInput
import typings.atPulumiAws.Anon_ElbInfosTargetGroupInfos
import typings.atPulumiAws.Anon_EnabledEventsArray
import typings.atPulumiAws.Anon_KeyTypeValueInput
import typings.atPulumiAws.Anon_TriggerEventsTriggerName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupState extends js.Object {
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: js.UndefOr[Input[Anon_AlarmsEnabled]] = js.undefined
  /**
    * The name of the application.
    */
  val appName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: js.UndefOr[Input[Anon_EnabledEventsArray]] = js.undefined
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: js.UndefOr[Input[Anon_DeploymentReadyOptionGreenFleetProvisioningOption]] = js.undefined
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: js.UndefOr[Input[Anon_DeploymentOptionDeploymentType]] = js.undefined
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: js.UndefOr[Input[js.Array[Input[Anon_KeyTypeValueInput]]]] = js.undefined
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: js.UndefOr[Input[js.Array[Input[Anon_Ec2TagFiltersAnonKeyTypeValueInput]]]] = js.undefined
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: js.UndefOr[Input[Anon_ClusterNameServiceName]] = js.undefined
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: js.UndefOr[Input[Anon_ElbInfosTargetGroupInfos]] = js.undefined
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: js.UndefOr[Input[js.Array[Input[Anon_KeyTypeValueInput]]]] = js.undefined
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: js.UndefOr[Input[js.Array[Input[Anon_TriggerEventsTriggerName]]]] = js.undefined
}

object DeploymentGroupState {
  @scala.inline
  def apply(
    alarmConfiguration: Input[Anon_AlarmsEnabled] = null,
    appName: Input[String] = null,
    autoRollbackConfiguration: Input[Anon_EnabledEventsArray] = null,
    autoscalingGroups: Input[js.Array[Input[String]]] = null,
    blueGreenDeploymentConfig: Input[Anon_DeploymentReadyOptionGreenFleetProvisioningOption] = null,
    deploymentConfigName: Input[String] = null,
    deploymentGroupName: Input[String] = null,
    deploymentStyle: Input[Anon_DeploymentOptionDeploymentType] = null,
    ec2TagFilters: Input[js.Array[Input[Anon_KeyTypeValueInput]]] = null,
    ec2TagSets: Input[js.Array[Input[Anon_Ec2TagFiltersAnonKeyTypeValueInput]]] = null,
    ecsService: Input[Anon_ClusterNameServiceName] = null,
    loadBalancerInfo: Input[Anon_ElbInfosTargetGroupInfos] = null,
    onPremisesInstanceTagFilters: Input[js.Array[Input[Anon_KeyTypeValueInput]]] = null,
    serviceRoleArn: Input[String] = null,
    triggerConfigurations: Input[js.Array[Input[Anon_TriggerEventsTriggerName]]] = null
  ): DeploymentGroupState = {
    val __obj = js.Dynamic.literal()
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfig != null) __obj.updateDynamic("blueGreenDeploymentConfig")(blueGreenDeploymentConfig.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    if (ec2TagSets != null) __obj.updateDynamic("ec2TagSets")(ec2TagSets.asInstanceOf[js.Any])
    if (ecsService != null) __obj.updateDynamic("ecsService")(ecsService.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupState]
  }
}

