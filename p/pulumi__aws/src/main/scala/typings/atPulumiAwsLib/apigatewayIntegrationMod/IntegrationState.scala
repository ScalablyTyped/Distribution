package typings
package atPulumiAwsLib.apigatewayIntegrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationState extends js.Object {
  /**
    * A list of cache key parameters for the integration.
    */
  val cacheKeyParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The integration's cache namespace.
    */
  val cacheNamespace: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
    */
  val connectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
    */
  val connectionType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
    */
  val contentHandling: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
    */
  val credentials: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
    * when calling the associated resource.
    */
  val httpMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The integration HTTP method
    * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`) specifying how API Gateway will interact with the back end.
    * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * Not all methods are compatible with all `AWS` integrations.
    * e.g. Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
    */
  val integrationHttpMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
    */
  val passthroughBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of request query string parameters and headers that should be passed to the backend responder.
    * For example: `request_parameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
    */
  val requestParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map of the integration's request templates.
    */
  val requestTemplates: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * The API resource ID.
    */
  val resourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API.
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
    */
  val timeoutMilliseconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The input's URI (HTTP, AWS). **Required** if `type` is `HTTP` or `AWS`.
    * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
    * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`
    */
  val uri: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IntegrationState {
  @scala.inline
  def apply(
    cacheKeyParameters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    cacheNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectionType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    contentHandling: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    credentials: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    integrationHttpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    passthroughBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requestParameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    requestTemplates: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null,
    timeoutMilliseconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    uri: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IntegrationState = {
    val __obj = js.Dynamic.literal()
    if (cacheKeyParameters != null) __obj.updateDynamic("cacheKeyParameters")(cacheKeyParameters.asInstanceOf[js.Any])
    if (cacheNamespace != null) __obj.updateDynamic("cacheNamespace")(cacheNamespace.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (contentHandling != null) __obj.updateDynamic("contentHandling")(contentHandling.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (integrationHttpMethod != null) __obj.updateDynamic("integrationHttpMethod")(integrationHttpMethod.asInstanceOf[js.Any])
    if (passthroughBehavior != null) __obj.updateDynamic("passthroughBehavior")(passthroughBehavior.asInstanceOf[js.Any])
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters.asInstanceOf[js.Any])
    if (requestTemplates != null) __obj.updateDynamic("requestTemplates")(requestTemplates.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (timeoutMilliseconds != null) __obj.updateDynamic("timeoutMilliseconds")(timeoutMilliseconds.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationState]
  }
}

