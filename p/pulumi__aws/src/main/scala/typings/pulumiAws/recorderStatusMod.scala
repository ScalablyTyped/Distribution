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

object recorderStatusMod {
  
  @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus")
  @js.native
  class RecorderStatus protected () extends CustomResource {
    /**
      * Create a RecorderStatus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderStatusArgs) = this()
    def this(name: String, args: RecorderStatusArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether the configuration recorder should be enabled or disabled.
      */
    val isEnabled: Output_[Boolean] = js.native
    
    /**
      * The name of the recorder
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object RecorderStatus {
    
    /**
      * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus.get")
    @js.native
    def get(name: String, id: Input[ID]): RecorderStatus = js.native
    @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RecorderStatus = js.native
    @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState): RecorderStatus = js.native
    @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): RecorderStatus = js.native
    
    /**
      * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = js.native
  }
  
  @js.native
  trait RecorderStatusArgs extends StObject {
    
    /**
      * Whether the configuration recorder should be enabled or disabled.
      */
    val isEnabled: Input[Boolean] = js.native
    
    /**
      * The name of the recorder
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object RecorderStatusArgs {
    
    @scala.inline
    def apply(isEnabled: Input[Boolean]): RecorderStatusArgs = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecorderStatusArgs]
    }
    
    @scala.inline
    implicit class RecorderStatusArgsMutableBuilder[Self <: RecorderStatusArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait RecorderStatusState extends StObject {
    
    /**
      * Whether the configuration recorder should be enabled or disabled.
      */
    val isEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the recorder
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object RecorderStatusState {
    
    @scala.inline
    def apply(): RecorderStatusState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderStatusState]
    }
    
    @scala.inline
    implicit class RecorderStatusStateMutableBuilder[Self <: RecorderStatusState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
