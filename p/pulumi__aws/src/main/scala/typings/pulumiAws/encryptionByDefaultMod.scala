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

object encryptionByDefaultMod {
  
  @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault")
  @js.native
  class EncryptionByDefault protected () extends CustomResource {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object EncryptionByDefault {
    
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID]): EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): EncryptionByDefault = js.native
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): EncryptionByDefault = js.native
    
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
  }
  
  @js.native
  trait EncryptionByDefaultArgs extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
  }
  object EncryptionByDefaultArgs {
    
    @scala.inline
    def apply(): EncryptionByDefaultArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionByDefaultArgs]
    }
    
    @scala.inline
    implicit class EncryptionByDefaultArgsMutableBuilder[Self <: EncryptionByDefaultArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  @js.native
  trait EncryptionByDefaultState extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
  }
  object EncryptionByDefaultState {
    
    @scala.inline
    def apply(): EncryptionByDefaultState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionByDefaultState]
    }
    
    @scala.inline
    implicit class EncryptionByDefaultStateMutableBuilder[Self <: EncryptionByDefaultState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
