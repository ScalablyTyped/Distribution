package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadResult extends StObject {
  
  // The HTTP response headers from the server
  var body: String = js.native
  
  // The HTTP status code
  var headers: Headers = js.native
  
  var jobId: Double = js.native
  
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var statusCode: Double = js.native
}
object UploadResult {
  
  @scala.inline
  def apply(body: String, headers: Headers, jobId: Double, statusCode: Double): UploadResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResult]
  }
  
  @scala.inline
  implicit class UploadResultMutableBuilder[Self <: UploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
