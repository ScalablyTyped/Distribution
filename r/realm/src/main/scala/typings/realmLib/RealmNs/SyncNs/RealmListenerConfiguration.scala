package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmListenerConfiguration extends js.Object {
  var adminUser: User
  var filterRegex: java.lang.String
  var serverUrl: java.lang.String
  var sslConfiguration: js.UndefOr[SSLConfiguration] = js.undefined
}

object RealmListenerConfiguration {
  @scala.inline
  def apply(
    adminUser: User,
    filterRegex: java.lang.String,
    serverUrl: java.lang.String,
    sslConfiguration: SSLConfiguration = null
  ): RealmListenerConfiguration = {
    val __obj = js.Dynamic.literal(adminUser = adminUser, filterRegex = filterRegex, serverUrl = serverUrl)
    if (sslConfiguration != null) __obj.updateDynamic("sslConfiguration")(sslConfiguration)
    __obj.asInstanceOf[RealmListenerConfiguration]
  }
}

