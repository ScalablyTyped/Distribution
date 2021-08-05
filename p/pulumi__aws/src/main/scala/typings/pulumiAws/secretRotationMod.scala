package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.SecretRotationRotationRules
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretRotationMod {
  
  @JSImport("@pulumi/aws/secretsmanager/secretRotation", "SecretRotation")
  @js.native
  class SecretRotation protected () extends CustomResource {
    /**
      * Create a SecretRotation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretRotationArgs) = this()
    def this(name: String, args: SecretRotationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether automatic rotation is enabled for this secret.
      */
    val rotationEnabled: Output_[Boolean] = js.native
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret.
      */
    val rotationLambdaArn: Output_[String] = js.native
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below.
      */
    val rotationRules: Output_[SecretRotationRotationRules] = js.native
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: Output_[String] = js.native
    
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object SecretRotation {
    
    @JSImport("@pulumi/aws/secretsmanager/secretRotation", "SecretRotation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecretRotation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecretRotation]
    inline def get(name: String, id: Input[ID], state: SecretRotationState): SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecretRotation]
    inline def get(name: String, id: Input[ID], state: SecretRotationState, opts: CustomResourceOptions): SecretRotation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecretRotation]
    
    /**
      * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean]
  }
  
  trait SecretRotationArgs extends StObject {
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret.
      */
    val rotationLambdaArn: Input[String]
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below.
      */
    val rotationRules: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules]
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: Input[String]
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SecretRotationArgs {
    
    inline def apply(
      rotationLambdaArn: Input[String],
      rotationRules: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules],
      secretId: Input[String]
    ): SecretRotationArgs = {
      val __obj = js.Dynamic.literal(rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationArgs]
    }
    
    extension [Self <: SecretRotationArgs](x: Self) {
      
      inline def setRotationLambdaArn(value: Input[String]): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      inline def setRotationRules(value: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      inline def setSecretId(value: Input[String]): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait SecretRotationState extends StObject {
    
    /**
      * Specifies whether automatic rotation is enabled for this secret.
      */
    val rotationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret.
      */
    val rotationLambdaArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below.
      */
    val rotationRules: js.UndefOr[Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules]] = js.undefined
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: js.UndefOr[Input[String]] = js.undefined
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SecretRotationState {
    
    inline def apply(): SecretRotationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretRotationState]
    }
    
    extension [Self <: SecretRotationState](x: Self) {
      
      inline def setRotationEnabled(value: Input[Boolean]): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
      
      inline def setRotationLambdaArn(value: Input[String]): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      inline def setRotationLambdaArnUndefined: Self = StObject.set(x, "rotationLambdaArn", js.undefined)
      
      inline def setRotationRules(value: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      inline def setRotationRulesUndefined: Self = StObject.set(x, "rotationRules", js.undefined)
      
      inline def setSecretId(value: Input[String]): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      inline def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
