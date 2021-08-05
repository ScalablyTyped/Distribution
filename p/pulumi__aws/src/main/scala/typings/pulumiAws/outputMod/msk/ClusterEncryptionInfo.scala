package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEncryptionInfo extends StObject {
  
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: String
  
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[ClusterEncryptionInfoEncryptionInTransit] = js.undefined
}
object ClusterEncryptionInfo {
  
  inline def apply(encryptionAtRestKmsKeyArn: String): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal(encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
  
  extension [Self <: ClusterEncryptionInfo](x: Self) {
    
    inline def setEncryptionAtRestKmsKeyArn(value: String): Self = StObject.set(x, "encryptionAtRestKmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInTransit(value: ClusterEncryptionInfoEncryptionInTransit): Self = StObject.set(x, "encryptionInTransit", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInTransitUndefined: Self = StObject.set(x, "encryptionInTransit", js.undefined)
  }
}
