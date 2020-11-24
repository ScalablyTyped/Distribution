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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(appName: Input[String], deploymentGroupName: Input[String], serviceRoleArn: Input[String]): DeploymentGroupArgs = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupArgs]
  }
  
  @scala.inline
  implicit class DeploymentGroupArgsOps[Self <: DeploymentGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: Input[String]): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupName(value: Input[String]): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmConfiguration(value: Input[DeploymentGroupAlarmConfiguration]): Self = this.set("alarmConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmConfiguration: Self = this.set("alarmConfiguration", js.undefined)
    
    @scala.inline
    def setAutoRollbackConfiguration(value: Input[DeploymentGroupAutoRollbackConfiguration]): Self = this.set("autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRollbackConfiguration: Self = this.set("autoRollbackConfiguration", js.undefined)
    
    @scala.inline
    def setAutoscalingGroupsVarargs(value: Input[String]*): Self = this.set("autoscalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = this.set("autoscalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingGroups: Self = this.set("autoscalingGroups", js.undefined)
    
    @scala.inline
    def setBlueGreenDeploymentConfig(value: Input[DeploymentGroupBlueGreenDeploymentConfig]): Self = this.set("blueGreenDeploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueGreenDeploymentConfig: Self = this.set("blueGreenDeploymentConfig", js.undefined)
    
    @scala.inline
    def setDeploymentConfigName(value: Input[String]): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
    
    @scala.inline
    def setDeploymentStyle(value: Input[DeploymentGroupDeploymentStyle]): Self = this.set("deploymentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentStyle: Self = this.set("deploymentStyle", js.undefined)
    
    @scala.inline
    def setEc2TagFiltersVarargs(value: Input[DeploymentGroupEc2TagFilter]*): Self = this.set("ec2TagFilters", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagFilters(value: Input[js.Array[Input[DeploymentGroupEc2TagFilter]]]): Self = this.set("ec2TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2TagFilters: Self = this.set("ec2TagFilters", js.undefined)
    
    @scala.inline
    def setEc2TagSetsVarargs(value: Input[DeploymentGroupEc2TagSet]*): Self = this.set("ec2TagSets", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagSets(value: Input[js.Array[Input[DeploymentGroupEc2TagSet]]]): Self = this.set("ec2TagSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2TagSets: Self = this.set("ec2TagSets", js.undefined)
    
    @scala.inline
    def setEcsService(value: Input[DeploymentGroupEcsService]): Self = this.set("ecsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsService: Self = this.set("ecsService", js.undefined)
    
    @scala.inline
    def setLoadBalancerInfo(value: Input[DeploymentGroupLoadBalancerInfo]): Self = this.set("loadBalancerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerInfo: Self = this.set("loadBalancerInfo", js.undefined)
    
    @scala.inline
    def setOnPremisesInstanceTagFiltersVarargs(value: Input[DeploymentGroupOnPremisesInstanceTagFilter]*): Self = this.set("onPremisesInstanceTagFilters", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesInstanceTagFilters(value: Input[js.Array[Input[DeploymentGroupOnPremisesInstanceTagFilter]]]): Self = this.set("onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesInstanceTagFilters: Self = this.set("onPremisesInstanceTagFilters", js.undefined)
    
    @scala.inline
    def setTriggerConfigurationsVarargs(value: Input[DeploymentGroupTriggerConfiguration]*): Self = this.set("triggerConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConfigurations(value: Input[js.Array[Input[DeploymentGroupTriggerConfiguration]]]): Self = this.set("triggerConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerConfigurations: Self = this.set("triggerConfigurations", js.undefined)
  }
}
