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

object encryptionConfigMod {
  
  @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig")
  @js.native
  class EncryptionConfig protected () extends CustomResource {
    /**
      * Create a EncryptionConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EncryptionConfigArgs) = this()
    def this(name: String, args: EncryptionConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An AWS KMS customer master key (CMK) ARN.
      */
    val keyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object EncryptionConfig {
    
    /**
      * Get an existing EncryptionConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): EncryptionConfig = js.native
    @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EncryptionConfig = js.native
    @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionConfigState): EncryptionConfig = js.native
    @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionConfigState, opts: CustomResourceOptions): EncryptionConfig = js.native
    
    /**
      * Returns true if the given object is an instance of EncryptionConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/xray/encryptionConfig", "EncryptionConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/encryptionConfig.EncryptionConfig */ Boolean = js.native
  }
  
  @js.native
  trait EncryptionConfigArgs extends StObject {
    
    /**
      * An AWS KMS customer master key (CMK) ARN.
      */
    val keyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
      */
    val `type`: Input[String] = js.native
  }
  object EncryptionConfigArgs {
    
    @scala.inline
    def apply(`type`: Input[String]): EncryptionConfigArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionConfigArgs]
    }
    
    @scala.inline
    implicit class EncryptionConfigArgsMutableBuilder[Self <: EncryptionConfigArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EncryptionConfigState extends StObject {
    
    /**
      * An AWS KMS customer master key (CMK) ARN.
      */
    val keyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object EncryptionConfigState {
    
    @scala.inline
    def apply(): EncryptionConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionConfigState]
    }
    
    @scala.inline
    implicit class EncryptionConfigStateMutableBuilder[Self <: EncryptionConfigState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
