package typings
package atPulumiAwsLib.apigatewayMethodResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
@js.native
class MethodResponse protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a MethodResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MethodResponseArgs) = this()
  def this(name: java.lang.String, args: MethodResponseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]] = js.native
  /**
    * **Deprecated**, use `response_parameters` instead.
    */
  val responseParametersInJson: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
@js.native
object MethodResponse extends js.Object {
  /**
    * Get an existing MethodResponse resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseState
  ): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
}

