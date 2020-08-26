package typings.realm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  var provider: String = js.native
  var providerToken: String = js.native
  var userInfo: js.Any = js.native
}

object Provider {
  @scala.inline
  def apply(provider: String, providerToken: String, userInfo: js.Any): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
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
    def setProviderToken(value: String): Self = this.set("providerToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
  
}

