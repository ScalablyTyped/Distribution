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

