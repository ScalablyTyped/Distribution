package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadBeginCallbackResult extends StObject {
  
  var jobId: Double
}
object UploadBeginCallbackResult {
  
  inline def apply(jobId: Double): UploadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBeginCallbackResult]
  }
  
  extension [Self <: UploadBeginCallbackResult](x: Self) {
    
    inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
