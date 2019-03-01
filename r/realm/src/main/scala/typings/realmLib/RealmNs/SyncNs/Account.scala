package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var provider: java.lang.String
  var provider_id: java.lang.String
  var user: UserInfo
}

object Account {
  @scala.inline
  def apply(provider: java.lang.String, provider_id: java.lang.String, user: UserInfo): Account = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("provider_id")(provider_id)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Account]
  }
}

