package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationSetMod {
  
  @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet")
  @js.native
  class ConfigurationSet protected () extends CustomResource {
    /**
      * Create a ConfigurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the configuration set
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ConfigurationSet {
    
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationSetState): ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSet]
    
    /**
      * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean]
  }
  
  trait ConfigurationSetArgs extends StObject {
    
    /**
      * The name of the configuration set
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ConfigurationSetArgs {
    
    @scala.inline
    def apply(): ConfigurationSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationSetArgs]
    }
    
    @scala.inline
    implicit class ConfigurationSetArgsMutableBuilder[Self <: ConfigurationSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ConfigurationSetState extends StObject {
    
    /**
      * The name of the configuration set
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ConfigurationSetState {
    
    @scala.inline
    def apply(): ConfigurationSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationSetState]
    }
    
    @scala.inline
    implicit class ConfigurationSetStateMutableBuilder[Self <: ConfigurationSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
