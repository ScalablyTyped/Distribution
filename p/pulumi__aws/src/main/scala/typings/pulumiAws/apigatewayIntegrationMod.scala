package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayIntegrationMod {
  
  @JSImport("@pulumi/aws/apigateway/integration", "Integration")
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
      * A list of cache key parameters for the integration.
      */
    val cacheKeyParameters: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The integration's cache namespace.
      */
    val cacheNamespace: Output_[String] = js.native
    
    /**
      * The id of the VpcLink used for the integration. **Required** if `connectionType` is `VPC_LINK`
      */
    val connectionId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
      */
    val connectionType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
      */
    val contentHandling: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
      */
    val credentials: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
      * when calling the associated resource.
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * The integration HTTP method
      * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
      * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
      * Not all methods are compatible with all `AWS` integrations.
      * e.g. Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
      */
    val integrationHttpMethod: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `requestTemplates` is used.
      */
    val passthroughBehavior: Output_[String] = js.native
    
    /**
      * A map of request query string parameters and headers that should be passed to the backend responder.
      * For example: `requestParameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
      */
    val requestParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of the integration's request templates.
      */
    val requestTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The API resource ID.
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The ID of the associated REST API.
      */
    val restApi: Output_[String] = js.native
    
    /**
      * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
      */
    val timeoutMilliseconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connectionType` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
      */
    val `type`: Output_[String] = js.native
    
    /**
      * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
      * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
      * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
      */
    val uri: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Integration {
    
    /**
      * Get an existing Integration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/integration", "Integration.get")
    @js.native
    def get(name: String, id: Input[ID]): Integration = js.native
    @JSImport("@pulumi/aws/apigateway/integration", "Integration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Integration = js.native
    @JSImport("@pulumi/aws/apigateway/integration", "Integration.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntegrationState): Integration = js.native
    @JSImport("@pulumi/aws/apigateway/integration", "Integration.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): Integration = js.native
    
    /**
      * Returns true if the given object is an instance of Integration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/integration", "Integration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integration.Integration */ Boolean = js.native
  }
  
  @js.native
  trait IntegrationArgs extends StObject {
    
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
    implicit class IntegrationArgsMutableBuilder[Self <: IntegrationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKeyParameters(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cacheKeyParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyParametersUndefined: Self = StObject.set(x, "cacheKeyParameters", js.undefined)
      
      @scala.inline
      def setCacheKeyParametersVarargs(value: Input[String]*): Self = StObject.set(x, "cacheKeyParameters", js.Array(value :_*))
      
      @scala.inline
      def setCacheNamespace(value: Input[String]): Self = StObject.set(x, "cacheNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNamespaceUndefined: Self = StObject.set(x, "cacheNamespace", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      @scala.inline
      def setContentHandling(value: Input[String]): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
      
      @scala.inline
      def setCredentials(value: Input[String]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationHttpMethod(value: Input[String]): Self = StObject.set(x, "integrationHttpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationHttpMethodUndefined: Self = StObject.set(x, "integrationHttpMethod", js.undefined)
      
      @scala.inline
      def setPassthroughBehavior(value: Input[String]): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
      
      @scala.inline
      def setRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      @scala.inline
      def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMilliseconds(value: Input[Double]): Self = StObject.set(x, "timeoutMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMillisecondsUndefined: Self = StObject.set(x, "timeoutMilliseconds", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  @js.native
  trait IntegrationState extends StObject {
    
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
    val httpMethod: js.UndefOr[Input[String]] = js.native
    
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
    val resourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated REST API.
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
    
    /**
      * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
      */
    val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connectionType` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
      * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
      * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
      */
    val uri: js.UndefOr[Input[String]] = js.native
  }
  object IntegrationState {
    
    @scala.inline
    def apply(): IntegrationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationState]
    }
    
    @scala.inline
    implicit class IntegrationStateMutableBuilder[Self <: IntegrationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKeyParameters(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cacheKeyParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyParametersUndefined: Self = StObject.set(x, "cacheKeyParameters", js.undefined)
      
      @scala.inline
      def setCacheKeyParametersVarargs(value: Input[String]*): Self = StObject.set(x, "cacheKeyParameters", js.Array(value :_*))
      
      @scala.inline
      def setCacheNamespace(value: Input[String]): Self = StObject.set(x, "cacheNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNamespaceUndefined: Self = StObject.set(x, "cacheNamespace", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setConnectionType(value: Input[String]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      @scala.inline
      def setContentHandling(value: Input[String]): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
      
      @scala.inline
      def setCredentials(value: Input[String]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setIntegrationHttpMethod(value: Input[String]): Self = StObject.set(x, "integrationHttpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationHttpMethodUndefined: Self = StObject.set(x, "integrationHttpMethod", js.undefined)
      
      @scala.inline
      def setPassthroughBehavior(value: Input[String]): Self = StObject.set(x, "passthroughBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughBehaviorUndefined: Self = StObject.set(x, "passthroughBehavior", js.undefined)
      
      @scala.inline
      def setRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      @scala.inline
      def setRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTemplatesUndefined: Self = StObject.set(x, "requestTemplates", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setTimeoutMilliseconds(value: Input[Double]): Self = StObject.set(x, "timeoutMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMillisecondsUndefined: Self = StObject.set(x, "timeoutMilliseconds", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
