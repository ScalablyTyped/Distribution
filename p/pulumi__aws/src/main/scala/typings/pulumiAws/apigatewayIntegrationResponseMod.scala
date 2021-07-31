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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayIntegrationResponseMod {
  
  @JSImport("@pulumi/aws/apigateway/integrationResponse", "IntegrationResponse")
  @js.native
  class IntegrationResponse protected () extends CustomResource {
    /**
      * Create a IntegrationResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntegrationResponseArgs) = this()
    def this(name: String, args: IntegrationResponseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
      */
    val contentHandling: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * A map of response parameters that can be read from the backend response.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
      */
    val responseParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map specifying the templates used to transform the integration response body
      */
    val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * Specifies the regular expression pattern used to choose
      * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
      * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
      * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
      */
    val selectionPattern: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The HTTP status code
      */
    val statusCode: Output_[String] = js.native
  }
  /* static members */
  object IntegrationResponse {
    
    @JSImport("@pulumi/aws/apigateway/integrationResponse", "IntegrationResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IntegrationResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationResponseState): IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationResponseState, opts: CustomResourceOptions): IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrationResponse]
    
    /**
      * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integrationResponse.IntegrationResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/integrationResponse.IntegrationResponse */ Boolean]
  }
  
  trait IntegrationResponseArgs extends StObject {
    
    /**
      * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
      */
    val contentHandling: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Input[String]
    
    /**
      * The API resource ID
      */
    val resourceId: Input[String]
    
    /**
      * A map of response parameters that can be read from the backend response.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map specifying the templates used to transform the integration response body
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * Specifies the regular expression pattern used to choose
      * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
      * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
      * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
      */
    val selectionPattern: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP status code
      */
    val statusCode: Input[String]
  }
  object IntegrationResponseArgs {
    
    @scala.inline
    def apply(
      httpMethod: Input[String],
      resourceId: Input[String],
      restApi: Input[String | RestApi],
      statusCode: Input[String]
    ): IntegrationResponseArgs = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegrationResponseArgs]
    }
    
    @scala.inline
    implicit class IntegrationResponseArgsMutableBuilder[Self <: IntegrationResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentHandling(value: Input[String]): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPattern(value: Input[String]): Self = StObject.set(x, "selectionPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPatternUndefined: Self = StObject.set(x, "selectionPattern", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntegrationResponseState extends StObject {
    
    /**
      * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
      */
    val contentHandling: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API resource ID
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of response parameters that can be read from the backend response.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map specifying the templates used to transform the integration response body
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
    
    /**
      * Specifies the regular expression pattern used to choose
      * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
      * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
      * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
      */
    val selectionPattern: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP status code
      */
    val statusCode: js.UndefOr[Input[String]] = js.undefined
  }
  object IntegrationResponseState {
    
    @scala.inline
    def apply(): IntegrationResponseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationResponseState]
    }
    
    @scala.inline
    implicit class IntegrationResponseStateMutableBuilder[Self <: IntegrationResponseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentHandling(value: Input[String]): Self = StObject.set(x, "contentHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingUndefined: Self = StObject.set(x, "contentHandling", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setSelectionPattern(value: Input[String]): Self = StObject.set(x, "selectionPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPatternUndefined: Self = StObject.set(x, "selectionPattern", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
