package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailListUpdateOptions extends js.Object {
  var address: String = js.native
  var api_key: String = js.native
  var api_user: String = js.native
  var description: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var toAddress: js.UndefOr[String] = js.native
}

object EmailListUpdateOptions {
  @scala.inline
  def apply(address: String, api_key: String, api_user: String): EmailListUpdateOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateOptions]
  }
  @scala.inline
  implicit class EmailListUpdateOptionsOps[Self <: EmailListUpdateOptions] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_user(value: String): Self = this.set("api_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setToAddress(value: String): Self = this.set("toAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToAddress: Self = this.set("toAddress", js.undefined)
  }
  
}

