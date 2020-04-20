package typings.pulumiAws.integrationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationState extends js.Object {
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
    */
  val contentHandlingStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * The credentials required for the integration, if any.
    */
  val credentialsArn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the integration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The integration's HTTP method. Must be specified if `integrationType` is not `MOCK`.
    */
  val integrationMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
    */
  val integrationResponseSelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The integration type of an integration.
    * Valid values: `AWS`, `AWS_PROXY`, `HTTP`, `HTTP_PROXY`, `MOCK`.
    */
  val integrationType: js.UndefOr[Input[String]] = js.native
  /**
    * The URI of the Lambda function for a Lambda proxy integration, when `integrationType` is `AWS_PROXY`.
    * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
    */
  val integrationUri: js.UndefOr[Input[String]] = js.native
  /**
    * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `requestTemplates` attribute.
    * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
    */
  val passthroughBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
    */
  val payloadFormatVersion: js.UndefOr[Input[String]] = js.native
  /**
    * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
    */
  val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
    */
  val templateSelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
    */
  val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.native
}

object IntegrationState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    connectionId: Input[String] = null,
    connectionType: Input[String] = null,
    contentHandlingStrategy: Input[String] = null,
    credentialsArn: Input[String] = null,
    description: Input[String] = null,
    integrationMethod: Input[String] = null,
    integrationResponseSelectionExpression: Input[String] = null,
    integrationType: Input[String] = null,
    integrationUri: Input[String] = null,
    passthroughBehavior: Input[String] = null,
    payloadFormatVersion: Input[String] = null,
    requestTemplates: Input[StringDictionary[Input[String]]] = null,
    templateSelectionExpression: Input[String] = null,
    timeoutMilliseconds: Input[Double] = null
  ): IntegrationState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (contentHandlingStrategy != null) __obj.updateDynamic("contentHandlingStrategy")(contentHandlingStrategy.asInstanceOf[js.Any])
    if (credentialsArn != null) __obj.updateDynamic("credentialsArn")(credentialsArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (integrationMethod != null) __obj.updateDynamic("integrationMethod")(integrationMethod.asInstanceOf[js.Any])
    if (integrationResponseSelectionExpression != null) __obj.updateDynamic("integrationResponseSelectionExpression")(integrationResponseSelectionExpression.asInstanceOf[js.Any])
    if (integrationType != null) __obj.updateDynamic("integrationType")(integrationType.asInstanceOf[js.Any])
    if (integrationUri != null) __obj.updateDynamic("integrationUri")(integrationUri.asInstanceOf[js.Any])
    if (passthroughBehavior != null) __obj.updateDynamic("passthroughBehavior")(passthroughBehavior.asInstanceOf[js.Any])
    if (payloadFormatVersion != null) __obj.updateDynamic("payloadFormatVersion")(payloadFormatVersion.asInstanceOf[js.Any])
    if (requestTemplates != null) __obj.updateDynamic("requestTemplates")(requestTemplates.asInstanceOf[js.Any])
    if (templateSelectionExpression != null) __obj.updateDynamic("templateSelectionExpression")(templateSelectionExpression.asInstanceOf[js.Any])
    if (timeoutMilliseconds != null) __obj.updateDynamic("timeoutMilliseconds")(timeoutMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationState]
  }
}

