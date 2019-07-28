package typings.atPulumiAws.apigatewayMethodMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/method", "Method")
@js.native
class Method protected () extends CustomResource {
  /**
    * Create a Method resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodArgs) = this()
  def this(name: String, args: MethodArgs, opts: CustomResourceOptions) = this()
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: Output[String] = js.native
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: Output[js.UndefOr[String]] = js.native
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Output[String] = js.native
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws_api_gateway_model`'s `name`.
    */
  val requestModels: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map of request query string parameters and headers that should be passed to the integration.
    * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request
    */
  val requestParameters: Output[js.UndefOr[StringDictionary[Boolean]]] = js.native
  /**
    * The ID of a `aws_api_gateway_request_validator`
    */
  val requestValidatorId: Output[js.UndefOr[String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Output[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output[RestApi] = js.native
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
  def get(name: String, id: Input[ID]): Method = js.native
  def get(name: String, id: Input[ID], state: MethodState): Method = js.native
  def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): Method = js.native
  /**
    * Returns true if the given object is an instance of Method.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = js.native
}

