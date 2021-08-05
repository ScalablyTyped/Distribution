package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ebs/defaultKmsKey", "DefaultKmsKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultKmsKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultKmsKey]
    inline def get(name: String, id: Input[ID], state: DefaultKmsKeyState): DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultKmsKey]
    inline def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): DefaultKmsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultKmsKey]
    
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean]
  }
  
  trait DefaultKmsKeyArgs extends StObject {
    
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
      */
    val keyArn: Input[String]
  }
  object DefaultKmsKeyArgs {
    
    inline def apply(keyArn: Input[String]): DefaultKmsKeyArgs = {
      val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultKmsKeyArgs]
    }
    
    extension [Self <: DefaultKmsKeyArgs](x: Self) {
      
      inline def setKeyArn(value: Input[String]): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultKmsKeyState extends StObject {
    
    /**
      * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
      */
    val keyArn: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultKmsKeyState {
    
    inline def apply(): DefaultKmsKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultKmsKeyState]
    }
    
    extension [Self <: DefaultKmsKeyState](x: Self) {
      
      inline def setKeyArn(value: Input[String]): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
      
      inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    }
  }
}
