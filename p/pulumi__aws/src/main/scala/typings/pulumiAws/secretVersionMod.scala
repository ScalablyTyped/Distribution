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

object secretVersionMod {
  
  @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion")
  @js.native
  class SecretVersion protected () extends CustomResource {
    /**
      * Create a SecretVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretVersionArgs) = this()
    def this(name: String, args: SecretVersionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the secret.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
      */
    val secretBinary: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: Output_[String] = js.native
    
    /**
      * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
      */
    val secretString: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The unique identifier of the version of the secret.
      */
    val versionId: Output_[String] = js.native
    
    /**
      * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
      */
    val versionStages: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object SecretVersion {
    
    /**
      * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion.get")
    @js.native
    def get(name: String, id: Input[ID]): SecretVersion = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecretVersion = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): SecretVersion = js.native
    @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): SecretVersion = js.native
    
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
  
  @js.native
  trait SecretVersionArgs extends StObject {
    
    /**
      * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
      */
    val secretBinary: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: Input[String] = js.native
    
    /**
      * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
      */
    val secretString: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
      */
    val versionStages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object SecretVersionArgs {
    
    @scala.inline
    def apply(secretId: Input[String]): SecretVersionArgs = {
      val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretVersionArgs]
    }
    
    @scala.inline
    implicit class SecretVersionArgsMutableBuilder[Self <: SecretVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretBinary(value: Input[String]): Self = StObject.set(x, "secretBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretBinaryUndefined: Self = StObject.set(x, "secretBinary", js.undefined)
      
      @scala.inline
      def setSecretId(value: Input[String]): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretString(value: Input[String]): Self = StObject.set(x, "secretString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretStringUndefined: Self = StObject.set(x, "secretString", js.undefined)
      
      @scala.inline
      def setVersionStages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "versionStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStagesUndefined: Self = StObject.set(x, "versionStages", js.undefined)
      
      @scala.inline
      def setVersionStagesVarargs(value: Input[String]*): Self = StObject.set(x, "versionStages", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SecretVersionState extends StObject {
    
    /**
      * The ARN of the secret.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
      */
    val secretBinary: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
      */
    val secretId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
      */
    val secretString: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier of the version of the secret.
      */
    val versionId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
      */
    val versionStages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object SecretVersionState {
    
    @scala.inline
    def apply(): SecretVersionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretVersionState]
    }
    
    @scala.inline
    implicit class SecretVersionStateMutableBuilder[Self <: SecretVersionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setSecretBinary(value: Input[String]): Self = StObject.set(x, "secretBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretBinaryUndefined: Self = StObject.set(x, "secretBinary", js.undefined)
      
      @scala.inline
      def setSecretId(value: Input[String]): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
      
      @scala.inline
      def setSecretString(value: Input[String]): Self = StObject.set(x, "secretString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretStringUndefined: Self = StObject.set(x, "secretString", js.undefined)
      
      @scala.inline
      def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setVersionStages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "versionStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStagesUndefined: Self = StObject.set(x, "versionStages", js.undefined)
      
      @scala.inline
      def setVersionStagesVarargs(value: Input[String]*): Self = StObject.set(x, "versionStages", js.Array(value :_*))
    }
  }
}
