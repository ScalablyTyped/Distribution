package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  /**
    * A token retrieved from the verification link contained in the abuse@ verification email.
    *
    */
  var abuse_at_token: js.UndefOr[String] = js.native
  /**
    * Request an email with a verification link to be sent to the sending domain’s abuse@ mailbox.
    *
    */
  var abuse_at_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of CNAME record
    */
  var cname_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of DKIM record
    *
    */
  var dkim_verify: js.UndefOr[Boolean] = js.native
  /**
    * A token retrieved from the verification link contained in the postmaster@ verification email.
    *
    */
  var postmaster_at_token: js.UndefOr[String] = js.native
  /**
    * Request an email with a verification link to be sent to the sending domain’s postmaster@ mailbox.
    *
    */
  var postmaster_at_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of SPF record
    *
    * @deprecated
    */
  var spf_verify: js.UndefOr[Boolean] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
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
    def setAbuse_at_token(value: String): Self = this.set("abuse_at_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbuse_at_token: Self = this.set("abuse_at_token", js.undefined)
    @scala.inline
    def setAbuse_at_verify(value: Boolean): Self = this.set("abuse_at_verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbuse_at_verify: Self = this.set("abuse_at_verify", js.undefined)
    @scala.inline
    def setCname_verify(value: Boolean): Self = this.set("cname_verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCname_verify: Self = this.set("cname_verify", js.undefined)
    @scala.inline
    def setDkim_verify(value: Boolean): Self = this.set("dkim_verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkim_verify: Self = this.set("dkim_verify", js.undefined)
    @scala.inline
    def setPostmaster_at_token(value: String): Self = this.set("postmaster_at_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostmaster_at_token: Self = this.set("postmaster_at_token", js.undefined)
    @scala.inline
    def setPostmaster_at_verify(value: Boolean): Self = this.set("postmaster_at_verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostmaster_at_verify: Self = this.set("postmaster_at_verify", js.undefined)
    @scala.inline
    def setSpf_verify(value: Boolean): Self = this.set("spf_verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpf_verify: Self = this.set("spf_verify", js.undefined)
  }
  
}

