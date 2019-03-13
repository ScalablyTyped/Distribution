package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[scala.Boolean] = js.undefined
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.undefined
  var customQueryBasedSyncIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var custom_http_headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var error: js.UndefOr[ErrorCallback] = js.undefined
  var fullSynchronization: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated use `ssl` instead */
  var open_ssl_verify_callback: js.UndefOr[SSLVerifyCallback] = js.undefined
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[SSLConfiguration] = js.undefined
  /** @deprecated use `ssl` instead */
  var ssl_trust_certificate_path: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var user: User
  /** @deprecated use `ssl` instead */
  var validate_ssl: js.UndefOr[scala.Boolean] = js.undefined
}

object SyncConfiguration {
  @scala.inline
  def apply(
    url: java.lang.String,
    user: User,
    _disableQueryBasedSyncUrlChecks: js.UndefOr[scala.Boolean] = js.undefined,
    _sessionStopPolicy: SessionStopPolicy = null,
    customQueryBasedSyncIdentifier: java.lang.String = null,
    custom_http_headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    error: ErrorCallback = null,
    fullSynchronization: js.UndefOr[scala.Boolean] = js.undefined,
    open_ssl_verify_callback: SSLVerifyCallback = null,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: SSLConfiguration = null,
    ssl_trust_certificate_path: java.lang.String = null,
    validate_ssl: js.UndefOr[scala.Boolean] = js.undefined
  ): SyncConfiguration = {
    val __obj = js.Dynamic.literal(url = url, user = user)
    if (!js.isUndefined(_disableQueryBasedSyncUrlChecks)) __obj.updateDynamic("_disableQueryBasedSyncUrlChecks")(_disableQueryBasedSyncUrlChecks)
    if (_sessionStopPolicy != null) __obj.updateDynamic("_sessionStopPolicy")(_sessionStopPolicy)
    if (customQueryBasedSyncIdentifier != null) __obj.updateDynamic("customQueryBasedSyncIdentifier")(customQueryBasedSyncIdentifier)
    if (custom_http_headers != null) __obj.updateDynamic("custom_http_headers")(custom_http_headers)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullSynchronization)) __obj.updateDynamic("fullSynchronization")(fullSynchronization)
    if (open_ssl_verify_callback != null) __obj.updateDynamic("open_ssl_verify_callback")(open_ssl_verify_callback)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (ssl_trust_certificate_path != null) __obj.updateDynamic("ssl_trust_certificate_path")(ssl_trust_certificate_path)
    if (!js.isUndefined(validate_ssl)) __obj.updateDynamic("validate_ssl")(validate_ssl)
    __obj.asInstanceOf[SyncConfiguration]
  }
}

