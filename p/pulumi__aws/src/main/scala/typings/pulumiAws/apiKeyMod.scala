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

object apiKeyMod {
  
  @JSImport("@pulumi/aws/apigateway/apiKey", "ApiKey")
  @js.native
  class ApiKey protected () extends CustomResource {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the API key
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * Specifies whether the API key can be used by callers. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The last update date of the API key
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the API key
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The value of the API key. If not specified, it will be automatically generated by AWS on creation.
      */
    val value: Output_[String] = js.native
  }
  /* static members */
  object ApiKey {
    
    @JSImport("@pulumi/aws/apigateway/apiKey", "ApiKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    inline def get(name: String, id: Input[ID], state: ApiKeyState): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    inline def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/apiKey.ApiKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/apiKey.ApiKey */ Boolean]
  }
  
  trait ApiKeyArgs extends StObject {
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the API key can be used by callers. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the API key
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The value of the API key. If not specified, it will be automatically generated by AWS on creation.
      */
    val value: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiKeyArgs {
    
    inline def apply(): ApiKeyArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyArgs]
    }
    
    extension [Self <: ApiKeyArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ApiKeyState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the API key
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the API key can be used by callers. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The last update date of the API key
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the API key
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The value of the API key. If not specified, it will be automatically generated by AWS on creation.
      */
    val value: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiKeyState {
    
    inline def apply(): ApiKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyState]
    }
    
    extension [Self <: ApiKeyState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
