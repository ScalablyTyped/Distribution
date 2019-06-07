package typings
package atPulumiAwsLib.apigatewayIntegrationResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/integrationResponse", "IntegrationResponse")
@js.native
class IntegrationResponse protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a IntegrationResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: IntegrationResponseArgs) = this()
  def this(name: java.lang.String, args: IntegrationResponseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  val contentHandling: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A map of response parameters that can be read from the backend response.
    * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
    */
  val responseParameters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * A map specifying the templates used to transform the integration response body
    */
  val responseTemplates: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
  /**
    * Specifies the regular expression pattern used to choose
    * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
    * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
    * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
    */
  val selectionPattern: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseState
  ): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
  /**
    * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integrationResponse.IntegrationResponse */ scala.Boolean = js.native
}

