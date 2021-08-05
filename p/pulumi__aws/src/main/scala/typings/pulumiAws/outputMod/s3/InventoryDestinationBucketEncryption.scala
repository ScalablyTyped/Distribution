package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestinationBucketEncryption extends StObject {
  
  /**
    * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
    */
  var sseKms: js.UndefOr[InventoryDestinationBucketEncryptionSseKms] = js.undefined
  
  /**
    * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
    */
  var sseS3: js.UndefOr[InventoryDestinationBucketEncryptionSseS3] = js.undefined
}
object InventoryDestinationBucketEncryption {
  
  inline def apply(): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
  
  extension [Self <: InventoryDestinationBucketEncryption](x: Self) {
    
    inline def setSseKms(value: InventoryDestinationBucketEncryptionSseKms): Self = StObject.set(x, "sseKms", value.asInstanceOf[js.Any])
    
    inline def setSseKmsUndefined: Self = StObject.set(x, "sseKms", js.undefined)
    
    inline def setSseS3(value: InventoryDestinationBucketEncryptionSseS3): Self = StObject.set(x, "sseS3", value.asInstanceOf[js.Any])
    
    inline def setSseS3Undefined: Self = StObject.set(x, "sseS3", js.undefined)
  }
}
