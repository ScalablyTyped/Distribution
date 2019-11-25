package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmListenerConfiguration extends js.Object {
  var adminUser: User
  var filterRegex: String
  var serverUrl: String
  var sslConfiguration: js.UndefOr[SSLConfiguration] = js.undefined
}

object RealmListenerConfiguration {
  @scala.inline
  def apply(adminUser: User, filterRegex: String, serverUrl: String, sslConfiguration: SSLConfiguration = null): RealmListenerConfiguration = {
    val __obj = js.Dynamic.literal(adminUser = adminUser.asInstanceOf[js.Any], filterRegex = filterRegex.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any])
    if (sslConfiguration != null) __obj.updateDynamic("sslConfiguration")(sslConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmListenerConfiguration]
  }
}

