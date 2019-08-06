package typings.atPulumiAws.apigatewayRestApiMod

import typings.atPulumiAws.Anon_Types
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/restApi", "RestApi")
@js.native
class RestApi protected () extends CustomResource {
  /**
    * Create a RestApi resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: RestApiArgs) = this()
  def this(name: String, args: RestApiArgs, opts: CustomResourceOptions) = this()
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: Output[js.UndefOr[String]] = js.native
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: Output[js.UndefOr[String]] = js.native
  /**
    * The creation date of the REST API
    */
  val createdDate: Output[String] = js.native
  /**
    * The description of the REST API
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: Output[Anon_Types] = js.native
  /**
    * The execution ARN part to be used in [`lambda_permission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `source_arn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
    */
  val executionArn: Output[String] = js.native
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: Output[js.UndefOr[Double]] = js.native
  /**
    * The name of the REST API
    */
  val name: Output[String] = js.native
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: Output[js.UndefOr[String]] = js.native
  /**
    * The resource ID of the REST API's root
    */
  val rootResourceId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/restApi", "RestApi")
@js.native
object RestApi extends js.Object {
  /**
    * Get an existing RestApi resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): RestApi = js.native
  def get(name: String, id: Input[ID], state: RestApiState): RestApi = js.native
  def get(name: String, id: Input[ID], state: RestApiState, opts: CustomResourceOptions): RestApi = js.native
  /**
    * Returns true if the given object is an instance of RestApi.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/restApi.RestApi */ Boolean = js.native
}

