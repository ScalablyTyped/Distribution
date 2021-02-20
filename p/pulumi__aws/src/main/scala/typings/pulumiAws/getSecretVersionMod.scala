package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretVersionMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecretVersion", "getSecretVersion")
  @js.native
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] = js.native
  @JSImport("@pulumi/aws/secretsmanager/getSecretVersion", "getSecretVersion")
  @js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] = js.native
  
  @js.native
  trait GetSecretVersionArgs extends StObject {
    
    /**
      * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
      */
    val secretId: String = js.native
    
    /**
      * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
      */
    val versionId: js.UndefOr[String] = js.native
    
    /**
      * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
      */
    val versionStage: js.UndefOr[String] = js.native
  }
  object GetSecretVersionArgs {
    
    @scala.inline
    def apply(secretId: String): GetSecretVersionArgs = {
      val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretVersionArgs]
    }
    
    @scala.inline
    implicit class GetSecretVersionArgsMutableBuilder[Self <: GetSecretVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
      
      @scala.inline
      def setVersionStage(value: String): Self = StObject.set(x, "versionStage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStageUndefined: Self = StObject.set(x, "versionStage", js.undefined)
    }
  }
  
  @js.native
  trait GetSecretVersionResult extends StObject {
    
    /**
      * The ARN of the secret.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
      */
    val secretBinary: String = js.native
    
    val secretId: String = js.native
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a string.
      */
    val secretString: String = js.native
    
    /**
      * The unique identifier of this version of the secret.
      */
    val versionId: String = js.native
    
    val versionStage: js.UndefOr[String] = js.native
    
    val versionStages: js.Array[String] = js.native
  }
  object GetSecretVersionResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetSecretVersionResultMutableBuilder[Self <: GetSecretVersionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretBinary(value: String): Self = StObject.set(x, "secretBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretString(value: String): Self = StObject.set(x, "secretString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStage(value: String): Self = StObject.set(x, "versionStage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStageUndefined: Self = StObject.set(x, "versionStage", js.undefined)
      
      @scala.inline
      def setVersionStages(value: js.Array[String]): Self = StObject.set(x, "versionStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionStagesVarargs(value: String*): Self = StObject.set(x, "versionStages", js.Array(value :_*))
    }
  }
}
