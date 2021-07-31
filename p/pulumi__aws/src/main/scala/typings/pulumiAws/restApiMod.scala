package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigateway.RestApiEndpointConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restApiMod {
  
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RestApiArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
      */
    val apiKeySource: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
      */
    val binaryMediaTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
      */
    val body: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The creation date of the REST API
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The description of the REST API
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Nested argument defining API endpoint configuration including endpoint type. Defined below.
      */
    val endpointConfiguration: Output_[RestApiEndpointConfiguration] = js.native
    
    /**
      * The execution ARN part to be used in `lambdaPermission`'s `sourceArn`
      * when allowing API Gateway to invoke a Lambda function,
      * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
      */
    val executionArn: Output_[String] = js.native
    
    /**
      * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
      */
    val minimumCompressionSize: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name of the REST API
      */
    val name: Output_[String] = js.native
    
    /**
      * JSON formatted policy document that controls access to the API Gateway. This provider will only perform drift detection of its value when present in a configuration. It is recommended to use the `aws.apigateway.RestApiPolicy` resource instead.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The resource ID of the REST API's root
      */
    val rootResourceId: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RestApi {
    
    @JSImport("@pulumi/aws/apigateway/restApi", "RestApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RestApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RestApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RestApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RestApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RestApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: RestApiState): RestApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RestApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: RestApiState, opts: CustomResourceOptions): RestApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RestApi]
    
    /**
      * Returns true if the given object is an instance of RestApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/restApi.RestApi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/restApi.RestApi */ Boolean]
  }
  
  trait RestApiArgs extends StObject {
    
    /**
      * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
      */
    val apiKeySource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
      */
    val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
      */
    val body: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the REST API
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument defining API endpoint configuration including endpoint type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration]] = js.undefined
    
    /**
      * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
      */
    val minimumCompressionSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the REST API
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON formatted policy document that controls access to the API Gateway. This provider will only perform drift detection of its value when present in a configuration. It is recommended to use the `aws.apigateway.RestApiPolicy` resource instead.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RestApiArgs {
    
    @scala.inline
    def apply(): RestApiArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiArgs]
    }
    
    @scala.inline
    implicit class RestApiArgsMutableBuilder[Self <: RestApiArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeySource(value: Input[String]): Self = StObject.set(x, "apiKeySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeySourceUndefined: Self = StObject.set(x, "apiKeySource", js.undefined)
      
      @scala.inline
      def setBinaryMediaTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
      
      @scala.inline
      def setBinaryMediaTypesVarargs(value: Input[String]*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      @scala.inline
      def setMinimumCompressionSize(value: Input[Double]): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RestApiState extends StObject {
    
    /**
      * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
      */
    val apiKeySource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
      */
    val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
      */
    val body: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the REST API
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the REST API
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument defining API endpoint configuration including endpoint type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration]] = js.undefined
    
    /**
      * The execution ARN part to be used in `lambdaPermission`'s `sourceArn`
      * when allowing API Gateway to invoke a Lambda function,
      * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
      */
    val executionArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
      */
    val minimumCompressionSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the REST API
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON formatted policy document that controls access to the API Gateway. This provider will only perform drift detection of its value when present in a configuration. It is recommended to use the `aws.apigateway.RestApiPolicy` resource instead.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource ID of the REST API's root
      */
    val rootResourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RestApiState {
    
    @scala.inline
    def apply(): RestApiState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiState]
    }
    
    @scala.inline
    implicit class RestApiStateMutableBuilder[Self <: RestApiState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeySource(value: Input[String]): Self = StObject.set(x, "apiKeySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeySourceUndefined: Self = StObject.set(x, "apiKeySource", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBinaryMediaTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
      
      @scala.inline
      def setBinaryMediaTypesVarargs(value: Input[String]*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      @scala.inline
      def setExecutionArn(value: Input[String]): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionArnUndefined: Self = StObject.set(x, "executionArn", js.undefined)
      
      @scala.inline
      def setMinimumCompressionSize(value: Input[Double]): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRootResourceId(value: Input[String]): Self = StObject.set(x, "rootResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootResourceIdUndefined: Self = StObject.set(x, "rootResourceId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
