package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucketEncryption extends js.Object {
  /**
    * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
    */
  var sseKms: js.UndefOr[InventoryDestinationBucketEncryptionSseKms] = js.native
  /**
    * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
    */
  var sseS3: js.UndefOr[InventoryDestinationBucketEncryptionSseS3] = js.native
}

object InventoryDestinationBucketEncryption {
  @scala.inline
  def apply(
    sseKms: InventoryDestinationBucketEncryptionSseKms = null,
    sseS3: InventoryDestinationBucketEncryptionSseS3 = null
  ): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    if (sseKms != null) __obj.updateDynamic("sseKms")(sseKms.asInstanceOf[js.Any])
    if (sseS3 != null) __obj.updateDynamic("sseS3")(sseS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
}

