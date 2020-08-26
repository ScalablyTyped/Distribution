package typings.pulumiAws.outputMod.s3

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
  def apply(): InventoryDestinationBucketEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDestinationBucketEncryption]
  }
  @scala.inline
  implicit class InventoryDestinationBucketEncryptionOps[Self <: InventoryDestinationBucketEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSseKms(value: InventoryDestinationBucketEncryptionSseKms): Self = this.set("sseKms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSseKms: Self = this.set("sseKms", js.undefined)
    @scala.inline
    def setSseS3(value: InventoryDestinationBucketEncryptionSseS3): Self = this.set("sseS3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSseS3: Self = this.set("sseS3", js.undefined)
  }
  
}

