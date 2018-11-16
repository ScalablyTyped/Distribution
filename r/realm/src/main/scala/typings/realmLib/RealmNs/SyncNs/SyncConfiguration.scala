package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SyncConfiguration extends js.Object {
  var _disableQueryBasedSyncUrlChecks: js.UndefOr[scala.Boolean] = js.undefined
  var custom_http_headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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

