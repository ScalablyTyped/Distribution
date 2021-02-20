package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.SecretRotationRules
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretMod {
  
  @JSImport("@pulumi/aws/secretsmanager/secret", "Secret")
  @js.native
  class Secret protected () extends CustomResource {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecretArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the secret.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the secret.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the ARN or Id of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `namePrefix`.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[String] = js.native
    
    /**
      * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
      */
    val policy: Output_[String] = js.native
    
    /**
      * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
      */
    val recoveryWindowInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Specifies whether automatic rotation is enabled for this secret.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationEnabled: Output_[Boolean] = js.native
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationLambdaArn: Output_[String] = js.native
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationRules: Output_[SecretRotationRules] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the secret.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Secret {
    
    /**
      * Get an existing Secret resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/secretsmanager/secret", "Secret.get")
    @js.native
    def get(name: String, id: Input[ID]): Secret = js.native
    @JSImport("@pulumi/aws/secretsmanager/secret", "Secret.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Secret = js.native
    @JSImport("@pulumi/aws/secretsmanager/secret", "Secret.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretState): Secret = js.native
    @JSImport("@pulumi/aws/secretsmanager/secret", "Secret.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): Secret = js.native
    
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/secretsmanager/secret", "Secret.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
  }
  
  @js.native
  trait SecretArgs extends StObject {
    
    /**
      * A description of the secret.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the ARN or Id of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `namePrefix`.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
      */
    val recoveryWindowInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationLambdaArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationRules: js.UndefOr[Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRules]] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the secret.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object SecretArgs {
    
    @scala.inline
    def apply(): SecretArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretArgs]
    }
    
    @scala.inline
    implicit class SecretArgsMutableBuilder[Self <: SecretArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRecoveryWindowInDays(value: Input[Double]): Self = StObject.set(x, "recoveryWindowInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryWindowInDaysUndefined: Self = StObject.set(x, "recoveryWindowInDays", js.undefined)
      
      @scala.inline
      def setRotationLambdaArn(value: Input[String]): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationLambdaArnUndefined: Self = StObject.set(x, "rotationLambdaArn", js.undefined)
      
      @scala.inline
      def setRotationRules(value: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRules]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRulesUndefined: Self = StObject.set(x, "rotationRules", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait SecretState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the secret.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the secret.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the ARN or Id of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `namePrefix`.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
      */
    val recoveryWindowInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Specifies whether automatic rotation is enabled for this secret.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies the ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationLambdaArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A structure that defines the rotation configuration for this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
      */
    val rotationRules: js.UndefOr[Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRules]] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the secret.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object SecretState {
    
    @scala.inline
    def apply(): SecretState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretState]
    }
    
    @scala.inline
    implicit class SecretStateMutableBuilder[Self <: SecretState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRecoveryWindowInDays(value: Input[Double]): Self = StObject.set(x, "recoveryWindowInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryWindowInDaysUndefined: Self = StObject.set(x, "recoveryWindowInDays", js.undefined)
      
      @scala.inline
      def setRotationEnabled(value: Input[Boolean]): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
      
      @scala.inline
      def setRotationLambdaArn(value: Input[String]): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationLambdaArnUndefined: Self = StObject.set(x, "rotationLambdaArn", js.undefined)
      
      @scala.inline
      def setRotationRules(value: Input[typings.pulumiAws.inputMod.secretsmanager.SecretRotationRules]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRulesUndefined: Self = StObject.set(x, "rotationRules", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
