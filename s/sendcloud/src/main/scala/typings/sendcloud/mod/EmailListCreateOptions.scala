package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailListCreateOptions extends js.Object {
  var address: js.UndefOr[String] = js.native
  var api_key: String = js.native
  var api_user: String = js.native
  var limit: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
}

object EmailListCreateOptions {
  @scala.inline
  def apply(api_key: String, api_user: String): EmailListCreateOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListCreateOptions]
  }
  @scala.inline
  implicit class EmailListCreateOptionsOps[Self <: EmailListCreateOptions] (val x: Self) extends AnyVal {
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_user(value: String): Self = this.set("api_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

