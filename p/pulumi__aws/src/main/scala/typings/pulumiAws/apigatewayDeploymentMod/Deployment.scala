package typings.pulumiAws.apigatewayDeploymentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/deployment", "Deployment")
@js.native
class Deployment protected () extends CustomResource {
  /**
    * Create a Deployment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentArgs) = this()
  def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
  /**
    * The creation date of the deployment
    */
  val createdDate: Output_[String] = js.native
  /**
    * The description of the deployment
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The execution ARN to be used in `lambdaPermission` resource's `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: Output_[String] = js.native
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: Output_[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
  /**
    * The description of the stage
    */
  val stageDescription: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
    */
  val stageName: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
    */
  val triggers: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map that defines variables for the stage
    */
  val variables: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/deployment", "Deployment")
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
  def get(name: String, id: Input[ID]): Deployment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState): Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): Deployment = js.native
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean = js.native
}

