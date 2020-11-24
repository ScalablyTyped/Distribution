package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAndroidDownloads extends js.Object {
  
  /**
    * File description of the file.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A boolean value, see Officail Document
    * (https://developer.android.com/reference/android/app/DownloadManager.html#addCompletedDownload(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean))
    */
  var mediaScannable: js.UndefOr[Boolean] = js.native
  
  /**
    * MIME type of the file. By default is text/plain
    */
  var mime: js.UndefOr[String] = js.native
  
  /**
    * A boolean value decide whether show a notification when download complete.
    */
  var notification: js.UndefOr[Boolean] = js.native
  
  /**
    * The destination which the file will be downloaded, it SHOULD be a location on external storage (DCIMDir).
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * title of the file
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * download file using Android download manager or not.
    */
  var useDownloadManager: js.UndefOr[Boolean] = js.native
}
object AddAndroidDownloads {
  
  @scala.inline
  def apply(): AddAndroidDownloads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAndroidDownloads]
  }
  
  @scala.inline
  implicit class AddAndroidDownloadsOps[Self <: AddAndroidDownloads] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMediaScannable(value: Boolean): Self = this.set("mediaScannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaScannable: Self = this.set("mediaScannable", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setNotification(value: Boolean): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseDownloadManager(value: Boolean): Self = this.set("useDownloadManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDownloadManager: Self = this.set("useDownloadManager", js.undefined)
  }
}
