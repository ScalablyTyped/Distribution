package typings.pulumiAws

import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRotationRule
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretRotationMod {
  
  @JSImport("@pulumi/aws/secretsmanager/getSecretRotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSecretRotation(args: GetSecretRotationArgs): js.Promise[GetSecretRotationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecretRotation")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretRotationResult]]
  @scala.inline
  def getSecretRotation(args: GetSecretRotationArgs, opts: InvokeOptions): js.Promise[GetSecretRotationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecretRotation")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretRotationResult]]
  
  trait GetSecretRotationArgs extends StObject {
    
    /**
      * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
      */
    val secretId: String
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
  
  trait GetSecretRotationResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN of the secret.
      */
    val rotationEnabled: Boolean
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a string.
      */
    val rotationLambdaArn: String
    
    /**
      * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
      */
    val rotationRules: js.Array[GetSecretRotationRotationRule]
    
    val secretId: String
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
