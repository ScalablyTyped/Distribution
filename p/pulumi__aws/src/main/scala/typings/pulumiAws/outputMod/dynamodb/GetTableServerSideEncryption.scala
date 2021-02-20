package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableServerSideEncryption extends StObject {
  
  var enabled: Boolean = js.native
  
  var kmsKeyArn: String = js.native
}
object GetTableServerSideEncryption {
  
  @scala.inline
  def apply(enabled: Boolean, kmsKeyArn: String): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
  
  @scala.inline
  implicit class GetTableServerSideEncryptionMutableBuilder[Self <: GetTableServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
