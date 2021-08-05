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

object methodResponseMod {
  
  @JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
  @js.native
  class MethodResponse protected () extends CustomResource {
    /**
      * Create a MethodResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodResponseArgs) = this()
    def this(name: String, args: MethodResponseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * A map of the API models used for the response's content type
      */
    val responseModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of response parameters that can be sent to the caller.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
      * would define that the header `X-Some-Header` can be provided on the response.
      */
    val responseParameters: Output_[js.UndefOr[StringDictionary[Boolean]]] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * The HTTP status code
      */
    val statusCode: Output_[String] = js.native
  }
  /* static members */
  object MethodResponse {
    
    @JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MethodResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): MethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MethodResponse]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MethodResponse]
    inline def get(name: String, id: Input[ID], state: MethodResponseState): MethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MethodResponse]
    inline def get(name: String, id: Input[ID], state: MethodResponseState, opts: CustomResourceOptions): MethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MethodResponse]
    
    /**
      * Returns true if the given object is an instance of MethodResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodResponse.MethodResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/methodResponse.MethodResponse */ Boolean]
  }
  
  trait MethodResponseArgs extends StObject {
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Input[String]
    
    /**
      * The API resource ID
      */
    val resourceId: Input[String]
    
    /**
      * A map of the API models used for the response's content type
      */
    val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of response parameters that can be sent to the caller.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
      * would define that the header `X-Some-Header` can be provided on the response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * The HTTP status code
      */
    val statusCode: Input[String]
  }
  object MethodResponseArgs {
    
    inline def apply(
      httpMethod: Input[String],
      resourceId: Input[String],
      restApi: Input[String | RestApi],
      statusCode: Input[String]
    ): MethodResponseArgs = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodResponseArgs]
    }
    
    extension [Self <: MethodResponseArgs](x: Self) {
      
      inline def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseModels", value.asInstanceOf[js.Any])
      
      inline def setResponseModelsUndefined: Self = StObject.set(x, "responseModels", js.undefined)
      
      inline def setResponseParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodResponseState extends StObject {
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API resource ID
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of the API models used for the response's content type
      */
    val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of response parameters that can be sent to the caller.
      * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
      * would define that the header `X-Some-Header` can be provided on the response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
    
    /**
      * The HTTP status code
      */
    val statusCode: js.UndefOr[Input[String]] = js.undefined
  }
  object MethodResponseState {
    
    inline def apply(): MethodResponseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodResponseState]
    }
    
    extension [Self <: MethodResponseState](x: Self) {
      
      inline def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      inline def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseModels", value.asInstanceOf[js.Any])
      
      inline def setResponseModelsUndefined: Self = StObject.set(x, "responseModels", js.undefined)
      
      inline def setResponseParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
