package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEncryptionByDefaultMod {
  
  @JSImport("@pulumi/aws/ebs/getEncryptionByDefault", "getEncryptionByDefault")
  @js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] = js.native
  @JSImport("@pulumi/aws/ebs/getEncryptionByDefault", "getEncryptionByDefault")
  @js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] = js.native
  
  @js.native
  trait GetEncryptionByDefaultResult extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
      */
    val enabled: Boolean = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
  }
  object GetEncryptionByDefaultResult {
    
    @scala.inline
    def apply(enabled: Boolean, id: String): GetEncryptionByDefaultResult = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEncryptionByDefaultResult]
    }
    
    @scala.inline
    implicit class GetEncryptionByDefaultResultMutableBuilder[Self <: GetEncryptionByDefaultResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
