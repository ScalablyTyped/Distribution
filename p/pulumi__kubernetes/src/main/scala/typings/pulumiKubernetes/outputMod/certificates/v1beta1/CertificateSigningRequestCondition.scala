package typings.pulumiKubernetes.outputMod.certificates.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  var lastUpdateTime: String = js.native
  /**
    * human readable message with details about the request state
    */
  var message: String = js.native
  /**
    * brief reason for the request state
    */
  var reason: String = js.native
  /**
    * request approval state, currently Approved or Denied.
    */
  var `type`: String = js.native
}

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(lastUpdateTime: String, message: String, reason: String, `type`: String): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal(lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
  @scala.inline
  implicit class CertificateSigningRequestConditionOps[Self <: CertificateSigningRequestCondition] (val x: Self) extends AnyVal {
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
    def setLastUpdateTime(value: String): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

