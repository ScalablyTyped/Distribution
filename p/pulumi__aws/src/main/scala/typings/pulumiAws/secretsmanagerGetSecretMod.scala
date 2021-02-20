package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRule
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanagerGetSecretMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecret", "getSecret")
  @js.native
  def getSecret(): js.Promise[GetSecretResult] = js.native
  @JSImport("@pulumi/aws/secretsmanager/getSecret", "getSecret")
  @js.native
  def getSecret(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  @JSImport("@pulumi/aws/secretsmanager/getSecret", "getSecret")
  @js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = js.native
  @JSImport("@pulumi/aws/secretsmanager/getSecret", "getSecret")
  @js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  
  @js.native
  trait GetSecretArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the secret to retrieve.
      */
    val arn: js.UndefOr[String] = js.native
    
    /**
      * The name of the secret to retrieve.
      */
    val name: js.UndefOr[String] = js.native
  }
  object GetSecretArgs {
    
    @scala.inline
    def apply(): GetSecretArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSecretArgs]
    }
    
    @scala.inline
    implicit class GetSecretArgsMutableBuilder[Self <: GetSecretArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GetSecretResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the secret.
      */
    val arn: String = js.native
    
    /**
      * A description of the secret.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
      */
    val kmsKeyId: String = js.native
    
    val name: String = js.native
    
    /**
      * The resource-based policy document that's attached to the secret.
      */
    val policy: String = js.native
    
    /**
      * Whether rotation is enabled or not.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationEnabled: Boolean = js.native
    
    /**
      * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationLambdaArn: String = js.native
    
    /**
      * Rotation rules if rotation is enabled.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationRules: js.Array[GetSecretRotationRule] = js.native
    
    /**
      * Tags of the secret.
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetSecretResult {
    
    @scala.inline
    def apply(
      arn: String,
      description: String,
      id: String,
      kmsKeyId: String,
      name: String,
      policy: String,
      rotationEnabled: Boolean,
      rotationLambdaArn: String,
      rotationRules: js.Array[GetSecretRotationRule],
      tags: StringDictionary[String]
    ): GetSecretResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretResult]
    }
    
    @scala.inline
    implicit class GetSecretResultMutableBuilder[Self <: GetSecretResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationLambdaArn(value: String): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRules(value: js.Array[GetSecretRotationRule]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRulesVarargs(value: GetSecretRotationRule*): Self = StObject.set(x, "rotationRules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
