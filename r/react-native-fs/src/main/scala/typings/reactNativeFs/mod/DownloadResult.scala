package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadResult extends StObject {
  
  // The HTTP status code
  var bytesWritten: Double = js.native
  
  var jobId: Double = js.native
  
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var statusCode: Double = js.native
}
object DownloadResult {
  
  @scala.inline
  def apply(bytesWritten: Double, jobId: Double, statusCode: Double): DownloadResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadResult]
  }
  
  @scala.inline
  implicit class DownloadResultMutableBuilder[Self <: DownloadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
