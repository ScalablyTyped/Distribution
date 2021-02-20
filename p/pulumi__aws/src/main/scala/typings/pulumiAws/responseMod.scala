package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Response resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/response", "Response.get")
    @js.native
    def get(name: String, id: Input[ID]): Response = js.native
    @JSImport("@pulumi/aws/apigateway/response", "Response.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Response = js.native
    @JSImport("@pulumi/aws/apigateway/response", "Response.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResponseState): Response = js.native
    @JSImport("@pulumi/aws/apigateway/response", "Response.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResponseState, opts: CustomResourceOptions): Response = js.native
    
    /**
      * Returns true if the given object is an instance of Response.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/response", "Response.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean = js.native
  }
  
  @js.native
  trait ResponseArgs extends StObject {
    
    /**
      * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map specifying the templates used to transform the response body.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The response type of the associated GatewayResponse.
      */
    val responseType: Input[String] = js.native
    
    /**
      * The string identifier of the associated REST API.
      */
    val restApiId: Input[String] = js.native
    
    /**
      * The HTTP status code of the Gateway Response.
      */
    val statusCode: js.UndefOr[Input[String]] = js.native
  }
  object ResponseArgs {
    
    @scala.inline
    def apply(responseType: Input[String], restApiId: Input[String]): ResponseArgs = {
      val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseArgs]
    }
    
    @scala.inline
    implicit class ResponseArgsMutableBuilder[Self <: ResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setResponseType(value: Input[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait ResponseState extends StObject {
    
    /**
      * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
      */
    val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map specifying the templates used to transform the response body.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The response type of the associated GatewayResponse.
      */
    val responseType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The string identifier of the associated REST API.
      */
    val restApiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The HTTP status code of the Gateway Response.
      */
    val statusCode: js.UndefOr[Input[String]] = js.native
  }
  object ResponseState {
    
    @scala.inline
    def apply(): ResponseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseState]
    }
    
    @scala.inline
    implicit class ResponseStateMutableBuilder[Self <: ResponseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setResponseType(value: Input[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
