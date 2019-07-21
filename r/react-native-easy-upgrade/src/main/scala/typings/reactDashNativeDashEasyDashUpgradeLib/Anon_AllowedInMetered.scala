package typings
package reactDashNativeDashEasyDashUpgradeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedInMetered extends js.Object {
  var allowedInMetered: js.UndefOr[scala.Boolean] = js.undefined
  var allowedInRoaming: js.UndefOr[scala.Boolean] = js.undefined
  var downloadDescription: js.UndefOr[java.lang.String] = js.undefined
  var downloadTitle: js.UndefOr[java.lang.String] = js.undefined
  var external: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var saveAsName: js.UndefOr[java.lang.String] = js.undefined
  var showInDownloads: js.UndefOr[scala.Boolean] = js.undefined
  var tempDownloadPath: java.lang.String
}

object Anon_AllowedInMetered {
  @scala.inline
  def apply(
    tempDownloadPath: java.lang.String,
    allowedInMetered: js.UndefOr[scala.Boolean] = js.undefined,
    allowedInRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    downloadDescription: java.lang.String = null,
    downloadTitle: java.lang.String = null,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    saveAsName: java.lang.String = null,
    showInDownloads: js.UndefOr[scala.Boolean] = js.undefined
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

