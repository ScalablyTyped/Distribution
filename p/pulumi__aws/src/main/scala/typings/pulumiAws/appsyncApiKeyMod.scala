package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsyncApiKeyMod {
  
  @JSImport("@pulumi/aws/appsync/apiKey", "ApiKey")
  @js.native
  class ApiKey protected () extends CustomResource {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the associated AppSync API
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
      */
    val expires: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The API key
      */
    val key: Output_[String] = js.native
  }
  /* static members */
  object ApiKey {
    
    @JSImport("@pulumi/aws/appsync/apiKey", "ApiKey")
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
    @scala.inline
    def get(name: String, id: Input[ID]): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiKeyState): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
    
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean]
  }
  
  trait ApiKeyArgs extends StObject {
    
    /**
      * The ID of the associated AppSync API
      */
    val apiId: Input[String]
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
      */
    val expires: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiKeyArgs {
    
    @scala.inline
    def apply(apiId: Input[String]): ApiKeyArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyArgs]
    }
    
    @scala.inline
    implicit class ApiKeyArgsMutableBuilder[Self <: ApiKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpires(value: Input[String]): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    }
  }
  
  trait ApiKeyState extends StObject {
    
    /**
      * The ID of the associated AppSync API
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API key description. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
      */
    val expires: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API key
      */
    val key: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiKeyState {
    
    @scala.inline
    def apply(): ApiKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyState]
    }
    
    @scala.inline
    implicit class ApiKeyStateMutableBuilder[Self <: ApiKeyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpires(value: Input[String]): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
