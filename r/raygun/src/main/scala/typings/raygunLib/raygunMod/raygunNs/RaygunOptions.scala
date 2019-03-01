package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOptions extends js.Object {
  var apiKey: java.lang.String
  var filters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var groupingKey: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var innerErrorFieldName: js.UndefOr[java.lang.String] = js.undefined
  var isOffline: js.UndefOr[scala.Boolean] = js.undefined
  var offlineStorage: js.UndefOr[RaygunOfflineStorageProvider[RaygunPayload, java.lang.String]] = js.undefined
  var offlineStorageOptions: js.UndefOr[js.Any] = js.undefined
  var onBeforeSend: js.UndefOr[OnBeforeSend] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var reportColumnNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var useSSL: js.UndefOr[scala.Boolean] = js.undefined
  var userHumanStringForObject: js.UndefOr[scala.Boolean] = js.undefined
}

object RaygunOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    filters: js.Array[java.lang.String] = null,
    groupingKey: java.lang.String = null,
    host: java.lang.String = null,
    innerErrorFieldName: java.lang.String = null,
    isOffline: js.UndefOr[scala.Boolean] = js.undefined,
    offlineStorage: RaygunOfflineStorageProvider[RaygunPayload, java.lang.String] = null,
    offlineStorageOptions: js.Any = null,
    onBeforeSend: OnBeforeSend = null,
    port: scala.Int | scala.Double = null,
    reportColumnNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.Array[java.lang.String] = null,
    useSSL: js.UndefOr[scala.Boolean] = js.undefined,
    userHumanStringForObject: js.UndefOr[scala.Boolean] = js.undefined
  ): RaygunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiKey")(apiKey)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (groupingKey != null) __obj.updateDynamic("groupingKey")(groupingKey)
    if (host != null) __obj.updateDynamic("host")(host)
    if (innerErrorFieldName != null) __obj.updateDynamic("innerErrorFieldName")(innerErrorFieldName)
    if (!js.isUndefined(isOffline)) __obj.updateDynamic("isOffline")(isOffline)
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage)
    if (offlineStorageOptions != null) __obj.updateDynamic("offlineStorageOptions")(offlineStorageOptions)
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(onBeforeSend)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reportColumnNumbers)) __obj.updateDynamic("reportColumnNumbers")(reportColumnNumbers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    if (!js.isUndefined(userHumanStringForObject)) __obj.updateDynamic("userHumanStringForObject")(userHumanStringForObject)
    __obj.asInstanceOf[RaygunOptions]
  }
}

