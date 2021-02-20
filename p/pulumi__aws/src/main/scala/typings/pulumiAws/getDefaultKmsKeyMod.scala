package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDefaultKmsKeyMod {
  
  @JSImport("@pulumi/aws/ebs/getDefaultKmsKey", "getDefaultKmsKey")
  @js.native
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] = js.native
  @JSImport("@pulumi/aws/ebs/getDefaultKmsKey", "getDefaultKmsKey")
  @js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] = js.native
  
  @js.native
  trait GetDefaultKmsKeyResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Amazon Resource Name (ARN) of the default KMS key uses to encrypt an EBS volume in this region when no key is specified in an API call that creates the volume and encryption by default is enabled.
      */
    val keyArn: String = js.native
  }
  object GetDefaultKmsKeyResult {
    
    @scala.inline
    def apply(id: String, keyArn: String): GetDefaultKmsKeyResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyArn = keyArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDefaultKmsKeyResult]
    }
    
    @scala.inline
    implicit class GetDefaultKmsKeyResultMutableBuilder[Self <: GetDefaultKmsKeyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyArn(value: String): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    }
  }
}
