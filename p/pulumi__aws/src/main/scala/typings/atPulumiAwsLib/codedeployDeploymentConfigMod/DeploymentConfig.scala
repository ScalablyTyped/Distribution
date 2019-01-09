package typings
package atPulumiAwsLib.codedeployDeploymentConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
@js.native
class DeploymentConfig protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a DeploymentConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DeploymentConfigArgs) = this()
  def this(name: java.lang.String, args: DeploymentConfigArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A minimum_healthy_hosts block. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TypeValue]] = js.native
  /**
    * A traffic_routing_config block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TimeBasedCanary]] = js.native
}

@JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
@js.native
object DeploymentConfig extends js.Object {
  /**
    * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigState
  ): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
}

