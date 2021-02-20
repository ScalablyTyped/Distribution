package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAndroidDownloads extends StObject {
  
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
  implicit class AddAndroidDownloadsMutableBuilder[Self <: AddAndroidDownloads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMediaScannable(value: Boolean): Self = StObject.set(x, "mediaScannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaScannableUndefined: Self = StObject.set(x, "mediaScannable", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUseDownloadManager(value: Boolean): Self = StObject.set(x, "useDownloadManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDownloadManagerUndefined: Self = StObject.set(x, "useDownloadManager", js.undefined)
  }
}
