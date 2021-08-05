package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("@pulumi/aws/apigateway/response", "Response")
  @js.native
  class Response protected () extends CustomResource {
    /**
      * Create a Response resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResponseArgs) = this()
    def this(name: String, args: ResponseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
      */
    val responseParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map specifying the templates used to transform the response body.
      */
    val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The response type of the associated GatewayResponse.
      */
    val responseType: Output_[String] = js.native
    
    /**
      * The string identifier of the associated REST API.
      */
    val restApiId: Output_[String] = js.native
    
    /**
      * The HTTP status code of the Gateway Response.
      */
    val statusCode: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("@pulumi/aws/apigateway/response", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Response resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def get(name: String, id: Input[ID], state: ResponseState): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def get(name: String, id: Input[ID], state: ResponseState, opts: CustomResourceOptions): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Response]
    
    /**
      * Returns true if the given object is an instance of Response.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean]
  }
  
  trait ResponseArgs extends StObject {
    
    /**
      * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map specifying the templates used to transform the response body.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The response type of the associated GatewayResponse.
      */
    val responseType: Input[String]
    
    /**
      * The string identifier of the associated REST API.
      */
    val restApiId: Input[String]
    
    /**
      * The HTTP status code of the Gateway Response.
      */
    val statusCode: js.UndefOr[Input[String]] = js.undefined
  }
  object ResponseArgs {
    
    inline def apply(responseType: Input[String], restApiId: Input[String]): ResponseArgs = {
      val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseArgs]
    }
    
    extension [Self <: ResponseArgs](x: Self) {
      
      inline def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      inline def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      inline def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      inline def setResponseType(value: Input[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait ResponseState extends StObject {
    
    /**
      * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map specifying the templates used to transform the response body.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The response type of the associated GatewayResponse.
      */
    val responseType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The string identifier of the associated REST API.
      */
    val restApiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP status code of the Gateway Response.
      */
    val statusCode: js.UndefOr[Input[String]] = js.undefined
  }
  object ResponseState {
    
    inline def apply(): ResponseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseState]
    }
    
    extension [Self <: ResponseState](x: Self) {
      
      inline def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      inline def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      inline def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      inline def setResponseType(value: Input[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
