package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var persistence: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    cacheSizeBytes: js.UndefOr[Double] = js.undefined,
    host: String = null,
    persistence: js.UndefOr[Boolean] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheSizeBytes)) __obj.updateDynamic("cacheSizeBytes")(cacheSizeBytes.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(persistence)) __obj.updateDynamic("persistence")(persistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampsInSnapshots)) __obj.updateDynamic("timestampsInSnapshots")(timestampsInSnapshots.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

