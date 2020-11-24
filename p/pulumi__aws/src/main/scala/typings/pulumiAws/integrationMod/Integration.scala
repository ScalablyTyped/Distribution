package typings.pulumiAws.integrationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigatewayv2.IntegrationTlsConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigatewayv2/integration", "Integration")
@js.native
class Integration protected () extends CustomResource {
  /**
    * Create a Integration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IntegrationArgs) = this()
  def this(name: String, args: IntegrationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
    */
  val connectionId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
    */
  val connectionType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
    */
  val contentHandlingStrategy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The credentials required for the integration, if any.
    */
  val credentialsArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The description of the integration.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The integration's HTTP method. Must be specified if `integrationType` is not `MOCK`.
    */
  val integrationMethod: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
    */
  val integrationResponseSelectionExpression: Output_[String] = js.native
  
  /**
    * Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integrationType` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
    */
  val integrationSubtype: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The integration type of an integration.
    * Valid values: `AWS`, `AWS_PROXY`, `HTTP`, `HTTP_PROXY`, `MOCK`.
    */
  val integrationType: Output_[String] = js.native
  
  /**
    * The URI of the Lambda function for a Lambda proxy integration, when `integrationType` is `AWS_PROXY`.
    * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
    */
  val integrationUri: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `requestTemplates` attribute.
    * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
    */
  val passthroughBehavior: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
    */
  val payloadFormatVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A key-value map specifying request parameters that are passed from the method request to the backend.
    * Supported only for WebSocket APIs.
    */
  val requestParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
    */
  val requestTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
    */
  val templateSelectionExpression: Output_[js.UndefOr[String]] = js.native
  
  val timeoutMilliseconds: Output_[Double] = js.native
  
  /**
    * The TLS configuration for a private integration. Supported only for HTTP APIs.
    */
  val tlsConfig: Output_[js.UndefOr[IntegrationTlsConfig]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigatewayv2/integration", "Integration")
@js.native
object Integration extends js.Object {
  
  /**
    * Get an existing Integration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Integration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Integration = js.native
  def get(name: String, id: Input[ID], state: IntegrationState): Integration = js.native
  def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): Integration = js.native
  
  /**
    * Returns true if the given object is an instance of Integration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean = js.native
}
