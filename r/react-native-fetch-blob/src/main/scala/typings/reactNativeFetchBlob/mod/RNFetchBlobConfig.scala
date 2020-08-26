package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobConfig extends js.Object {
  /**
    * Fix IOS request timeout issue #368 by change default request setting to defaultSessionConfiguration, and make backgroundSessionConfigurationWithIdentifier optional
    */
  var IOSBackgroundTask: js.UndefOr[Boolean] = js.native
  var addAndroidDownloads: js.UndefOr[AddAndroidDownloads] = js.native
  /**
    * Set this property to change temp file extension that created by fetch response data.
    */
  var appendExt: js.UndefOr[String] = js.native
  /**
    * Set this property to true will makes response data of the fetch stored in a temp file, by default the temp
    * file will stored in App's own root folder with file name template RNFetchBlob_tmp${timestamp}.
    */
  var fileCache: js.UndefOr[Boolean] = js.native
  /**
    * Set this property to true to display a network indicator on status bar, this feature is only supported on IOS.
    */
  var indicator: js.UndefOr[Boolean] = js.native
  /**
    * When this property is true, the downloaded data will overwrite the existing file. (true by default)
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * When this property has value, fetch API will try to store response data in the path ignoring fileCache and
    * appendExt property.
    */
  var path: js.UndefOr[String] = js.native
  var session: js.UndefOr[String] = js.native
  /**
    * Set timeout of the request (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Set this property to true will allow the request create connection with server have self-signed SSL
    * certification. This is not recommended to use in production.
    */
  var trusty: js.UndefOr[Boolean] = js.native
}

object RNFetchBlobConfig {
  @scala.inline
  def apply(): RNFetchBlobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RNFetchBlobConfig]
  }
  @scala.inline
  implicit class RNFetchBlobConfigOps[Self <: RNFetchBlobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIOSBackgroundTask(value: Boolean): Self = this.set("IOSBackgroundTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSBackgroundTask: Self = this.set("IOSBackgroundTask", js.undefined)
    @scala.inline
    def setAddAndroidDownloads(value: AddAndroidDownloads): Self = this.set("addAndroidDownloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAndroidDownloads: Self = this.set("addAndroidDownloads", js.undefined)
    @scala.inline
    def setAppendExt(value: String): Self = this.set("appendExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendExt: Self = this.set("appendExt", js.undefined)
    @scala.inline
    def setFileCache(value: Boolean): Self = this.set("fileCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileCache: Self = this.set("fileCache", js.undefined)
    @scala.inline
    def setIndicator(value: Boolean): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTrusty(value: Boolean): Self = this.set("trusty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrusty: Self = this.set("trusty", js.undefined)
  }
  
}

