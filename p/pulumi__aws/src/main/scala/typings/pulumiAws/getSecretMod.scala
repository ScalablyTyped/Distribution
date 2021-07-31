package typings.pulumiAws

import typings.pulumiAws.inputMod.kms.GetSecretSecret
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretMod {
  
  @JSImport("@pulumi/aws/kms/getSecret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSecretResult]]
  @scala.inline
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSecretResult]]
  
  trait GetSecretArgs extends StObject {
    
    val secrets: js.Array[GetSecretSecret]
  }
  object GetSecretArgs {
    
    @scala.inline
    def apply(secrets: js.Array[GetSecretSecret]): GetSecretArgs = {
      val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretArgs]
    }
    
    @scala.inline
    implicit class GetSecretArgsMutableBuilder[Self <: GetSecretArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecrets(value: js.Array[GetSecretSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsVarargs(value: GetSecretSecret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    }
  }
  
  trait GetSecretResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val secrets: js.Array[typings.pulumiAws.outputMod.kms.GetSecretSecret]
  }
  object GetSecretResult {
    
    @scala.inline
    def apply(id: String, secrets: js.Array[typings.pulumiAws.outputMod.kms.GetSecretSecret]): GetSecretResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretResult]
    }
    
    @scala.inline
    implicit class GetSecretResultMutableBuilder[Self <: GetSecretResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecrets(value: js.Array[typings.pulumiAws.outputMod.kms.GetSecretSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsVarargs(value: typings.pulumiAws.outputMod.kms.GetSecretSecret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    }
  }
}
