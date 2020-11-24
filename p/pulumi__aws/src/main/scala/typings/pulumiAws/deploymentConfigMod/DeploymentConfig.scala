package typings.pulumiAws.deploymentConfigMod

import typings.pulumiAws.outputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typings.pulumiAws.outputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val computePlatform: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: Output_[String] = js.native
  
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: Output_[String] = js.native
  
  /**
    * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: Output_[js.UndefOr[DeploymentConfigMinimumHealthyHosts]] = js.native
  
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: Output_[js.UndefOr[DeploymentConfigTrafficRoutingConfig]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState): DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): DeploymentConfig = js.native
  
  /**
    * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
}
