package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  var lastUpdateTime: js.UndefOr[Input[String]] = js.native
  /**
    * human readable message with details about the request state
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * brief reason for the request state
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * request approval state, currently Approved or Denied.
    */
  var `type`: Input[String] = js.native
}

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(`type`: Input[String]): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal()
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdateTime(value: Input[String]): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

