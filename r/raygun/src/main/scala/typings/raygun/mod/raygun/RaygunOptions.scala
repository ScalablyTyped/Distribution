package typings.raygun.mod.raygun

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOptions extends js.Object {
  var apiKey: String
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  var groupingKey: js.UndefOr[String | GroupingKey] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var innerErrorFieldName: js.UndefOr[String] = js.undefined
  var isOffline: js.UndefOr[Boolean] = js.undefined
  var offlineStorage: js.UndefOr[RaygunOfflineStorageProvider[RaygunPayload, String]] = js.undefined
  var offlineStorageOptions: js.UndefOr[js.Any] = js.undefined
  var onBeforeSend: js.UndefOr[OnBeforeSend] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reportColumnNumbers: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var useSSL: js.UndefOr[Boolean] = js.undefined
  var userHumanStringForObject: js.UndefOr[Boolean] = js.undefined
}

object RaygunOptions {
  @scala.inline
  def apply(
    apiKey: String,
    filters: js.Array[String] = null,
    groupingKey: String | GroupingKey = null,
    host: String = null,
    innerErrorFieldName: String = null,
    isOffline: js.UndefOr[Boolean] = js.undefined,
    offlineStorage: RaygunOfflineStorageProvider[RaygunPayload, String] = null,
    offlineStorageOptions: js.Any = null,
    onBeforeSend: (/* payload */ RaygunPayload, /* exception */ Error, /* customData */ KeyValueObject, /* request */ RaygunRequest, /* tags */ js.Array[String]) => Boolean | RaygunPayload = null,
    port: Int | Double = null,
    reportColumnNumbers: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null,
    useSSL: js.UndefOr[Boolean] = js.undefined,
    userHumanStringForObject: js.UndefOr[Boolean] = js.undefined
  ): RaygunOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupingKey != null) __obj.updateDynamic("groupingKey")(groupingKey.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (innerErrorFieldName != null) __obj.updateDynamic("innerErrorFieldName")(innerErrorFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(isOffline)) __obj.updateDynamic("isOffline")(isOffline.asInstanceOf[js.Any])
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage.asInstanceOf[js.Any])
    if (offlineStorageOptions != null) __obj.updateDynamic("offlineStorageOptions")(offlineStorageOptions.asInstanceOf[js.Any])
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(js.Any.fromFunction5(onBeforeSend))
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reportColumnNumbers)) __obj.updateDynamic("reportColumnNumbers")(reportColumnNumbers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.asInstanceOf[js.Any])
    if (!js.isUndefined(userHumanStringForObject)) __obj.updateDynamic("userHumanStringForObject")(userHumanStringForObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunOptions]
  }
}

