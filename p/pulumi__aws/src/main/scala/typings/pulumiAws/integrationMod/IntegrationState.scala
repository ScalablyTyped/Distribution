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
  def apply(): IntegrationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationState]
  }
  @scala.inline
  implicit class IntegrationStateOps[Self <: IntegrationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    @scala.inline
    def setConnectionId(value: Input[String]): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    @scala.inline
    def setConnectionType(value: Input[String]): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    @scala.inline
    def setContentHandlingStrategy(value: Input[String]): Self = this.set("contentHandlingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHandlingStrategy: Self = this.set("contentHandlingStrategy", js.undefined)
    @scala.inline
    def setCredentialsArn(value: Input[String]): Self = this.set("credentialsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialsArn: Self = this.set("credentialsArn", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIntegrationMethod(value: Input[String]): Self = this.set("integrationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationMethod: Self = this.set("integrationMethod", js.undefined)
    @scala.inline
    def setIntegrationResponseSelectionExpression(value: Input[String]): Self = this.set("integrationResponseSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationResponseSelectionExpression: Self = this.set("integrationResponseSelectionExpression", js.undefined)
    @scala.inline
    def setIntegrationType(value: Input[String]): Self = this.set("integrationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationType: Self = this.set("integrationType", js.undefined)
    @scala.inline
    def setIntegrationUri(value: Input[String]): Self = this.set("integrationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationUri: Self = this.set("integrationUri", js.undefined)
    @scala.inline
    def setPassthroughBehavior(value: Input[String]): Self = this.set("passthroughBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthroughBehavior: Self = this.set("passthroughBehavior", js.undefined)
    @scala.inline
    def setPayloadFormatVersion(value: Input[String]): Self = this.set("payloadFormatVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadFormatVersion: Self = this.set("payloadFormatVersion", js.undefined)
    @scala.inline
    def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = this.set("requestTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTemplates: Self = this.set("requestTemplates", js.undefined)
    @scala.inline
    def setTemplateSelectionExpression(value: Input[String]): Self = this.set("templateSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateSelectionExpression: Self = this.set("templateSelectionExpression", js.undefined)
    @scala.inline
    def setTimeoutMilliseconds(value: Input[Double]): Self = this.set("timeoutMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMilliseconds: Self = this.set("timeoutMilliseconds", js.undefined)
  }
  
}

