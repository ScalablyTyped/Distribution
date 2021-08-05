package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
    
    val name: Output_[String] = js.native
  }
  /* static members */
  object ConfgurationSet {
    
    @JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ConfgurationSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfgurationSet]
    inline def get(name: String, id: Input[ID], state: ConfgurationSetState): ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ConfgurationSet]
    inline def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfgurationSet]
    
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean]
  }
  
  trait ConfgurationSetArgs extends StObject {
    
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ConfgurationSetArgs {
    
    inline def apply(): ConfgurationSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfgurationSetArgs]
    }
    
    extension [Self <: ConfgurationSetArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ConfgurationSetState extends StObject {
    
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ConfgurationSetState {
    
    inline def apply(): ConfgurationSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfgurationSetState]
    }
    
    extension [Self <: ConfgurationSetState](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
