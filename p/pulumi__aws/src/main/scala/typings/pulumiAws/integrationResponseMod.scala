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

object integrationResponseMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/integrationResponse", "IntegrationResponse")
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
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
      */
    val contentHandlingStrategy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The identifier of the `aws.apigatewayv2.Integration`.
      */
    val integrationId: Output_[String] = js.native
    
    /**
      * The integration response key.
      */
    val integrationResponseKey: Output_[String] = js.native
    
    /**
      * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
      */
    val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
      */
    val templateSelectionExpression: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object IntegrationResponse {
    
    @JSImport("@pulumi/aws/apigatewayv2/integrationResponse", "IntegrationResponse")
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integrationResponse.IntegrationResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/integrationResponse.IntegrationResponse */ Boolean]
  }
  
  trait IntegrationResponseArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
      */
    val contentHandlingStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Integration`.
      */
    val integrationId: Input[String]
    
    /**
      * The integration response key.
      */
    val integrationResponseKey: Input[String]
    
    /**
      * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
      */
    val templateSelectionExpression: js.UndefOr[Input[String]] = js.undefined
  }
  object IntegrationResponseArgs {
    
    @scala.inline
    def apply(apiId: Input[String], integrationId: Input[String], integrationResponseKey: Input[String]): IntegrationResponseArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], integrationId = integrationId.asInstanceOf[js.Any], integrationResponseKey = integrationResponseKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegrationResponseArgs]
    }
    
    @scala.inline
    implicit class IntegrationResponseArgsMutableBuilder[Self <: IntegrationResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingStrategy(value: Input[String]): Self = StObject.set(x, "contentHandlingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingStrategyUndefined: Self = StObject.set(x, "contentHandlingStrategy", js.undefined)
      
      @scala.inline
      def setIntegrationId(value: Input[String]): Self = StObject.set(x, "integrationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationResponseKey(value: Input[String]): Self = StObject.set(x, "integrationResponseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setTemplateSelectionExpression(value: Input[String]): Self = StObject.set(x, "templateSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "templateSelectionExpression", js.undefined)
    }
  }
  
  trait IntegrationResponseState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
      */
    val contentHandlingStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Integration`.
      */
    val integrationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The integration response key.
      */
    val integrationResponseKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
      */
    val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
      */
    val templateSelectionExpression: js.UndefOr[Input[String]] = js.undefined
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
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setContentHandlingStrategy(value: Input[String]): Self = StObject.set(x, "contentHandlingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHandlingStrategyUndefined: Self = StObject.set(x, "contentHandlingStrategy", js.undefined)
      
      @scala.inline
      def setIntegrationId(value: Input[String]): Self = StObject.set(x, "integrationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationIdUndefined: Self = StObject.set(x, "integrationId", js.undefined)
      
      @scala.inline
      def setIntegrationResponseKey(value: Input[String]): Self = StObject.set(x, "integrationResponseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationResponseKeyUndefined: Self = StObject.set(x, "integrationResponseKey", js.undefined)
      
      @scala.inline
      def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
      
      @scala.inline
      def setTemplateSelectionExpression(value: Input[String]): Self = StObject.set(x, "templateSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "templateSelectionExpression", js.undefined)
    }
  }
}
