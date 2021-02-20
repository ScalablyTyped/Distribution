package typings.pulumiAws

import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRotationRule
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretRotationMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecretRotation", "getSecretRotation")
  @js.native
  def getSecretRotation(args: GetSecretRotationArgs): js.Promise[GetSecretRotationResult] = js.native
  @JSImport("@pulumi/aws/secretsmanager/getSecretRotation", "getSecretRotation")
  @js.native
  def getSecretRotation(args: GetSecretRotationArgs, opts: InvokeOptions): js.Promise[GetSecretRotationResult] = js.native
  
  @js.native
  trait GetSecretRotationArgs extends StObject {
    
    /**
      * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
      */
    val secretId: String = js.native
  }
  object GetSecretRotationArgs {
    
    @scala.inline
    def apply(secretId: String): GetSecretRotationArgs = {
      val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationArgs]
    }
    
    @scala.inline
    implicit class GetSecretRotationArgsMutableBuilder[Self <: GetSecretRotationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSecretRotationResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN of the secret.
      */
    val rotationEnabled: Boolean = js.native
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a string.
      */
    val rotationLambdaArn: String = js.native
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
      */
    val rotationRules: js.Array[GetSecretRotationRotationRule] = js.native
    
    val secretId: String = js.native
  }
  object GetSecretRotationResult {
    
    @scala.inline
    def apply(
      id: String,
      rotationEnabled: Boolean,
      rotationLambdaArn: String,
      rotationRules: js.Array[GetSecretRotationRotationRule],
      secretId: String
    ): GetSecretRotationResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationResult]
    }
    
    @scala.inline
    implicit class GetSecretRotationResultMutableBuilder[Self <: GetSecretRotationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationLambdaArn(value: String): Self = StObject.set(x, "rotationLambdaArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRules(value: js.Array[GetSecretRotationRotationRule]): Self = StObject.set(x, "rotationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRulesVarargs(value: GetSecretRotationRotationRule*): Self = StObject.set(x, "rotationRules", js.Array(value :_*))
      
      @scala.inline
      def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
    }
  }
}
