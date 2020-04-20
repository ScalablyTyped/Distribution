package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainEncryptionAtRest extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  /**
    * The KMS key id used to encrypt data at rest.
    */
  var kmsKeyId: String = js.native
}

object GetDomainEncryptionAtRest {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): GetDomainEncryptionAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainEncryptionAtRest]
  }
}

