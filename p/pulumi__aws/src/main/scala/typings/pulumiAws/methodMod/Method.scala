package typings.pulumiAws.methodMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val apiKeyRequired: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: Output_[String] = js.native
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: Output_[js.UndefOr[String]] = js.native
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Output_[String] = js.native
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
    */
  val requestModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
    * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
    */
  val requestParameters: Output_[js.UndefOr[StringDictionary[Boolean]]] = js.native
  /**
    * The ID of a `aws.apigateway.RequestValidator`
    */
  val requestValidatorId: Output_[js.UndefOr[String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Output_[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Method = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Method = js.native
  def get(name: String, id: Input[ID], state: MethodState): Method = js.native
  def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): Method = js.native
  /**
    * Returns true if the given object is an instance of Method.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = js.native
}

