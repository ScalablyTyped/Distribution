package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

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

