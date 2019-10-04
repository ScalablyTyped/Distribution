package typings.realm.RealmNs.SyncNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.undefined
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.undefined
  var clientResyncMode: js.UndefOr[ClientResyncMode] = js.undefined
  var customQueryBasedSyncIdentifier: js.UndefOr[String] = js.undefined
  var custom_http_headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var error: js.UndefOr[ErrorCallback] = js.undefined
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
  var fullSynchronization: js.UndefOr[Boolean] = js.undefined
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
  /** @deprecated use `ssl` instead */
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[SSLConfiguration] = js.undefined
  /** @deprecated use `ssl` instead */
  var ssl_trust_certificate_path: js.UndefOr[String] = js.undefined
  var url: String
  var user: User
  /** @deprecated use `ssl` instead */
  var validate_ssl: js.UndefOr[Boolean] = js.undefined
}

object SyncConfiguration {
  @scala.inline
  def apply(
    url: String,
    user: User,
    _disableQueryBasedSyncUrlChecks: js.UndefOr[Boolean] = js.undefined,
    _sessionStopPolicy: SessionStopPolicy = null,
    clientResyncMode: ClientResyncMode = null,
    customQueryBasedSyncIdentifier: String = null,
    custom_http_headers: StringDictionary[String] = null,
    error: ErrorCallback = null,
    existingRealmFileBehavior: OpenRealmBehaviorConfiguration = null,
    fullSynchronization: js.UndefOr[Boolean] = js.undefined,
    newRealmFileBehavior: OpenRealmBehaviorConfiguration = null,
    open_ssl_verify_callback: SSLVerifyCallback = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    ssl: SSLConfiguration = null,
    ssl_trust_certificate_path: String = null,
    validate_ssl: js.UndefOr[Boolean] = js.undefined
  ): SyncConfiguration = {
    val __obj = js.Dynamic.literal(url = url, user = user)
    if (!js.isUndefined(_disableQueryBasedSyncUrlChecks)) __obj.updateDynamic("_disableQueryBasedSyncUrlChecks")(_disableQueryBasedSyncUrlChecks)
    if (_sessionStopPolicy != null) __obj.updateDynamic("_sessionStopPolicy")(_sessionStopPolicy)
    if (clientResyncMode != null) __obj.updateDynamic("clientResyncMode")(clientResyncMode)
    if (customQueryBasedSyncIdentifier != null) __obj.updateDynamic("customQueryBasedSyncIdentifier")(customQueryBasedSyncIdentifier)
    if (custom_http_headers != null) __obj.updateDynamic("custom_http_headers")(custom_http_headers)
    if (error != null) __obj.updateDynamic("error")(error)
    if (existingRealmFileBehavior != null) __obj.updateDynamic("existingRealmFileBehavior")(existingRealmFileBehavior)
    if (!js.isUndefined(fullSynchronization)) __obj.updateDynamic("fullSynchronization")(fullSynchronization)
    if (newRealmFileBehavior != null) __obj.updateDynamic("newRealmFileBehavior")(newRealmFileBehavior)
    if (open_ssl_verify_callback != null) __obj.updateDynamic("open_ssl_verify_callback")(open_ssl_verify_callback)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (ssl_trust_certificate_path != null) __obj.updateDynamic("ssl_trust_certificate_path")(ssl_trust_certificate_path)
    if (!js.isUndefined(validate_ssl)) __obj.updateDynamic("validate_ssl")(validate_ssl)
    __obj.asInstanceOf[SyncConfiguration]
  }
}

