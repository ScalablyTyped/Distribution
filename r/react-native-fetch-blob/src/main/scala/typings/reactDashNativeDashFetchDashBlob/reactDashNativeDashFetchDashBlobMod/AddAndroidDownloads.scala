package typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAndroidDownloads extends js.Object {
  /**
    * File description of the file.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A boolean value, see Officail Document
    * (https://developer.android.com/reference/android/app/DownloadManager.html#addCompletedDownload(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean))
    */
  var mediaScannable: js.UndefOr[Boolean] = js.undefined
  /**
    * MIME type of the file. By default is text/plain
    */
  var mime: js.UndefOr[String] = js.undefined
  /**
    * A boolean value decide whether show a notification when download complete.
    */
  var notification: js.UndefOr[Boolean] = js.undefined
  /**
    * The destination which the file will be downloaded, it SHOULD be a location on external storage (DCIMDir).
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * title of the file
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * download file using Android download manager or not.
    */
  var useDownloadManager: js.UndefOr[Boolean] = js.undefined
}

object AddAndroidDownloads {
  @scala.inline
  def apply(
    description: String = null,
    mediaScannable: js.UndefOr[Boolean] = js.undefined,
    mime: String = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    title: String = null,
    useDownloadManager: js.UndefOr[Boolean] = js.undefined
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

