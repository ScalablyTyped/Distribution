package typings.atPulumiAws.apigatewayIntegrationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationArgs extends js.Object {
  /**
    * A list of cache key parameters for the integration.
    */
  val cacheKeyParameters: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The integration's cache namespace.
    */
  val cacheNamespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
    */
  val connectionId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
    */
  val connectionType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
    */
  val contentHandling: js.UndefOr[Input[String]] = js.undefined
  /**
    * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
    */
  val credentials: js.UndefOr[Input[String]] = js.undefined
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
    * when calling the associated resource.
    */
  val httpMethod: Input[String]
  /**
    * The integration HTTP method
    * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
    * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * Not all methods are compatible with all `AWS` integrations.
    * e.g. Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
    */
  val integrationHttpMethod: js.UndefOr[Input[String]] = js.undefined
  /**
    * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
    */
  val passthroughBehavior: js.UndefOr[Input[String]] = js.undefined
  /**
    * A map of request query string parameters and headers that should be passed to the backend responder.
    * For example: `request_parameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
    */
  val requestParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * A map of the integration's request templates.
    */
  val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * The API resource ID.
    */
  val resourceId: Input[String]
  /**
    * The ID of the associated REST API.
    */
  val restApi: Input[RestApi]
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
    */
  val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
    */
  val `type`: Input[String]
  /**
    * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
    * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`
    */
  val uri: js.UndefOr[Input[String]] = js.undefined
}

object IntegrationArgs {
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[RestApi],
    `type`: Input[String],
    cacheKeyParameters: Input[js.Array[Input[String]]] = null,
    cacheNamespace: Input[String] = null,
    connectionId: Input[String] = null,
    connectionType: Input[String] = null,
    contentHandling: Input[String] = null,
    credentials: Input[String] = null,
    integrationHttpMethod: Input[String] = null,
    passthroughBehavior: Input[String] = null,
    requestParameters: Input[StringDictionary[Input[String]]] = null,
    requestTemplates: Input[StringDictionary[Input[String]]] = null,
    timeoutMilliseconds: Input[Double] = null,
    uri: Input[String] = null
  ): IntegrationArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cacheKeyParameters != null) __obj.updateDynamic("cacheKeyParameters")(cacheKeyParameters.asInstanceOf[js.Any])
    if (cacheNamespace != null) __obj.updateDynamic("cacheNamespace")(cacheNamespace.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (contentHandling != null) __obj.updateDynamic("contentHandling")(contentHandling.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (integrationHttpMethod != null) __obj.updateDynamic("integrationHttpMethod")(integrationHttpMethod.asInstanceOf[js.Any])
    if (passthroughBehavior != null) __obj.updateDynamic("passthroughBehavior")(passthroughBehavior.asInstanceOf[js.Any])
    if (requestParameters != null) __obj.updateDynamic("requestParameters")(requestParameters.asInstanceOf[js.Any])
    if (requestTemplates != null) __obj.updateDynamic("requestTemplates")(requestTemplates.asInstanceOf[js.Any])
    if (timeoutMilliseconds != null) __obj.updateDynamic("timeoutMilliseconds")(timeoutMilliseconds.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationArgs]
  }
}

