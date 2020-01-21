package typings.reactNativeEasyUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedInMetered extends js.Object {
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

object AnonAllowedInMetered {
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
  ): AnonAllowedInMetered = {
    val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath.asInstanceOf[js.Any])
    if (!js.isUndefined(allowedInMetered)) __obj.updateDynamic("allowedInMetered")(allowedInMetered.asInstanceOf[js.Any])
    if (!js.isUndefined(allowedInRoaming)) __obj.updateDynamic("allowedInRoaming")(allowedInRoaming.asInstanceOf[js.Any])
    if (downloadDescription != null) __obj.updateDynamic("downloadDescription")(downloadDescription.asInstanceOf[js.Any])
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (saveAsName != null) __obj.updateDynamic("saveAsName")(saveAsName.asInstanceOf[js.Any])
    if (!js.isUndefined(showInDownloads)) __obj.updateDynamic("showInDownloads")(showInDownloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedInMetered]
  }
}

