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
  @scala.inline
  implicit class GetDomainEncryptionAtRestOps[Self <: GetDomainEncryptionAtRest] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
  }
  
}

