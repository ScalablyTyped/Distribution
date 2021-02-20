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

object confgurationSetMod {
  
  @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet")
  @js.native
  class ConfgurationSet protected () extends CustomResource {
    /**
      * Create a ConfgurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.ses.ConfgurationSet has been deprecated in favor of aws.ses.ConfigurationSet */
    def this(name: String) = this()
    def this(name: String, args: ConfgurationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
    
    val name: Output_[String] = js.native
  }
  /* static members */
  object ConfgurationSet {
    
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState): ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): ConfgurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
  }
  
  @js.native
  trait ConfgurationSetArgs extends StObject {
    
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ConfgurationSetArgs {
    
    @scala.inline
    def apply(): ConfgurationSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfgurationSetArgs]
    }
    
    @scala.inline
    implicit class ConfgurationSetArgsMutableBuilder[Self <: ConfgurationSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait ConfgurationSetState extends StObject {
    
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ConfgurationSetState {
    
    @scala.inline
    def apply(): ConfgurationSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfgurationSetState]
    }
    
    @scala.inline
    implicit class ConfgurationSetStateMutableBuilder[Self <: ConfgurationSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
