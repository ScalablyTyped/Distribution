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

object secretPolicyMod {
  
  @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy")
  @js.native
  class SecretPolicy protected () extends CustomResource {
    /**
      * Create a SecretPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretPolicyArgs) = this()
    def this(name: String, args: SecretPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
      */
    val blockPublicPolicy: Output_[js.UndefOr[Boolean]] = js.native
    
    val policy: Output_[String] = js.native
    
    /**
      * Secret ARN.
      */
    val secretArn: Output_[String] = js.native
  }
  /* static members */
  object SecretPolicy {
    
    /**
      * Get an existing SecretPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): SecretPolicy = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecretPolicy = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretPolicyState): SecretPolicy = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretPolicyState, opts: CustomResourceOptions): SecretPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of SecretPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretPolicy.SecretPolicy */ Boolean = js.native
  }
  
  @js.native
  trait SecretPolicyArgs extends StObject {
    
    /**
      * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
    
    val policy: Input[String] = js.native
    
    /**
      * Secret ARN.
      */
    val secretArn: Input[String] = js.native
  }
  object SecretPolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String], secretArn: Input[String]): SecretPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretPolicyArgs]
    }
    
    @scala.inline
    implicit class SecretPolicyArgsMutableBuilder[Self <: SecretPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecretPolicyState extends StObject {
    
    /**
      * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
    
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Secret ARN.
      */
    val secretArn: js.UndefOr[Input[String]] = js.native
  }
  object SecretPolicyState {
    
    @scala.inline
    def apply(): SecretPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretPolicyState]
    }
    
    @scala.inline
    implicit class SecretPolicyStateMutableBuilder[Self <: SecretPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
}
