package typings.pulumiAws

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.outputMod.apigateway.MethodSettingsSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodSettingsMod {
  
  @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings")
  @js.native
  class MethodSettings protected () extends CustomResource {
    /**
      * Create a MethodSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodSettingsArgs) = this()
    def this(name: String, args: MethodSettingsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
      */
    val methodPath: Output_[String] = js.native
    
    /**
      * The ID of the REST API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * The settings block, see below.
      */
    val settings: Output_[MethodSettingsSettings] = js.native
    
    /**
      * The name of the stage
      */
    val stageName: Output_[String] = js.native
  }
  /* static members */
  object MethodSettings {
    
    /**
      * Get an existing MethodSettings resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings.get")
    @js.native
    def get(name: String, id: Input[ID]): MethodSettings = js.native
    @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MethodSettings = js.native
    @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings.get")
    @js.native
    def get(name: String, id: Input[ID], state: MethodSettingsState): MethodSettings = js.native
    @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings.get")
    @js.native
    def get(name: String, id: Input[ID], state: MethodSettingsState, opts: CustomResourceOptions): MethodSettings = js.native
    
    /**
      * Returns true if the given object is an instance of MethodSettings.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodSettings.MethodSettings */ Boolean = js.native
  }
  
  @js.native
  trait MethodSettingsArgs extends StObject {
    
    /**
      * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
      */
    val methodPath: Input[String] = js.native
    
    /**
      * The ID of the REST API
      */
    val restApi: Input[String | RestApi] = js.native
    
    /**
      * The settings block, see below.
      */
    val settings: Input[typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings] = js.native
    
    /**
      * The name of the stage
      */
    val stageName: Input[String] = js.native
  }
  object MethodSettingsArgs {
    
    @scala.inline
    def apply(
      methodPath: Input[String],
      restApi: Input[String | RestApi],
      settings: Input[typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings],
      stageName: Input[String]
    ): MethodSettingsArgs = {
      val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodSettingsArgs]
    }
    
    @scala.inline
    implicit class MethodSettingsArgsMutableBuilder[Self <: MethodSettingsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodPath(value: Input[String]): Self = StObject.set(x, "methodPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Input[typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodSettingsState extends StObject {
    
    /**
      * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
      */
    val methodPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
    
    /**
      * The settings block, see below.
      */
    val settings: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings]] = js.native
    
    /**
      * The name of the stage
      */
    val stageName: js.UndefOr[Input[String]] = js.native
  }
  object MethodSettingsState {
    
    @scala.inline
    def apply(): MethodSettingsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodSettingsState]
    }
    
    @scala.inline
    implicit class MethodSettingsStateMutableBuilder[Self <: MethodSettingsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodPath(value: Input[String]): Self = StObject.set(x, "methodPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodPathUndefined: Self = StObject.set(x, "methodPath", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setSettings(value: Input[typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    }
  }
}
