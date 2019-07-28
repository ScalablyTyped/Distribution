package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var provider: String
  var provider_id: String
  var user: UserInfo
}

object Account {
  @scala.inline
  def apply(provider: String, provider_id: String, user: UserInfo): Account = {
    val __obj = js.Dynamic.literal(provider = provider, provider_id = provider_id, user = user)
  
    __obj.asInstanceOf[Account]
  }
}

