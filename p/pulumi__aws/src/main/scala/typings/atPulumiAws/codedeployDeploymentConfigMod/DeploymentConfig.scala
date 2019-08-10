package typings.atPulumiAws.codedeployDeploymentConfigMod

import typings.atPulumiAws.Anon_TimeBasedCanary
import typings.atPulumiAws.Anon_TypeValue
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
@js.native
class DeploymentConfig protected () extends CustomResource {
  /**
    * Create a DeploymentConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentConfigArgs) = this()
  def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: Output[js.UndefOr[String]] = js.native
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: Output[String] = js.native
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: Output[String] = js.native
  /**
    * A minimumHealthyHosts block. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: Output[js.UndefOr[Anon_TypeValue]] = js.native
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: Output[js.UndefOr[Anon_TimeBasedCanary]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState): DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): DeploymentConfig = js.native
  /**
    * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
}

