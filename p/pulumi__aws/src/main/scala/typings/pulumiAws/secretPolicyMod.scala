package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/secretsmanager/secretPolicy", "SecretPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecretPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecretPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecretPolicy]
    inline def get(name: String, id: Input[ID], state: SecretPolicyState): SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecretPolicy]
    inline def get(name: String, id: Input[ID], state: SecretPolicyState, opts: CustomResourceOptions): SecretPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecretPolicy]
    
    /**
      * Returns true if the given object is an instance of SecretPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretPolicy.SecretPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secretPolicy.SecretPolicy */ Boolean]
  }
  
  trait SecretPolicyArgs extends StObject {
    
    /**
      * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.undefined
    
    val policy: Input[String]
    
    /**
      * Secret ARN.
      */
    val secretArn: Input[String]
  }
  object SecretPolicyArgs {
    
    inline def apply(policy: Input[String], secretArn: Input[String]): SecretPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretPolicyArgs]
    }
    
    extension [Self <: SecretPolicyArgs](x: Self) {
      
      inline def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretPolicyState extends StObject {
    
    /**
      * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.undefined
    
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Secret ARN.
      */
    val secretArn: js.UndefOr[Input[String]] = js.undefined
  }
  object SecretPolicyState {
    
    inline def apply(): SecretPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretPolicyState]
    }
    
    extension [Self <: SecretPolicyState](x: Self) {
      
      inline def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      inline def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
}
