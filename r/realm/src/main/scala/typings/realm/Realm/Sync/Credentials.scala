package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  val identityProvider: String = js.native
  val token: String = js.native
  val userInfo: StringDictionary[js.Any] = js.native
}

object Credentials {
  @scala.inline
  def apply(identityProvider: String, token: String, userInfo: StringDictionary[js.Any]): Credentials = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def setIdentityProvider(value: String): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: StringDictionary[js.Any]): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
  
}

