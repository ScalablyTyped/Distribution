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
  
  inline def apply(contentLength: Double, headers: Headers, jobId: Double, statusCode: Double): DownloadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadBeginCallbackResult]
  }
  
  extension [Self <: DownloadBeginCallbackResult](x: Self) {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
