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

object defaultKmsKeyMod {
  
  @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey")
  @js.native
  class DefaultKmsKey protected () extends CustomResource {
    /**
      * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultKmsKeyArgs) = this()
    def this(name: String, args: DefaultKmsKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
      */
    val keyArn: Output_[String] = js.native
  }
  /* static members */
  object DefaultKmsKey {
    
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID]): DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): DefaultKmsKey = js.native
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): DefaultKmsKey = js.native
    
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
  }
  
  @js.native
  trait DefaultKmsKeyArgs extends StObject {
    
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
      */
    val keyArn: Input[String] = js.native
  }
  object DefaultKmsKeyArgs {
    
    @scala.inline
    def apply(keyArn: Input[String]): DefaultKmsKeyArgs = {
      val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultKmsKeyArgs]
    }
    
    @scala.inline
    implicit class DefaultKmsKeyArgsMutableBuilder[Self <: DefaultKmsKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyArn(value: Input[String]): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultKmsKeyState extends StObject {
    
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
      */
    val keyArn: js.UndefOr[Input[String]] = js.native
  }
  object DefaultKmsKeyState {
    
    @scala.inline
    def apply(): DefaultKmsKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultKmsKeyState]
    }
    
    @scala.inline
    implicit class DefaultKmsKeyStateMutableBuilder[Self <: DefaultKmsKeyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyArn(value: Input[String]): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    }
  }
}
