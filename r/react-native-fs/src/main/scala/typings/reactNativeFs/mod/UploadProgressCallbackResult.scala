package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadProgressCallbackResult extends StObject {
  
  var jobId: Double
  
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var totalBytesExpectedToSend: Double
  
  // The total number of bytes that will be sent to the server
  var totalBytesSent: Double
}
object UploadProgressCallbackResult {
  
  @scala.inline
  def apply(jobId: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressCallbackResult]
  }
  
  @scala.inline
  implicit class UploadProgressCallbackResultMutableBuilder[Self <: UploadProgressCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
  }
}
