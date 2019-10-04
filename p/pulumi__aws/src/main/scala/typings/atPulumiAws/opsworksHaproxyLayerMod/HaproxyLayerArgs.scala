package typings.atPulumiAws.opsworksHaproxyLayerMod

import typings.atPulumiAws.typesInputMod.opsworksNs.HaproxyLayerEbsVolume
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HaproxyLayerArgs extends js.Object {
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: js.UndefOr[Input[Boolean]] = js.undefined
  val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: js.UndefOr[Input[String]] = js.undefined
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: js.UndefOr[Input[js.Array[Input[HaproxyLayerEbsVolume]]]] = js.undefined
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: js.UndefOr[Input[String]] = js.undefined
  /**
    * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
    */
  val healthcheckMethod: js.UndefOr[Input[String]] = js.undefined
  /**
    * URL path to use for instance healthchecks. Defaults to "/".
    */
  val healthcheckUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.undefined
  /**
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: Input[String]
  /**
    * Whether to enable HAProxy stats.
    */
  val statsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The password to use for HAProxy stats.
    */
  val statsPassword: Input[String]
  /**
    * The HAProxy stats URL. Defaults to "/haproxy?stats".
    */
  val statsUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * The username for HAProxy stats. Defaults to "opsworks".
    */
  val statsUser: js.UndefOr[Input[String]] = js.undefined
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.undefined
}

object HaproxyLayerArgs {
  @scala.inline
  def apply(
    stackId: Input[String],
    statsPassword: Input[String],
    autoAssignElasticIps: Input[Boolean] = null,
    autoAssignPublicIps: Input[Boolean] = null,
    autoHealing: Input[Boolean] = null,
    customConfigureRecipes: Input[js.Array[Input[String]]] = null,
    customDeployRecipes: Input[js.Array[Input[String]]] = null,
    customInstanceProfileArn: Input[String] = null,
    customJson: Input[String] = null,
    customSecurityGroupIds: Input[js.Array[Input[String]]] = null,
    customSetupRecipes: Input[js.Array[Input[String]]] = null,
    customShutdownRecipes: Input[js.Array[Input[String]]] = null,
    customUndeployRecipes: Input[js.Array[Input[String]]] = null,
    drainElbOnShutdown: Input[Boolean] = null,
    ebsVolumes: Input[js.Array[Input[HaproxyLayerEbsVolume]]] = null,
    elasticLoadBalancer: Input[String] = null,
    healthcheckMethod: Input[String] = null,
    healthcheckUrl: Input[String] = null,
    installUpdatesOnBoot: Input[Boolean] = null,
    instanceShutdownTimeout: Input[Double] = null,
    name: Input[String] = null,
    statsEnabled: Input[Boolean] = null,
    statsUrl: Input[String] = null,
    statsUser: Input[String] = null,
    systemPackages: Input[js.Array[Input[String]]] = null,
    useEbsOptimizedInstances: Input[Boolean] = null
  ): HaproxyLayerArgs = {
    val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any], statsPassword = statsPassword.asInstanceOf[js.Any])
    if (autoAssignElasticIps != null) __obj.updateDynamic("autoAssignElasticIps")(autoAssignElasticIps.asInstanceOf[js.Any])
    if (autoAssignPublicIps != null) __obj.updateDynamic("autoAssignPublicIps")(autoAssignPublicIps.asInstanceOf[js.Any])
    if (autoHealing != null) __obj.updateDynamic("autoHealing")(autoHealing.asInstanceOf[js.Any])
    if (customConfigureRecipes != null) __obj.updateDynamic("customConfigureRecipes")(customConfigureRecipes.asInstanceOf[js.Any])
    if (customDeployRecipes != null) __obj.updateDynamic("customDeployRecipes")(customDeployRecipes.asInstanceOf[js.Any])
    if (customInstanceProfileArn != null) __obj.updateDynamic("customInstanceProfileArn")(customInstanceProfileArn.asInstanceOf[js.Any])
    if (customJson != null) __obj.updateDynamic("customJson")(customJson.asInstanceOf[js.Any])
    if (customSecurityGroupIds != null) __obj.updateDynamic("customSecurityGroupIds")(customSecurityGroupIds.asInstanceOf[js.Any])
    if (customSetupRecipes != null) __obj.updateDynamic("customSetupRecipes")(customSetupRecipes.asInstanceOf[js.Any])
    if (customShutdownRecipes != null) __obj.updateDynamic("customShutdownRecipes")(customShutdownRecipes.asInstanceOf[js.Any])
    if (customUndeployRecipes != null) __obj.updateDynamic("customUndeployRecipes")(customUndeployRecipes.asInstanceOf[js.Any])
    if (drainElbOnShutdown != null) __obj.updateDynamic("drainElbOnShutdown")(drainElbOnShutdown.asInstanceOf[js.Any])
    if (ebsVolumes != null) __obj.updateDynamic("ebsVolumes")(ebsVolumes.asInstanceOf[js.Any])
    if (elasticLoadBalancer != null) __obj.updateDynamic("elasticLoadBalancer")(elasticLoadBalancer.asInstanceOf[js.Any])
    if (healthcheckMethod != null) __obj.updateDynamic("healthcheckMethod")(healthcheckMethod.asInstanceOf[js.Any])
    if (healthcheckUrl != null) __obj.updateDynamic("healthcheckUrl")(healthcheckUrl.asInstanceOf[js.Any])
    if (installUpdatesOnBoot != null) __obj.updateDynamic("installUpdatesOnBoot")(installUpdatesOnBoot.asInstanceOf[js.Any])
    if (instanceShutdownTimeout != null) __obj.updateDynamic("instanceShutdownTimeout")(instanceShutdownTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (statsEnabled != null) __obj.updateDynamic("statsEnabled")(statsEnabled.asInstanceOf[js.Any])
    if (statsUrl != null) __obj.updateDynamic("statsUrl")(statsUrl.asInstanceOf[js.Any])
    if (statsUser != null) __obj.updateDynamic("statsUser")(statsUser.asInstanceOf[js.Any])
    if (systemPackages != null) __obj.updateDynamic("systemPackages")(systemPackages.asInstanceOf[js.Any])
    if (useEbsOptimizedInstances != null) __obj.updateDynamic("useEbsOptimizedInstances")(useEbsOptimizedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[HaproxyLayerArgs]
  }
}

