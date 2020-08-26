package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typings.realm.realmStrings.adminToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCredentials extends Credentials {
  @JSName("identityProvider")
  var identityProvider_AdminCredentials: adminToken = js.native
}

object AdminCredentials {
  @scala.inline
  def apply(identityProvider: adminToken, token: String, userInfo: StringDictionary[js.Any]): AdminCredentials = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCredentials]
  }
  @scala.inline
  implicit class AdminCredentialsOps[Self <: AdminCredentials] (val x: Self) extends AnyVal {
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
    def setIdentityProvider(value: adminToken): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
  }
  
}

