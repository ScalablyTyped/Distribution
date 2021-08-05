package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEncryptionInfo extends StObject {
  
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[Input[ClusterEncryptionInfoEncryptionInTransit]] = js.undefined
}
object ClusterEncryptionInfo {
  
  inline def apply(): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
  
  extension [Self <: ClusterEncryptionInfo](x: Self) {
    
    inline def setEncryptionAtRestKmsKeyArn(value: Input[String]): Self = StObject.set(x, "encryptionAtRestKmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestKmsKeyArnUndefined: Self = StObject.set(x, "encryptionAtRestKmsKeyArn", js.undefined)
    
    inline def setEncryptionInTransit(value: Input[ClusterEncryptionInfoEncryptionInTransit]): Self = StObject.set(x, "encryptionInTransit", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInTransitUndefined: Self = StObject.set(x, "encryptionInTransit", js.undefined)
  }
}
