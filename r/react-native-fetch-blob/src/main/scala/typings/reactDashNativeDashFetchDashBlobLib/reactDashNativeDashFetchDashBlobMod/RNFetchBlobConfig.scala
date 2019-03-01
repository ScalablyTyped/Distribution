package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobConfig extends js.Object {
  /**
    * Fix IOS request timeout issue #368 by change default request setting to defaultSessionConfiguration, and make backgroundSessionConfigurationWithIdentifier optional
    */
  var IOSBackgroundTask: js.UndefOr[scala.Boolean] = js.undefined
  var addAndroidDownloads: js.UndefOr[AddAndroidDownloads] = js.undefined
  /**
    * Set this property to change temp file extension that created by fetch response data.
    */
  var appendExt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this property to true will makes response data of the fetch stored in a temp file, by default the temp
    * file will stored in App's own root folder with file name template RNFetchBlob_tmp${timestamp}.
    */
  var fileCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this property to true to display a network indicator on status bar, this feature is only supported on IOS.
    */
  var indicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When this property is true, the downloaded data will overwrite the existing file. (true by default)
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When this property has value, fetch API will try to store response data in the path ignoring fileCache and
    * appendExt property.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set timeout of the request (in milliseconds).
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this property to true will allow the request create connection with server have self-signed SSL
    * certification. This is not recommended to use in production.
    */
  var trusty: js.UndefOr[scala.Boolean] = js.undefined
}

object RNFetchBlobConfig {
  @scala.inline
  def apply(
    IOSBackgroundTask: js.UndefOr[scala.Boolean] = js.undefined,
    addAndroidDownloads: AddAndroidDownloads = null,
    appendExt: java.lang.String = null,
    fileCache: js.UndefOr[scala.Boolean] = js.undefined,
    indicator: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    session: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    trusty: js.UndefOr[scala.Boolean] = js.undefined
  ): RNFetchBlobConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IOSBackgroundTask)) __obj.updateDynamic("IOSBackgroundTask")(IOSBackgroundTask)
    if (addAndroidDownloads != null) __obj.updateDynamic("addAndroidDownloads")(addAndroidDownloads)
    if (appendExt != null) __obj.updateDynamic("appendExt")(appendExt)
    if (!js.isUndefined(fileCache)) __obj.updateDynamic("fileCache")(fileCache)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (path != null) __obj.updateDynamic("path")(path)
    if (session != null) __obj.updateDynamic("session")(session)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trusty)) __obj.updateDynamic("trusty")(trusty)
    __obj.asInstanceOf[RNFetchBlobConfig]
  }
}

