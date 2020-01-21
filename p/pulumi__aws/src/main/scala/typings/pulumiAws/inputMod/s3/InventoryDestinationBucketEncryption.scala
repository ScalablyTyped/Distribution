package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucketEncryption extends js.Object {
  /**
    * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
    */
  var sseKms: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseKms]] = js.native
  /**
    * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
    */
  var sseS3: js.UndefOr[Input[InventoryDestinationBucketEncryptionSseS3]] = js.native
}

object InventoryDestinationBucketEncryption {
  @scala.inline
  def apply(
    sseKms: Input[InventoryDestinationBucketEncryptionSseKms] = null,
    sseS3: Input[InventoryDestinationBucketEncryptionSseS3] = null
  ): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    if (sseKms != null) __obj.updateDynamic("sseKms")(sseKms.asInstanceOf[js.Any])
    if (sseS3 != null) __obj.updateDynamic("sseS3")(sseS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
}

