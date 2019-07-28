package typings.atPulumiAws.codedeployMod

import typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfigArgs
import typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfigState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy", "DeploymentConfig")
@js.native
class DeploymentConfig protected ()
  extends typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig {
  /**
    * Create a DeploymentConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentConfigArgs) = this()
  def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codedeploy", "DeploymentConfig")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState): typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): typings.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  /**
    * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
}

