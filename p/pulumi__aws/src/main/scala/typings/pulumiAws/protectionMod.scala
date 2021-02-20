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

object protectionMod {
  
  @JSImport("@pulumi/aws/shield/protection", "Protection")
  @js.native
  class Protection protected () extends CustomResource {
    /**
      * Create a Protection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProtectionArgs) = this()
    def this(name: String, args: ProtectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A friendly name for the Protection you are creating.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN (Amazon Resource Name) of the resource to be protected.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object Protection {
    
    /**
      * Get an existing Protection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/shield/protection", "Protection.get")
    @js.native
    def get(name: String, id: Input[ID]): Protection = js.native
    @JSImport("@pulumi/aws/shield/protection", "Protection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Protection = js.native
    @JSImport("@pulumi/aws/shield/protection", "Protection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProtectionState): Protection = js.native
    @JSImport("@pulumi/aws/shield/protection", "Protection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProtectionState, opts: CustomResourceOptions): Protection = js.native
    
    /**
      * Returns true if the given object is an instance of Protection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/shield/protection", "Protection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/shield/protection.Protection */ Boolean = js.native
  }
  
  @js.native
  trait ProtectionArgs extends StObject {
    
    /**
      * A friendly name for the Protection you are creating.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN (Amazon Resource Name) of the resource to be protected.
      */
    val resourceArn: Input[String] = js.native
  }
  object ProtectionArgs {
    
    @scala.inline
    def apply(resourceArn: Input[String]): ProtectionArgs = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectionArgs]
    }
    
    @scala.inline
    implicit class ProtectionArgsMutableBuilder[Self <: ProtectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtectionState extends StObject {
    
    /**
      * A friendly name for the Protection you are creating.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN (Amazon Resource Name) of the resource to be protected.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
  }
  object ProtectionState {
    
    @scala.inline
    def apply(): ProtectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProtectionState]
    }
    
    @scala.inline
    implicit class ProtectionStateMutableBuilder[Self <: ProtectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
