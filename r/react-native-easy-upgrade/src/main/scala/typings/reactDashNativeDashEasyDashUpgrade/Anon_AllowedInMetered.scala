package typings.reactDashNativeDashEasyDashUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedInMetered extends js.Object {
  var allowedInMetered: js.UndefOr[Boolean] = js.undefined
  var allowedInRoaming: js.UndefOr[Boolean] = js.undefined
  var downloadDescription: js.UndefOr[String] = js.undefined
  var downloadTitle: js.UndefOr[String] = js.undefined
  var external: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var saveAsName: js.UndefOr[String] = js.undefined
  var showInDownloads: js.UndefOr[Boolean] = js.undefined
  var tempDownloadPath: String
}

object Anon_AllowedInMetered {
  @scala.inline
  def apply(
    tempDownloadPath: String,
    allowedInMetered: js.UndefOr[Boolean] = js.undefined,
    allowedInRoaming: js.UndefOr[Boolean] = js.undefined,
    downloadDescription: String = null,
    downloadTitle: String = null,
    external: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    saveAsName: String = null,
    showInDownloads: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowedInMetered = {
    val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath)
    if (!js.isUndefined(allowedInMetered)) __obj.updateDynamic("allowedInMetered")(allowedInMetered)
    if (!js.isUndefined(allowedInRoaming)) __obj.updateDynamic("allowedInRoaming")(allowedInRoaming)
    if (downloadDescription != null) __obj.updateDynamic("downloadDescription")(downloadDescription)
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (path != null) __obj.updateDynamic("path")(path)
    if (saveAsName != null) __obj.updateDynamic("saveAsName")(saveAsName)
    if (!js.isUndefined(showInDownloads)) __obj.updateDynamic("showInDownloads")(showInDownloads)
    __obj.asInstanceOf[Anon_AllowedInMetered]
  }
}

