package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadProgressCallbackResult extends StObject {
  
  // The total size in bytes of the download resource
  var bytesWritten: Double
  
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var contentLength: Double
  
  var jobId: Double
}
object DownloadProgressCallbackResult {
  
  inline def apply(bytesWritten: Double, contentLength: Double, jobId: Double): DownloadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressCallbackResult]
  }
  
  extension [Self <: DownloadProgressCallbackResult](x: Self) {
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
