package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.native
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.native
  var clientResyncMode: js.UndefOr[ClientResyncMode] = js.native
  var customQueryBasedSyncIdentifier: js.UndefOr[String] = js.native
  var custom_http_headers: js.UndefOr[StringDictionary[String]] = js.native
  var error: js.UndefOr[ErrorCallback] = js.native
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  var fullSynchronization: js.UndefOr[Boolean] = js.native
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  /** @deprecated use `ssl` instead */
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.native
  var partial: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[SSLConfiguration] = js.native
  /** @deprecated use `ssl` instead */
  var ssl_trust_certificate_path: js.UndefOr[String] = js.native
  var url: String = js.native
  var user: User = js.native
  /** @deprecated use `ssl` instead */
  var validate_ssl: js.UndefOr[Boolean] = js.native
}

object SyncConfiguration {
  @scala.inline
  def apply(url: String, user: User): SyncConfiguration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncConfiguration]
  }
  @scala.inline
  implicit class SyncConfigurationOps[Self <: SyncConfiguration] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def set_disableQueryBasedSyncUrlChecks(value: Boolean): Self = this.set("_disableQueryBasedSyncUrlChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_disableQueryBasedSyncUrlChecks: Self = this.set("_disableQueryBasedSyncUrlChecks", js.undefined)
    @scala.inline
    def set_sessionStopPolicy(value: SessionStopPolicy): Self = this.set("_sessionStopPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sessionStopPolicy: Self = this.set("_sessionStopPolicy", js.undefined)
    @scala.inline
    def setClientResyncMode(value: ClientResyncMode): Self = this.set("clientResyncMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientResyncMode: Self = this.set("clientResyncMode", js.undefined)
    @scala.inline
    def setCustomQueryBasedSyncIdentifier(value: String): Self = this.set("customQueryBasedSyncIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomQueryBasedSyncIdentifier: Self = this.set("customQueryBasedSyncIdentifier", js.undefined)
    @scala.inline
    def setCustom_http_headers(value: StringDictionary[String]): Self = this.set("custom_http_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_http_headers: Self = this.set("custom_http_headers", js.undefined)
    @scala.inline
    def setError(value: (/* session */ Session, /* error */ SyncError) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExistingRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("existingRealmFileBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExistingRealmFileBehavior: Self = this.set("existingRealmFileBehavior", js.undefined)
    @scala.inline
    def setFullSynchronization(value: Boolean): Self = this.set("fullSynchronization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullSynchronization: Self = this.set("fullSynchronization", js.undefined)
    @scala.inline
    def setNewRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("newRealmFileBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewRealmFileBehavior: Self = this.set("newRealmFileBehavior", js.undefined)
    @scala.inline
    def setOpen_ssl_verify_callback(value: /* sslVerifyObject */ SSLVerifyObject => Boolean): Self = this.set("open_ssl_verify_callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen_ssl_verify_callback: Self = this.set("open_ssl_verify_callback", js.undefined)
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    @scala.inline
    def setSsl(value: SSLConfiguration): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setSsl_trust_certificate_path(value: String): Self = this.set("ssl_trust_certificate_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl_trust_certificate_path: Self = this.set("ssl_trust_certificate_path", js.undefined)
    @scala.inline
    def setValidate_ssl(value: Boolean): Self = this.set("validate_ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate_ssl: Self = this.set("validate_ssl", js.undefined)
  }
  
}

