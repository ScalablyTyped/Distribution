package typings.atPulumiAws.opsworksHaproxyLayerMod

import typings.atPulumiAws.typesOutputMod.opsworksNs.HaproxyLayerEbsVolume
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer")
@js.native
class HaproxyLayer protected () extends CustomResource {
  /**
    * Create a HaproxyLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HaproxyLayerArgs) = this()
  def this(name: String, args: HaproxyLayerArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: Output[js.UndefOr[Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: Output[js.UndefOr[Boolean]] = js.native
  val customConfigureRecipes: Output[js.UndefOr[js.Array[String]]] = js.native
  val customDeployRecipes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: Output[js.UndefOr[String]] = js.native
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: Output[js.UndefOr[String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: Output[js.UndefOr[js.Array[String]]] = js.native
  val customSetupRecipes: Output[js.UndefOr[js.Array[String]]] = js.native
  val customShutdownRecipes: Output[js.UndefOr[js.Array[String]]] = js.native
  val customUndeployRecipes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: Output[js.UndefOr[Boolean]] = js.native
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: Output[js.UndefOr[js.Array[HaproxyLayerEbsVolume]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: Output[js.UndefOr[String]] = js.native
  /**
    * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
    */
  val healthcheckMethod: Output[js.UndefOr[String]] = js.native
  /**
    * URL path to use for instance healthchecks. Defaults to "/".
    */
  val healthcheckUrl: Output[js.UndefOr[String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: Output[js.UndefOr[Double]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: Output[String] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: Output[String] = js.native
  /**
    * Whether to enable HAProxy stats.
    */
  val statsEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The password to use for HAProxy stats.
    */
  val statsPassword: Output[String] = js.native
  /**
    * The HAProxy stats URL. Defaults to "/haproxy?stats".
    */
  val statsUrl: Output[js.UndefOr[String]] = js.native
  /**
    * The username for HAProxy stats. Defaults to "opsworks".
    */
  val statsUser: Output[js.UndefOr[String]] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer")
@js.native
object HaproxyLayer extends js.Object {
  /**
    * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): HaproxyLayer = js.native
  def get(name: String, id: Input[ID], state: HaproxyLayerState): HaproxyLayer = js.native
  def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): HaproxyLayer = js.native
  /**
    * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
}

