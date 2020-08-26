package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealmListenerConfiguration extends js.Object {
  var adminUser: User = js.native
  var filterRegex: String = js.native
  var serverUrl: String = js.native
  var sslConfiguration: js.UndefOr[SSLConfiguration] = js.native
}

object RealmListenerConfiguration {
  @scala.inline
  def apply(adminUser: User, filterRegex: String, serverUrl: String): RealmListenerConfiguration = {
    val __obj = js.Dynamic.literal(adminUser = adminUser.asInstanceOf[js.Any], filterRegex = filterRegex.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmListenerConfiguration]
  }
  @scala.inline
  implicit class RealmListenerConfigurationOps[Self <: RealmListenerConfiguration] (val x: Self) extends AnyVal {
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
    def setAdminUser(value: User): Self = this.set("adminUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterRegex(value: String): Self = this.set("filterRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSslConfiguration(value: SSLConfiguration): Self = this.set("sslConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslConfiguration: Self = this.set("sslConfiguration", js.undefined)
  }
  
}

