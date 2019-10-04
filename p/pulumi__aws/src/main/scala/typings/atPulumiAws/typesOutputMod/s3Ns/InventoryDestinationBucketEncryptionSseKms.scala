package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestinationBucketEncryptionSseKms extends js.Object {
  /**
    * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
    */
  var keyId: String
}

object InventoryDestinationBucketEncryptionSseKms {
  @scala.inline
  def apply(keyId: String): InventoryDestinationBucketEncryptionSseKms = {
    val __obj = js.Dynamic.literal(keyId = keyId)
  
    __obj.asInstanceOf[InventoryDestinationBucketEncryptionSseKms]
  }
}

