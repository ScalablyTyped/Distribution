package typings.pulumiAws.apigatewayIntegrationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationArgs extends js.Object {
  /**
    * A list of cache key parameters for the integration.
    */
  val cacheKeyParameters: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The integration's cache namespace.
    */
  val cacheNamespace: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the VpcLink used for the integration. **Required** if `connectionType` is `VPC_LINK`
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
    */
  val contentHandling: js.UndefOr[Input[String]] = js.native
  /**
    * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
    */
  val credentials: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
    * when calling the associated resource.
    */
  val httpMethod: Input[String] = js.native
  /**
    * The integration HTTP method
    * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
    * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * Not all methods are compatible with all `AWS` integrations.
    * e.g. Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
    */
  val integrationHttpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `requestTemplates` is used.
    */
  val passthroughBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * A map of request query string parameters and headers that should be passed to the backend responder.
    * For example: `requestParameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
    */
  val requestParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map of the integration's request templates.
    */
  val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The API resource ID.
    */
  val resourceId: Input[String] = js.native
  /**
    * The ID of the associated REST API.
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
    */
  val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connectionType` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
    */
  val `type`: Input[String] = js.native
  /**
    * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
    * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
    */
  val uri: js.UndefOr[Input[String]] = js.native
}

object IntegrationArgs {
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[String | RestApi],
    `type`: Input[String]
  ): IntegrationArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationArgs]
  }
  @scala.inline
  implicit class IntegrationArgsOps[Self <: IntegrationArgs] (val x: Self) extends AnyVal {
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
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheKeyParametersVarargs(value: Input[String]*): Self = this.set("cacheKeyParameters", js.Array(value :_*))
    @scala.inline
    def setCacheKeyParameters(value: Input[js.Array[Input[String]]]): Self = this.set("cacheKeyParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKeyParameters: Self = this.set("cacheKeyParameters", js.undefined)
    @scala.inline
    def setCacheNamespace(value: Input[String]): Self = this.set("cacheNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNamespace: Self = this.set("cacheNamespace", js.undefined)
    @scala.inline
    def setConnectionId(value: Input[String]): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    @scala.inline
    def setConnectionType(value: Input[String]): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    @scala.inline
    def setContentHandling(value: Input[String]): Self = this.set("contentHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHandling: Self = this.set("contentHandling", js.undefined)
    @scala.inline
    def setCredentials(value: Input[String]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setIntegrationHttpMethod(value: Input[String]): Self = this.set("integrationHttpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationHttpMethod: Self = this.set("integrationHttpMethod", js.undefined)
    @scala.inline
    def setPassthroughBehavior(value: Input[String]): Self = this.set("passthroughBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthroughBehavior: Self = this.set("passthroughBehavior", js.undefined)
    @scala.inline
    def setRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("requestParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestParameters: Self = this.set("requestParameters", js.undefined)
    @scala.inline
    def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = this.set("requestTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTemplates: Self = this.set("requestTemplates", js.undefined)
    @scala.inline
    def setTimeoutMilliseconds(value: Input[Double]): Self = this.set("timeoutMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMilliseconds: Self = this.set("timeoutMilliseconds", js.undefined)
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

