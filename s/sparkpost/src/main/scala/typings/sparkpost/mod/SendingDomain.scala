package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendingDomain extends js.Object {
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.native
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.native
  /** Name of the sending domain. */
  var domain: String = js.native
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.native
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: Boolean = js.native
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: Status = js.native
  /** Associated tracking domain. */
  var tracking_domain: String = js.native
}

object SendingDomain {
  @scala.inline
  def apply(domain: String, shared_with_subaccounts: Boolean, status: Status, tracking_domain: String): SendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], shared_with_subaccounts = shared_with_subaccounts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_domain = tracking_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingDomain]
  }
  @scala.inline
  implicit class SendingDomainOps[Self <: SendingDomain] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared_with_subaccounts(value: Boolean): Self = this.set("shared_with_subaccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracking_domain(value: String): Self = this.set("tracking_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDkim(value: DKIM): Self = this.set("dkim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkim: Self = this.set("dkim", js.undefined)
    @scala.inline
    def setDkim_key_length(value: Double): Self = this.set("dkim_key_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkim_key_length: Self = this.set("dkim_key_length", js.undefined)
    @scala.inline
    def setGenerate_dkim(value: Boolean): Self = this.set("generate_dkim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerate_dkim: Self = this.set("generate_dkim", js.undefined)
  }
  
}

