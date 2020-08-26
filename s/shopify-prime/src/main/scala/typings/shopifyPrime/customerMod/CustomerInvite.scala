package typings.shopifyPrime.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerInvite extends js.Object {
  var bcc: js.UndefOr[js.Array[String]] = js.native
  var custom_message: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
}

object CustomerInvite {
  @scala.inline
  def apply(): CustomerInvite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerInvite]
  }
  @scala.inline
  implicit class CustomerInviteOps[Self <: CustomerInvite] (val x: Self) extends AnyVal {
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
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCustom_message(value: String): Self = this.set("custom_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_message: Self = this.set("custom_message", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

