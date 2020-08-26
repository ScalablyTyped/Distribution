package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucketEncryptionSseKms extends js.Object {
  /**
    * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
    */
  var keyId: String = js.native
}

object InventoryDestinationBucketEncryptionSseKms {
  @scala.inline
  def apply(keyId: String): InventoryDestinationBucketEncryptionSseKms = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucketEncryptionSseKms]
  }
  @scala.inline
  implicit class InventoryDestinationBucketEncryptionSseKmsOps[Self <: InventoryDestinationBucketEncryptionSseKms] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
  }
  
}

