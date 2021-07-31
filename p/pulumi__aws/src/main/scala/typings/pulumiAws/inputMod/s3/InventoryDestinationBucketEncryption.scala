package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestinationBucketEncryption extends StObject {
  
  /**
    * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
    */
  var sseKms: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseKms]] = js.undefined
  
  /**
    * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
    */
  var sseS3: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseS3]] = js.undefined
}
object InventoryDestinationBucketEncryption {
  
  @scala.inline
  def apply(): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
  
  @scala.inline
  implicit class InventoryDestinationBucketEncryptionMutableBuilder[Self <: InventoryDestinationBucketEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSseKms(value: Input[InventoryDestinationBucketEncryptionSseKms]): Self = StObject.set(x, "sseKms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseKmsUndefined: Self = StObject.set(x, "sseKms", js.undefined)
    
    @scala.inline
    def setSseS3(value: Input[InventoryDestinationBucketEncryptionSseS3]): Self = StObject.set(x, "sseS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseS3Undefined: Self = StObject.set(x, "sseS3", js.undefined)
  }
}
