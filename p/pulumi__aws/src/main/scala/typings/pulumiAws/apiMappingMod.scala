package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMappingMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping")
  @js.native
  class ApiMapping protected () extends CustomResource {
    /**
      * Create a ApiMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiMappingArgs) = this()
    def this(name: String, args: ApiMappingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
      */
    val apiMappingKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
      */
    val stage: Output_[String] = js.native
  }
  /* static members */
  object ApiMapping {
    
    /**
      * Get an existing ApiMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping.get")
    @js.native
    def get(name: String, id: Input[ID]): ApiMapping = js.native
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ApiMapping = js.native
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApiMappingState): ApiMapping = js.native
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApiMappingState, opts: CustomResourceOptions): ApiMapping = js.native
    
    /**
      * Returns true if the given object is an instance of ApiMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean = js.native
  }
  
  @js.native
  trait ApiMappingArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String] = js.native
    
    /**
      * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
      */
    val apiMappingKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
      */
    val domainName: Input[String] = js.native
    
    /**
      * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
      */
    val stage: Input[String] = js.native
  }
  object ApiMappingArgs {
    
    @scala.inline
    def apply(apiId: Input[String], domainName: Input[String], stage: Input[String]): ApiMappingArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiMappingArgs]
    }
    
    @scala.inline
    implicit class ApiMappingArgsMutableBuilder[Self <: ApiMappingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiMappingKey(value: Input[String]): Self = StObject.set(x, "apiMappingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiMappingKeyUndefined: Self = StObject.set(x, "apiMappingKey", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApiMappingState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
      */
    val apiMappingKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
      */
    val domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
      */
    val stage: js.UndefOr[Input[String]] = js.native
  }
  object ApiMappingState {
    
    @scala.inline
    def apply(): ApiMappingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiMappingState]
    }
    
    @scala.inline
    implicit class ApiMappingStateMutableBuilder[Self <: ApiMappingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setApiMappingKey(value: Input[String]): Self = StObject.set(x, "apiMappingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiMappingKeyUndefined: Self = StObject.set(x, "apiMappingKey", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
}
