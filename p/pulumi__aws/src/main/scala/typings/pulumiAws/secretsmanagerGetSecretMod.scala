package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRule
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanagerGetSecretMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSecret(): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")().asInstanceOf[js.Promise[GetSecretResult]]
  inline def getSecret(args: Unit, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  inline def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretResult]]
  inline def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  
  trait GetSecretArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the secret to retrieve.
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the secret to retrieve.
      */
    val name: js.UndefOr[String] = js.undefined
  }
  object GetSecretArgs {
    
    inline def apply(): GetSecretArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSecretArgs]
    }
    
    extension [Self <: GetSecretArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GetSecretResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the secret.
      */
    val arn: String
    
    /**
      * A description of the secret.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
      */
    val kmsKeyId: String
    
    val name: String
    
    /**
      * The resource-based policy document that's attached to the secret.
      */
    val policy: String
    
    /**
      * Whether rotation is enabled or not.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationEnabled: Boolean
    
    /**
      * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationLambdaArn: String
    
    /**
      * Rotation rules if rotation is enabled.
      *
      * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
      */
    val rotationRules: js.Array[GetSecretRotationRule]
    
    /**
      * Tags of the secret.
      */
    val tags: StringDictionary[String]
  }
  object GetSecretResult {
    
    inline def apply(
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
    
    extension [Self <: GetSecretResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotationLambdaArn(value: String): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      inline def setRotationRules(value: js.Array[GetSecretRotationRule]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      inline def setRotationRulesVarargs(value: GetSecretRotationRule*): Self = StObject.set(x, "rotationRules", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
