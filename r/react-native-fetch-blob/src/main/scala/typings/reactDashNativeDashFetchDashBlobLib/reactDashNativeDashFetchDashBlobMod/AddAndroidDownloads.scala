package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAndroidDownloads extends js.Object {
  /**
    * File description of the file.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean value, see Officail Document
    * (https://developer.android.com/reference/android/app/DownloadManager.html#addCompletedDownload(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean))
    */
  var mediaScannable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * MIME type of the file. By default is text/plain
    */
  var mime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean value decide whether show a notification when download complete.
    */
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The destination which the file will be downloaded, it SHOULD be a location on external storage (DCIMDir).
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * title of the file
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * download file using Android download manager or not.
    */
  var useDownloadManager: js.UndefOr[scala.Boolean] = js.undefined
}

object AddAndroidDownloads {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    mediaScannable: js.UndefOr[scala.Boolean] = js.undefined,
    mime: java.lang.String = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    title: java.lang.String = null,
    useDownloadManager: js.UndefOr[scala.Boolean] = js.undefined
  ): AddAndroidDownloads = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(mediaScannable)) __obj.updateDynamic("mediaScannable")(mediaScannable)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (path != null) __obj.updateDynamic("path")(path)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useDownloadManager)) __obj.updateDynamic("useDownloadManager")(useDownloadManager)
    __obj.asInstanceOf[AddAndroidDownloads]
  }
}

