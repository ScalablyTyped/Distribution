package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainEncryptionAtRest extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  /**
    * The KMS key id used to encrypt data at rest.
    */
  var kmsKeyId: String
}

object GetDomainEncryptionAtRest {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): GetDomainEncryptionAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled, kmsKeyId = kmsKeyId)
  
    __obj.asInstanceOf[GetDomainEncryptionAtRest]
  }
}

