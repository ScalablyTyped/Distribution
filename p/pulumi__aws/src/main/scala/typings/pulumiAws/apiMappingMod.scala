package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApiMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ApiMapping]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiMapping]
    inline def get(name: String, id: Input[ID], state: ApiMappingState): ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ApiMapping]
    inline def get(name: String, id: Input[ID], state: ApiMappingState, opts: CustomResourceOptions): ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiMapping]
    
    /**
      * Returns true if the given object is an instance of ApiMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean]
  }
  
  trait ApiMappingArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
      */
    val apiMappingKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
      */
    val domainName: Input[String]
    
    /**
      * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
      */
    val stage: Input[String]
  }
  object ApiMappingArgs {
    
    inline def apply(apiId: Input[String], domainName: Input[String], stage: Input[String]): ApiMappingArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiMappingArgs]
    }
    
    extension [Self <: ApiMappingArgs](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiMappingKey(value: Input[String]): Self = StObject.set(x, "apiMappingKey", value.asInstanceOf[js.Any])
      
      inline def setApiMappingKeyUndefined: Self = StObject.set(x, "apiMappingKey", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApiMappingState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
      */
    val apiMappingKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
      */
    val stage: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiMappingState {
    
    inline def apply(): ApiMappingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiMappingState]
    }
    
    extension [Self <: ApiMappingState](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setApiMappingKey(value: Input[String]): Self = StObject.set(x, "apiMappingKey", value.asInstanceOf[js.Any])
      
      inline def setApiMappingKeyUndefined: Self = StObject.set(x, "apiMappingKey", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
}
