package typings.realm.Realm.Sync

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
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], provider_id = provider_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

