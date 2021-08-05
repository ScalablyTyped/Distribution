package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobConfig extends StObject {
  
  /**
    * Fix IOS request timeout issue #368 by change default request setting to defaultSessionConfiguration, and make backgroundSessionConfigurationWithIdentifier optional
    */
  var IOSBackgroundTask: js.UndefOr[Boolean] = js.undefined
  
  var addAndroidDownloads: js.UndefOr[AddAndroidDownloads] = js.undefined
  
  /**
    * Set this property to change temp file extension that created by fetch response data.
    */
  var appendExt: js.UndefOr[String] = js.undefined
  
  /**
    * Set this property to true will makes response data of the fetch stored in a temp file, by default the temp
    * file will stored in App's own root folder with file name template RNFetchBlob_tmp${timestamp}.
    */
  var fileCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this property to true to display a network indicator on status bar, this feature is only supported on IOS.
    */
  var indicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this property is true, the downloaded data will overwrite the existing file. (true by default)
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this property has value, fetch API will try to store response data in the path ignoring fileCache and
    * appendExt property.
    */
  var path: js.UndefOr[String] = js.undefined
  
  var session: js.UndefOr[String] = js.undefined
  
  /**
    * Set timeout of the request (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this property to true will allow the request create connection with server have self-signed SSL
    * certification. This is not recommended to use in production.
    */
  var trusty: js.UndefOr[Boolean] = js.undefined
}
object RNFetchBlobConfig {
  
  inline def apply(): RNFetchBlobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RNFetchBlobConfig]
  }
  
  extension [Self <: RNFetchBlobConfig](x: Self) {
    
    inline def setAddAndroidDownloads(value: AddAndroidDownloads): Self = StObject.set(x, "addAndroidDownloads", value.asInstanceOf[js.Any])
    
    inline def setAddAndroidDownloadsUndefined: Self = StObject.set(x, "addAndroidDownloads", js.undefined)
    
    inline def setAppendExt(value: String): Self = StObject.set(x, "appendExt", value.asInstanceOf[js.Any])
    
    inline def setAppendExtUndefined: Self = StObject.set(x, "appendExt", js.undefined)
    
    inline def setFileCache(value: Boolean): Self = StObject.set(x, "fileCache", value.asInstanceOf[js.Any])
    
    inline def setFileCacheUndefined: Self = StObject.set(x, "fileCache", js.undefined)
    
    inline def setIOSBackgroundTask(value: Boolean): Self = StObject.set(x, "IOSBackgroundTask", value.asInstanceOf[js.Any])
    
    inline def setIOSBackgroundTaskUndefined: Self = StObject.set(x, "IOSBackgroundTask", js.undefined)
    
    inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrusty(value: Boolean): Self = StObject.set(x, "trusty", value.asInstanceOf[js.Any])
    
    inline def setTrustyUndefined: Self = StObject.set(x, "trusty", js.undefined)
  }
}
