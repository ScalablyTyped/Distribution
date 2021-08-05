package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretVersionMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecretVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecretVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretVersionResult]]
  inline def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecretVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretVersionResult]]
  
  trait GetSecretVersionArgs extends StObject {
    
    /**
      * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
      */
    val secretId: String
    
    /**
      * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
      */
    val versionId: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
      */
    val versionStage: js.UndefOr[String] = js.undefined
  }
  object GetSecretVersionArgs {
    
    inline def apply(secretId: String): GetSecretVersionArgs = {
      val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretVersionArgs]
    }
    
    extension [Self <: GetSecretVersionArgs](x: Self) {
      
      inline def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      inline def setVersionStage(value: String): Self = StObject.set(x, "versionStage", value.asInstanceOf[js.Any])
      
      inline def setVersionStageUndefined: Self = StObject.set(x, "versionStage", js.undefined)
    }
  }
  
  trait GetSecretVersionResult extends StObject {
    
    /**
      * The ARN of the secret.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
      */
    val secretBinary: String
    
    val secretId: String
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a string.
      */
    val secretString: String
    
    /**
      * The unique identifier of this version of the secret.
      */
    val versionId: String
    
    val versionStage: js.UndefOr[String] = js.undefined
    
    val versionStages: js.Array[String]
  }
  object GetSecretVersionResult {
    
    inline def apply(
      arn: String,
      id: String,
      secretBinary: String,
      secretId: String,
      secretString: String,
      versionId: String,
      versionStages: js.Array[String]
    ): GetSecretVersionResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], secretBinary = secretBinary.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any], secretString = secretString.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any], versionStages = versionStages.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretVersionResult]
    }
    
    extension [Self <: GetSecretVersionResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSecretBinary(value: String): Self = StObject.set(x, "secretBinary", value.asInstanceOf[js.Any])
      
      inline def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      inline def setSecretString(value: String): Self = StObject.set(x, "secretString", value.asInstanceOf[js.Any])
      
      inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionStage(value: String): Self = StObject.set(x, "versionStage", value.asInstanceOf[js.Any])
      
      inline def setVersionStageUndefined: Self = StObject.set(x, "versionStage", js.undefined)
      
      inline def setVersionStages(value: js.Array[String]): Self = StObject.set(x, "versionStages", value.asInstanceOf[js.Any])
      
      inline def setVersionStagesVarargs(value: String*): Self = StObject.set(x, "versionStages", js.Array(value :_*))
    }
  }
}
