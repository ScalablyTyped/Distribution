package typings.pulumiAws.apigatewayIntegrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/integrationResponse", "IntegrationResponse")
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
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  val contentHandling: Output_[js.UndefOr[String]] = js.native
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Output_[String] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Output_[String] = js.native
  /**
    * A map of response parameters that can be read from the backend response.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
    */
  val responseParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map specifying the templates used to transform the integration response body
    */
  val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
  /**
    * Specifies the regular expression pattern used to choose
    * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
    * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
    * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
    */
  val selectionPattern: Output_[js.UndefOr[String]] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/integrationResponse", "IntegrationResponse")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integrationResponse.IntegrationResponse */ Boolean = js.native
}

