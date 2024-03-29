package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestinationBucketEncryptionSseKms extends StObject {
  
  /**
    * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
    */
  var keyId: Input[String]
}
object InventoryDestinationBucketEncryptionSseKms {
  
  inline def apply(keyId: Input[String]): InventoryDestinationBucketEncryptionSseKms = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucketEncryptionSseKms]
  }
  
  extension [Self <: InventoryDestinationBucketEncryptionSseKms](x: Self) {
    
    inline def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
  }
}
