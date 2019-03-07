package typings
package atPulumiAwsLib.codedeployDeploymentGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup")
@js.native
class DeploymentGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DeploymentGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DeploymentGroupArgs) = this()
  def this(name: java.lang.String, args: DeploymentGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Alarms]] = js.native
  /**
    * The name of the application.
    */
  val appName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Enabled]] = js.native
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DeploymentReadyOption] = js.native
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DeploymentOption] = js.native
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeyTypeValueString]]] = js.native
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Ec2TagFilters]]] = js.native
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ClusterName]] = js.native
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_ElbInfos] = js.native
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeyTypeValueString]]] = js.native
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_TriggerEvents]]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupState
  ): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codedeployDeploymentGroupMod.DeploymentGroup = js.native
}

