package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainEncryptionAtRest extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * The KMS key id used to encrypt data at rest.
    */
  var kmsKeyId: String = js.native
}
object GetDomainEncryptionAtRest {
  
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): GetDomainEncryptionAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainEncryptionAtRest]
  }
  
  @scala.inline
  implicit class GetDomainEncryptionAtRestMutableBuilder[Self <: GetDomainEncryptionAtRest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
  }
}
