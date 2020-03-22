package typings.realm

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Realm.Sync.ClientResyncMode
import typings.realm.Realm.Sync.ErrorCallback
import typings.realm.Realm.Sync.OpenRealmBehaviorConfiguration
import typings.realm.Realm.Sync.SSLConfiguration
import typings.realm.Realm.Sync.SSLVerifyCallback
import typings.realm.Realm.Sync.SSLVerifyObject
import typings.realm.Realm.Sync.Session
import typings.realm.Realm.Sync.SessionStopPolicy
import typings.realm.Realm.Sync.SyncError
import typings.realm.Realm.Sync.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<realm.Realm.Sync.SyncConfiguration> */
trait PartialSyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.undefined
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.undefined
  var clientResyncMode: js.UndefOr[ClientResyncMode] = js.undefined
  var customQueryBasedSyncIdentifier: js.UndefOr[String] = js.undefined
  var custom_http_headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var error: js.UndefOr[ErrorCallback] = js.undefined
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
  var fullSynchronization: js.UndefOr[Boolean] = js.undefined
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[SSLConfiguration] = js.undefined
  var ssl_trust_certificate_path: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var validate_ssl: js.UndefOr[Boolean] = js.undefined
}

object PartialSyncConfiguration {
  @scala.inline
  def apply(
    _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.undefined,
    _sessionStopPolicy: SessionStopPolicy = null,
    clientResyncMode: ClientResyncMode = null,
    customQueryBasedSyncIdentifier: String = null,
    custom_http_headers: StringDictionary[String] = null,
    error: (/* session */ Session, /* error */ SyncError) => Unit = null,
    existingRealmFileBehavior: OpenRealmBehaviorConfiguration = null,
    fullSynchronization: js.UndefOr[Boolean] = js.undefined,
    newRealmFileBehavior: OpenRealmBehaviorConfiguration = null,
    open_ssl_verify_callback: /* sslVerifyObject */ SSLVerifyObject => Boolean = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    ssl: SSLConfiguration = null,
    ssl_trust_certificate_path: String = null,
    url: String = null,
    user: User = null,
    validate_ssl: js.UndefOr[Boolean] = js.undefined
  ): PartialSyncConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_disableQueryBasedSyncUrlChecks)) __obj.updateDynamic("_disableQueryBasedSyncUrlChecks")(_disableQueryBasedSyncUrlChecks.asInstanceOf[js.Any])
    if (_sessionStopPolicy != null) __obj.updateDynamic("_sessionStopPolicy")(_sessionStopPolicy.asInstanceOf[js.Any])
    if (clientResyncMode != null) __obj.updateDynamic("clientResyncMode")(clientResyncMode.asInstanceOf[js.Any])
    if (customQueryBasedSyncIdentifier != null) __obj.updateDynamic("customQueryBasedSyncIdentifier")(customQueryBasedSyncIdentifier.asInstanceOf[js.Any])
    if (custom_http_headers != null) __obj.updateDynamic("custom_http_headers")(custom_http_headers.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (existingRealmFileBehavior != null) __obj.updateDynamic("existingRealmFileBehavior")(existingRealmFileBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(fullSynchronization)) __obj.updateDynamic("fullSynchronization")(fullSynchronization.asInstanceOf[js.Any])
    if (newRealmFileBehavior != null) __obj.updateDynamic("newRealmFileBehavior")(newRealmFileBehavior.asInstanceOf[js.Any])
    if (open_ssl_verify_callback != null) __obj.updateDynamic("open_ssl_verify_callback")(js.Any.fromFunction1(open_ssl_verify_callback))
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (ssl_trust_certificate_path != null) __obj.updateDynamic("ssl_trust_certificate_path")(ssl_trust_certificate_path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(validate_ssl)) __obj.updateDynamic("validate_ssl")(validate_ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSyncConfiguration]
  }
}

