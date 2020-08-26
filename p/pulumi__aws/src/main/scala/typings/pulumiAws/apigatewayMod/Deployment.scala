package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.apigatewayDeploymentMod.DeploymentArgs
import typings.pulumiAws.apigatewayDeploymentMod.DeploymentState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "Deployment")
@js.native
class Deployment protected ()
  extends typings.pulumiAws.apigatewayDeploymentMod.Deployment {
  /**
    * Create a Deployment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentArgs) = this()
  def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "Deployment")
@js.native
object Deployment extends js.Object {
  /**
    * Get an existing Deployment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState): typings.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): typings.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean = js.native
}

