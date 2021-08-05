package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainEncryptionAtRest extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  
  /**
    * The KMS key id used to encrypt data at rest.
    */
  var kmsKeyId: String
}
object GetDomainEncryptionAtRest {
  
  inline def apply(enabled: Boolean, kmsKeyId: String): GetDomainEncryptionAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainEncryptionAtRest]
  }
  
  extension [Self <: GetDomainEncryptionAtRest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
  }
}
