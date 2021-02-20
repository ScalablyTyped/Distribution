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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the configuration set
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ConfigurationSet {
    
    /**
      * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState): ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): ConfigurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/configurationSet", "ConfigurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = js.native
  }
  
  @js.native
  trait ConfigurationSetArgs extends StObject {
    
    /**
      * The name of the configuration set
      */
    val name: js.UndefOr[Input[String]] = js.native
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
  
  @js.native
  trait ConfigurationSetState extends StObject {
    
    /**
      * The name of the configuration set
      */
    val name: js.UndefOr[Input[String]] = js.native
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
