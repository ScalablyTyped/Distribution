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
}

