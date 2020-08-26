package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var provider: String = js.native
  var provider_id: String = js.native
  var user: UserInfo = js.native
}

object Account {
  @scala.inline
  def apply(provider: String, provider_id: String, user: UserInfo): Account = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], provider_id = provider_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider_id(value: String): Self = this.set("provider_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

