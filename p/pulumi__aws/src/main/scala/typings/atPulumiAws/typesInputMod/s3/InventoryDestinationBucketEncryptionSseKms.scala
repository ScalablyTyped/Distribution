package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestinationBucketEncryptionSseKms extends js.Object {
  /**
    * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
    */
  var keyId: Input[String]
}

object InventoryDestinationBucketEncryptionSseKms {
  @scala.inline
  def apply(keyId: Input[String]): InventoryDestinationBucketEncryptionSseKms = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventoryDestinationBucketEncryptionSseKms]
  }
}

