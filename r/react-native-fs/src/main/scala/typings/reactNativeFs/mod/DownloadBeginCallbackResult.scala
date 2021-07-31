package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadBeginCallbackResult extends StObject {
  
  // The HTTP status code
  var contentLength: Double
  
  // The total size in bytes of the download resource
  var headers: Headers
  
  var jobId: Double
  
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var statusCode: Double
}
object DownloadBeginCallbackResult {
  
  @scala.inline
  def apply(contentLength: Double, headers: Headers, jobId: Double, statusCode: Double): DownloadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadBeginCallbackResult]
  }
  
  @scala.inline
  implicit class DownloadBeginCallbackResultMutableBuilder[Self <: DownloadBeginCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
