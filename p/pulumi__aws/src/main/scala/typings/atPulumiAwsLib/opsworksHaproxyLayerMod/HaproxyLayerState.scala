package typings
package atPulumiAwsLib.opsworksHaproxyLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HaproxyLayerState extends js.Object {
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val customConfigureRecipes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val customDeployRecipes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val customSetupRecipes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val customShutdownRecipes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val customUndeployRecipes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IopsMountPointNumberOfDisks]
      ]
    ]
  ] = js.undefined
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
    */
  val healthcheckMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * URL path to use for instance healthchecks. Defaults to "/".
    */
  val healthcheckUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to enable HAProxy stats.
    */
  val statsEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The password to use for HAProxy stats.
    */
  val statsPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The HAProxy stats URL. Defaults to "/haproxy?stats".
    */
  val statsUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The username for HAProxy stats. Defaults to "opsworks".
    */
  val statsUser: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object HaproxyLayerState {
  @scala.inline
  def apply(
    autoAssignElasticIps: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    autoAssignPublicIps: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    autoHealing: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    customConfigureRecipes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customDeployRecipes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customInstanceProfileArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customJson: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customSetupRecipes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customShutdownRecipes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customUndeployRecipes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    drainElbOnShutdown: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ebsVolumes: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IopsMountPointNumberOfDisks]
      ]
    ] = null,
    elasticLoadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthcheckMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthcheckUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    installUpdatesOnBoot: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    instanceShutdownTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statsEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    statsPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statsUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statsUser: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    systemPackages: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    useEbsOptimizedInstances: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): HaproxyLayerState = {
    val __obj = js.Dynamic.literal()
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
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (statsEnabled != null) __obj.updateDynamic("statsEnabled")(statsEnabled.asInstanceOf[js.Any])
    if (statsPassword != null) __obj.updateDynamic("statsPassword")(statsPassword.asInstanceOf[js.Any])
    if (statsUrl != null) __obj.updateDynamic("statsUrl")(statsUrl.asInstanceOf[js.Any])
    if (statsUser != null) __obj.updateDynamic("statsUser")(statsUser.asInstanceOf[js.Any])
    if (systemPackages != null) __obj.updateDynamic("systemPackages")(systemPackages.asInstanceOf[js.Any])
    if (useEbsOptimizedInstances != null) __obj.updateDynamic("useEbsOptimizedInstances")(useEbsOptimizedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[HaproxyLayerState]
  }
}

