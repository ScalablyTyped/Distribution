package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typings.realm.realmStrings.adminToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminCredentials extends Credentials {
  @JSName("identityProvider")
  var identityProvider_AdminCredentials: adminToken
}

object AdminCredentials {
  @scala.inline
  def apply(identityProvider: adminToken, token: String, userInfo: StringDictionary[js.Any]): AdminCredentials = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCredentials]
  }
}

