package typings.pulumiAws.gangliaLayerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.opsworks.GangliaLayerEbsVolume
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GangliaLayerState extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the layer.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
  val ebsVolumes: js.UndefOr[Input[js.Array[Input[GangliaLayerEbsVolume]]]] = js.native
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
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The password to use for Ganglia.
    */
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The URL path to use for Ganglia. Defaults to "/ganglia".
    */
  val url: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The username to use for Ganglia. Defaults to "opsworks".
    */
  val username: js.UndefOr[Input[String]] = js.native
}

object GangliaLayerState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
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
    ebsVolumes: Input[js.Array[Input[GangliaLayerEbsVolume]]] = null,
    elasticLoadBalancer: Input[String] = null,
    installUpdatesOnBoot: Input[Boolean] = null,
    instanceShutdownTimeout: Input[Double] = null,
    name: Input[String] = null,
    password: Input[String] = null,
    stackId: Input[String] = null,
    systemPackages: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    url: Input[String] = null,
    useEbsOptimizedInstances: Input[Boolean] = null,
    username: Input[String] = null
  ): GangliaLayerState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (systemPackages != null) __obj.updateDynamic("systemPackages")(systemPackages.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useEbsOptimizedInstances != null) __obj.updateDynamic("useEbsOptimizedInstances")(useEbsOptimizedInstances.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GangliaLayerState]
  }
}

