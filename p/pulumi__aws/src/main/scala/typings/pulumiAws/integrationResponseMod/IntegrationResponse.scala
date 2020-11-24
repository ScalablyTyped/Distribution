package typings.pulumiAws.integrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigatewayv2/integrationResponse", "IntegrationResponse")
@js.native
class IntegrationResponse protected () extends CustomResource {
  /**
    * Create a IntegrationResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IntegrationResponseArgs) = this()
  def this(name: String, args: IntegrationResponseArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
    */
  val contentHandlingStrategy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The identifier of the `aws.apigatewayv2.Integration`.
    */
  val integrationId: Output_[String] = js.native
  
  /**
    * The integration response key.
    */
  val integrationResponseKey: Output_[String] = js.native
  
  /**
    * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
    */
  val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
    */
  val templateSelectionExpression: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigatewayv2/integrationResponse", "IntegrationResponse")
@js.native
object IntegrationResponse extends js.Object {
  
  /**
    * Get an existing IntegrationResponse resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IntegrationResponse = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IntegrationResponse = js.native
  def get(name: String, id: Input[ID], state: IntegrationResponseState): IntegrationResponse = js.native
  def get(name: String, id: Input[ID], state: IntegrationResponseState, opts: CustomResourceOptions): IntegrationResponse = js.native
  
  /**
    * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integrationResponse.IntegrationResponse */ Boolean = js.native
}
