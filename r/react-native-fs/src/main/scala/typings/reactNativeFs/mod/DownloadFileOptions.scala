package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileOptions extends StObject {
  
  // An object of headers to be passed to the server
  var background: js.UndefOr[Boolean] = js.native
  
  // supported on Android and iOS
  var backgroundTimeout: js.UndefOr[Double] = js.native
  
  var begin: js.UndefOr[js.Function1[/* res */ DownloadBeginCallbackResult, Unit]] = js.native
  
  // Allow the OS to control the timing and speed of the download to improve perceived performance  (iOS only)
  var cacheable: js.UndefOr[Boolean] = js.native
  
  // only supported on iOS yet
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  // Continue the download in the background after the app terminates (iOS only)
  var discretionary: js.UndefOr[Boolean] = js.native
  
  var fromUrl: String = js.native
  
  // Local filesystem path to save the file to
  var headers: js.UndefOr[Headers] = js.native
  
  var progress: js.UndefOr[js.Function1[/* res */ DownloadProgressCallbackResult, Unit]] = js.native
  
  var progressDivider: js.UndefOr[Double] = js.native
  
  // Whether the download can be stored in the shared NSURLCache (iOS only)
  var progressInterval: js.UndefOr[Double] = js.native
  
  // only supported on Android yet
  var readTimeout: js.UndefOr[Double] = js.native
  
  var resumable: js.UndefOr[js.Function0[Unit]] = js.native
  
  // URL to download file from
  var toFile: String = js.native
}
object DownloadFileOptions {
  
  @scala.inline
  def apply(fromUrl: String, toFile: String): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl.asInstanceOf[js.Any], toFile = toFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
  
  @scala.inline
  implicit class DownloadFileOptionsMutableBuilder[Self <: DownloadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundTimeout(value: Double): Self = StObject.set(x, "backgroundTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundTimeoutUndefined: Self = StObject.set(x, "backgroundTimeout", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBegin(value: /* res */ DownloadBeginCallbackResult => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    @scala.inline
    def setDiscretionary(value: Boolean): Self = StObject.set(x, "discretionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscretionaryUndefined: Self = StObject.set(x, "discretionary", js.undefined)
    
    @scala.inline
    def setFromUrl(value: String): Self = StObject.set(x, "fromUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setProgress(value: /* res */ DownloadProgressCallbackResult => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressDivider(value: Double): Self = StObject.set(x, "progressDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDividerUndefined: Self = StObject.set(x, "progressDivider", js.undefined)
    
    @scala.inline
    def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    @scala.inline
    def setResumable(value: () => Unit): Self = StObject.set(x, "resumable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    @scala.inline
    def setToFile(value: String): Self = StObject.set(x, "toFile", value.asInstanceOf[js.Any])
  }
}
