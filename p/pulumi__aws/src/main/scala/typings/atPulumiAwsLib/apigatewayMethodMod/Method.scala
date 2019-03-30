package typings
package atPulumiAwsLib.apigatewayMethodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/method", "Method")
@js.native
class Method protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Method resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MethodArgs) = this()
  def this(name: java.lang.String, args: MethodArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws_api_gateway_model`'s `name`.
    */
  val requestModels: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * A map of request query string parameters and headers that should be passed to the integration.
    * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request
    */
  val requestParameters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]] = js.native
  /**
    * The ID of a `aws_api_gateway_request_validator`
    */
  val requestValidatorId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/method", "Method")
@js.native
object Method extends js.Object {
  /**
    * Get an existing Method resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodMod.MethodState
  ): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodMod.MethodState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
}

