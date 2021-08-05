package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigateway.GetRestApiEndpointConfiguration
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRestApiMod {
  
  @JSImport("@pulumi/aws/apigateway/getRestApi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRestApi(args: GetRestApiArgs): js.Promise[GetRestApiResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRestApi")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRestApiResult]]
  inline def getRestApi(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestApi")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRestApiResult]]
  
  trait GetRestApiArgs extends StObject {
    
    /**
      * The name of the REST API to look up. If no REST API is found with this name, an error will be returned. If multiple REST APIs are found with this name, an error will be returned.
      */
    val name: String
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetRestApiArgs {
    
    inline def apply(name: String): GetRestApiArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRestApiArgs]
    }
    
    extension [Self <: GetRestApiArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetRestApiResult extends StObject {
    
    /**
      * The source of the API key for requests.
      */
    val apiKeySource: String
    
    /**
      * The ARN of the REST API.
      */
    val arn: String
    
    /**
      * The list of binary media types supported by the REST API.
      */
    val binaryMediaTypes: js.Array[String]
    
    /**
      * The description of the REST API.
      */
    val description: String
    
    /**
      * The endpoint configuration of this RestApi showing the endpoint types of the API.
      */
    val endpointConfigurations: js.Array[GetRestApiEndpointConfiguration]
    
    /**
      * The execution ARN part to be used in `lambdaPermission`'s `sourceArn` when allowing API Gateway to invoke a Lambda function, e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
      */
    val executionArn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Minimum response size to compress for the REST API.
      */
    val minimumCompressionSize: Double
    
    val name: String
    
    /**
      * JSON formatted policy document that controls access to the API Gateway.
      */
    val policy: String
    
    /**
      * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
      */
    val rootResourceId: String
    
    /**
      * Key-value map of resource tags.
      */
    val tags: StringDictionary[String]
  }
  object GetRestApiResult {
    
    inline def apply(
      apiKeySource: String,
      arn: String,
      binaryMediaTypes: js.Array[String],
      description: String,
      endpointConfigurations: js.Array[GetRestApiEndpointConfiguration],
      executionArn: String,
      id: String,
      minimumCompressionSize: Double,
      name: String,
      policy: String,
      rootResourceId: String,
      tags: StringDictionary[String]
    ): GetRestApiResult = {
      val __obj = js.Dynamic.literal(apiKeySource = apiKeySource.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], binaryMediaTypes = binaryMediaTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endpointConfigurations = endpointConfigurations.asInstanceOf[js.Any], executionArn = executionArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], minimumCompressionSize = minimumCompressionSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rootResourceId = rootResourceId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRestApiResult]
    }
    
    extension [Self <: GetRestApiResult](x: Self) {
      
      inline def setApiKeySource(value: String): Self = StObject.set(x, "apiKeySource", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setBinaryMediaTypes(value: js.Array[String]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
      
      inline def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurations(value: js.Array[GetRestApiEndpointConfiguration]): Self = StObject.set(x, "endpointConfigurations", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurationsVarargs(value: GetRestApiEndpointConfiguration*): Self = StObject.set(x, "endpointConfigurations", js.Array(value :_*))
      
      inline def setExecutionArn(value: String): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMinimumCompressionSize(value: Double): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setRootResourceId(value: String): Self = StObject.set(x, "rootResourceId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
