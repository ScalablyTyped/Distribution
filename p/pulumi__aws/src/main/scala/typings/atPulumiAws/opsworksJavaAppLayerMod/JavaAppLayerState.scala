package typings.atPulumiAws.opsworksJavaAppLayerMod

import typings.atPulumiAws.typesInputMod.opsworks.JavaAppLayerEbsVolume
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JavaAppLayerState extends js.Object {
  /**
    * Keyword for the application container to use. Defaults to "tomcat".
    */
  val appServer: js.UndefOr[Input[String]] = js.native
  /**
    * Version of the selected application container to use. Defaults to "7".
    */
  val appServerVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: js.UndefOr[Input[Boolean]] = js.native
  val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: js.UndefOr[Input[String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.native
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: js.UndefOr[Input[js.Array[Input[JavaAppLayerEbsVolume]]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * Options to set for the JVM.
    */
  val jvmOptions: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword for the type of JVM to use. Defaults to `openjdk`.
    */
  val jvmType: js.UndefOr[Input[String]] = js.native
  /**
    * Version of JVM to use. Defaults to "7".
    */
  val jvmVersion: js.UndefOr[Input[String]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
}

object JavaAppLayerState {
  @scala.inline
  def apply(
    appServer: Input[String] = null,
    appServerVersion: Input[String] = null,
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
    ebsVolumes: Input[js.Array[Input[JavaAppLayerEbsVolume]]] = null,
    elasticLoadBalancer: Input[String] = null,
    installUpdatesOnBoot: Input[Boolean] = null,
    instanceShutdownTimeout: Input[Double] = null,
    jvmOptions: Input[String] = null,
    jvmType: Input[String] = null,
    jvmVersion: Input[String] = null,
    name: Input[String] = null,
    stackId: Input[String] = null,
    systemPackages: Input[js.Array[Input[String]]] = null,
    useEbsOptimizedInstances: Input[Boolean] = null
  ): JavaAppLayerState = {
    val __obj = js.Dynamic.literal()
    if (appServer != null) __obj.updateDynamic("appServer")(appServer.asInstanceOf[js.Any])
    if (appServerVersion != null) __obj.updateDynamic("appServerVersion")(appServerVersion.asInstanceOf[js.Any])
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
    if (installUpdatesOnBoot != null) __obj.updateDynamic("installUpdatesOnBoot")(installUpdatesOnBoot.asInstanceOf[js.Any])
    if (instanceShutdownTimeout != null) __obj.updateDynamic("instanceShutdownTimeout")(instanceShutdownTimeout.asInstanceOf[js.Any])
    if (jvmOptions != null) __obj.updateDynamic("jvmOptions")(jvmOptions.asInstanceOf[js.Any])
    if (jvmType != null) __obj.updateDynamic("jvmType")(jvmType.asInstanceOf[js.Any])
    if (jvmVersion != null) __obj.updateDynamic("jvmVersion")(jvmVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (systemPackages != null) __obj.updateDynamic("systemPackages")(systemPackages.asInstanceOf[js.Any])
    if (useEbsOptimizedInstances != null) __obj.updateDynamic("useEbsOptimizedInstances")(useEbsOptimizedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavaAppLayerState]
  }
}

