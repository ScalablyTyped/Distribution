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

object routeResponseMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/routeResponse", "RouteResponse")
  @js.native
  class RouteResponse protected () extends CustomResource {
    /**
      * Create a RouteResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteResponseArgs) = this()
    def this(name: String, args: RouteResponseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
      */
    val modelSelectionExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The response models for the route response.
      */
    val responseModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The identifier of the `aws.apigatewayv2.Route`.
      */
    val routeId: Output_[String] = js.native
    
    /**
      * The route response key.
      */
    val routeResponseKey: Output_[String] = js.native
  }
  /* static members */
  object RouteResponse {
    
    @JSImport("@pulumi/aws/apigatewayv2/routeResponse", "RouteResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteResponseState): RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteResponseState, opts: CustomResourceOptions): RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteResponse]
    
    /**
      * Returns true if the given object is an instance of RouteResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/routeResponse.RouteResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/routeResponse.RouteResponse */ Boolean]
  }
  
  trait RouteResponseArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
      */
    val modelSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The response models for the route response.
      */
    val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Route`.
      */
    val routeId: Input[String]
    
    /**
      * The route response key.
      */
    val routeResponseKey: Input[String]
  }
  object RouteResponseArgs {
    
    @scala.inline
    def apply(apiId: Input[String], routeId: Input[String], routeResponseKey: Input[String]): RouteResponseArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], routeId = routeId.asInstanceOf[js.Any], routeResponseKey = routeResponseKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteResponseArgs]
    }
    
    @scala.inline
    implicit class RouteResponseArgsMutableBuilder[Self <: RouteResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelSelectionExpression(value: Input[String]): Self = StObject.set(x, "modelSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelSelectionExpressionUndefined: Self = StObject.set(x, "modelSelectionExpression", js.undefined)
      
      @scala.inline
      def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModelsUndefined: Self = StObject.set(x, "responseModels", js.undefined)
      
      @scala.inline
      def setRouteId(value: Input[String]): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteResponseKey(value: Input[String]): Self = StObject.set(x, "routeResponseKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteResponseState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
      */
    val modelSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The response models for the route response.
      */
    val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Route`.
      */
    val routeId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The route response key.
      */
    val routeResponseKey: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteResponseState {
    
    @scala.inline
    def apply(): RouteResponseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteResponseState]
    }
    
    @scala.inline
    implicit class RouteResponseStateMutableBuilder[Self <: RouteResponseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setModelSelectionExpression(value: Input[String]): Self = StObject.set(x, "modelSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelSelectionExpressionUndefined: Self = StObject.set(x, "modelSelectionExpression", js.undefined)
      
      @scala.inline
      def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModelsUndefined: Self = StObject.set(x, "responseModels", js.undefined)
      
      @scala.inline
      def setRouteId(value: Input[String]): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteIdUndefined: Self = StObject.set(x, "routeId", js.undefined)
      
      @scala.inline
      def setRouteResponseKey(value: Input[String]): Self = StObject.set(x, "routeResponseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteResponseKeyUndefined: Self = StObject.set(x, "routeResponseKey", js.undefined)
    }
  }
}
