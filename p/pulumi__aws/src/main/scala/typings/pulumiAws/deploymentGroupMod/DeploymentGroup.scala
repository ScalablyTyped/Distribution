package typings.pulumiAws.deploymentGroupMod

import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupAlarmConfiguration
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupDeploymentStyle
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEc2TagFilter
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEc2TagSet
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEcsService
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupLoadBalancerInfo
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupTriggerConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup")
@js.native
class DeploymentGroup protected () extends CustomResource {
  /**
    * Create a DeploymentGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentGroupArgs) = this()
  def this(name: String, args: DeploymentGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: Output_[js.UndefOr[DeploymentGroupAlarmConfiguration]] = js.native
  
  /**
    * The name of the application.
    */
  val appName: Output_[String] = js.native
  
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: Output_[js.UndefOr[DeploymentGroupAutoRollbackConfiguration]] = js.native
  
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: Output_[DeploymentGroupBlueGreenDeploymentConfig] = js.native
  
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: Output_[String] = js.native
  
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: Output_[js.UndefOr[DeploymentGroupDeploymentStyle]] = js.native
  
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: Output_[js.UndefOr[js.Array[DeploymentGroupEc2TagFilter]]] = js.native
  
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: Output_[js.UndefOr[js.Array[DeploymentGroupEc2TagSet]]] = js.native
  
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: Output_[js.UndefOr[DeploymentGroupEcsService]] = js.native
  
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: Output_[js.UndefOr[DeploymentGroupLoadBalancerInfo]] = js.native
  
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: Output_[js.UndefOr[js.Array[DeploymentGroupOnPremisesInstanceTagFilter]]] = js.native
  
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: Output_[String] = js.native
  
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: Output_[js.UndefOr[js.Array[DeploymentGroupTriggerConfiguration]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup")
@js.native
object DeploymentGroup extends js.Object {
  
  /**
    * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DeploymentGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeploymentGroup = js.native
  def get(name: String, id: Input[ID], state: DeploymentGroupState): DeploymentGroup = js.native
  def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): DeploymentGroup = js.native
  
  /**
    * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
}
