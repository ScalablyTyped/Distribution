package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBeginCallbackResult extends StObject {
  
  var jobId: Double = js.native
}
object UploadBeginCallbackResult {
  
  @scala.inline
  def apply(jobId: Double): UploadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBeginCallbackResult]
  }
  
  @scala.inline
  implicit class UploadBeginCallbackResultMutableBuilder[Self <: UploadBeginCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
