package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadProgressCallbackResult extends StObject {
  
  // The total size in bytes of the download resource
  var bytesWritten: Double = js.native
  
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var contentLength: Double = js.native
  
  var jobId: Double = js.native
}
object DownloadProgressCallbackResult {
  
  @scala.inline
  def apply(bytesWritten: Double, contentLength: Double, jobId: Double): DownloadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressCallbackResult]
  }
  
  @scala.inline
  implicit class DownloadProgressCallbackResultMutableBuilder[Self <: DownloadProgressCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
