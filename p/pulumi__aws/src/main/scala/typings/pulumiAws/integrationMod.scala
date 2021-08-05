package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigatewayv2.IntegrationTlsConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
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
  object Integration {
    
    @JSImport("@pulumi/aws/apigatewayv2/integration", "Integration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Integration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Integration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Integration]
    inline def get(name: String, id: Input[ID], state: IntegrationState): Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Integration]
    inline def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Integration]
    
    /**
      * Returns true if the given object is an instance of Integration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean]
  }
  
  trait IntegrationArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
      */
    val connectionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
      */
    val contentHandlingStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The credentials required for the integration, if any.
      */
    val credentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the integration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The integration's HTTP method. Must be specified if `integrationType` is not `MOCK`.
      */
    val integrationMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integrationType` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
      */
    val integrationSubtype: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The integration type of an integration.
      * Valid values: `AWS`, `AWS_PROXY`, `HTTP`, `HTTP_PROXY`, `MOCK`.
      */
    val integrationType: Input[String]
    
    /**
      * The URI of the Lambda function for a Lambda proxy integration, when `integrationType` is `AWS_PROXY`.
      * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
      */
    val integrationUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `requestTemplates` attribute.
      * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
      */
    val passthroughBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
      */
    val payloadFormatVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key-value map specifying request parameters that are passed from the method request to the backend.
      * Supported only for WebSocket APIs.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
      */
    val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
      */
    val templateSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The TLS configuration for a private integration. Supported only for HTTP APIs.
      */
    val tlsConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.IntegrationTlsConfig]] = js.undefined
  }
  object IntegrationArgs {
    
    inline def apply(apiId: Input[String], integrationType: Input[String]): IntegrationArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], integrationType = integrationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegrationArgs]
    }
    
    extension [Self <: IntegrationArgs](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      inline def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      inline def setContentHandlingStrategy(value: Input[String]): Self = StObject.set(x, "contentHandlingStrategy", value.asInstanceOf[js.Any])
      
      inline def setContentHandlingStrategyUndefined: Self = StObject.set(x, "contentHandlingStrategy", js.undefined)
      
      inline def setCredentialsArn(value: Input[String]): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
      
      inline def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIntegrationMethod(value: Input[String]): Self = StObject.set(x, "integrationMethod", value.asInstanceOf[js.Any])
      
      inline def setIntegrationMethodUndefined: Self = StObject.set(x, "integrationMethod", js.undefined)
      
      inline def setIntegrationSubtype(value: Input[String]): Self = StObject.set(x, "integrationSubtype", value.asInstanceOf[js.Any])
      
      inline def setIntegrationSubtypeUndefined: Self = StObject.set(x, "integrationSubtype", js.undefined)
      
      inline def setIntegrationType(value: Input[String]): Self = StObject.set(x, "integrationType", value.asInstanceOf[js.Any])
      
      inline def setIntegrationUri(value: Input[String]): Self = StObject.set(x, "integrationUri", value.asInstanceOf[js.Any])
      
      inline def setIntegrationUriUndefined: Self = StObject.set(x, "integrationUri", js.undefined)
      
      inline def setPassthroughBehavior(value: Input[String]): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
      
      inline def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
      
      inline def setPayloadFormatVersion(value: Input[String]): Self = StObject.set(x, "payloadFormatVersion", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatVersionUndefined: Self = StObject.set(x, "payloadFormatVersion", js.undefined)
      
      inline def setRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      inline def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
      
      inline def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
      
      inline def setTemplateSelectionExpression(value: Input[String]): Self = StObject.set(x, "templateSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "templateSelectionExpression", js.undefined)
      
      inline def setTimeoutMilliseconds(value: Input[Double]): Self = StObject.set(x, "timeoutMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMillisecondsUndefined: Self = StObject.set(x, "timeoutMilliseconds", js.undefined)
      
      inline def setTlsConfig(value: Input[typings.pulumiAws.inputMod.apigatewayv2.IntegrationTlsConfig]): Self = StObject.set(x, "tlsConfig", value.asInstanceOf[js.Any])
      
      inline def setTlsConfigUndefined: Self = StObject.set(x, "tlsConfig", js.undefined)
    }
  }
  
  trait IntegrationState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
      */
    val connectionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
      */
    val connectionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
      */
    val contentHandlingStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The credentials required for the integration, if any.
      */
    val credentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the integration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The integration's HTTP method. Must be specified if `integrationType` is not `MOCK`.
      */
    val integrationMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
      */
    val integrationResponseSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integrationType` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
      */
    val integrationSubtype: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The integration type of an integration.
      * Valid values: `AWS`, `AWS_PROXY`, `HTTP`, `HTTP_PROXY`, `MOCK`.
      */
    val integrationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URI of the Lambda function for a Lambda proxy integration, when `integrationType` is `AWS_PROXY`.
      * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
      */
    val integrationUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `requestTemplates` attribute.
      * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
      */
    val passthroughBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
      */
    val payloadFormatVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key-value map specifying request parameters that are passed from the method request to the backend.
      * Supported only for WebSocket APIs.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
      */
    val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
      */
    val templateSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The TLS configuration for a private integration. Supported only for HTTP APIs.
      */
    val tlsConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.IntegrationTlsConfig]] = js.undefined
  }
  object IntegrationState {
    
    inline def apply(): IntegrationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationState]
    }
    
    extension [Self <: IntegrationState](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      inline def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      inline def setContentHandlingStrategy(value: Input[String]): Self = StObject.set(x, "contentHandlingStrategy", value.asInstanceOf[js.Any])
      
      inline def setContentHandlingStrategyUndefined: Self = StObject.set(x, "contentHandlingStrategy", js.undefined)
      
      inline def setCredentialsArn(value: Input[String]): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
      
      inline def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIntegrationMethod(value: Input[String]): Self = StObject.set(x, "integrationMethod", value.asInstanceOf[js.Any])
      
      inline def setIntegrationMethodUndefined: Self = StObject.set(x, "integrationMethod", js.undefined)
      
      inline def setIntegrationResponseSelectionExpression(value: Input[String]): Self = StObject.set(x, "integrationResponseSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setIntegrationResponseSelectionExpressionUndefined: Self = StObject.set(x, "integrationResponseSelectionExpression", js.undefined)
      
      inline def setIntegrationSubtype(value: Input[String]): Self = StObject.set(x, "integrationSubtype", value.asInstanceOf[js.Any])
      
      inline def setIntegrationSubtypeUndefined: Self = StObject.set(x, "integrationSubtype", js.undefined)
      
      inline def setIntegrationType(value: Input[String]): Self = StObject.set(x, "integrationType", value.asInstanceOf[js.Any])
      
      inline def setIntegrationTypeUndefined: Self = StObject.set(x, "integrationType", js.undefined)
      
      inline def setIntegrationUri(value: Input[String]): Self = StObject.set(x, "integrationUri", value.asInstanceOf[js.Any])
      
      inline def setIntegrationUriUndefined: Self = StObject.set(x, "integrationUri", js.undefined)
      
      inline def setPassthroughBehavior(value: Input[String]): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
      
      inline def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
      
      inline def setPayloadFormatVersion(value: Input[String]): Self = StObject.set(x, "payloadFormatVersion", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatVersionUndefined: Self = StObject.set(x, "payloadFormatVersion", js.undefined)
      
      inline def setRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      inline def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
      
      inline def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
      
      inline def setTemplateSelectionExpression(value: Input[String]): Self = StObject.set(x, "templateSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "templateSelectionExpression", js.undefined)
      
      inline def setTimeoutMilliseconds(value: Input[Double]): Self = StObject.set(x, "timeoutMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMillisecondsUndefined: Self = StObject.set(x, "timeoutMilliseconds", js.undefined)
      
      inline def setTlsConfig(value: Input[typings.pulumiAws.inputMod.apigatewayv2.IntegrationTlsConfig]): Self = StObject.set(x, "tlsConfig", value.asInstanceOf[js.Any])
      
      inline def setTlsConfigUndefined: Self = StObject.set(x, "tlsConfig", js.undefined)
    }
  }
}
