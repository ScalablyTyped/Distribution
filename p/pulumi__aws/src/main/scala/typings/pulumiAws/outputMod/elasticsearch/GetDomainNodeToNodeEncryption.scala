package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainNodeToNodeEncryption extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
}

object GetDomainNodeToNodeEncryption {
  @scala.inline
  def apply(enabled: Boolean): GetDomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNodeToNodeEncryption]
  }
  @scala.inline
  implicit class GetDomainNodeToNodeEncryptionOps[Self <: GetDomainNodeToNodeEncryption] (val x: Self) extends AnyVal {
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
  }
  
}

