package typings.reactNativeFs

import typings.reactNativeFs.mod.DownloadResult
import typings.reactNativeFs.mod.UploadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait JobId extends StObject {
    
    var jobId: Double
    
    var promise: js.Promise[DownloadResult]
  }
  object JobId {
    
    inline def apply(jobId: Double, promise: js.Promise[DownloadResult]): JobId = {
      val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobId]
    }
    
    extension [Self <: JobId](x: Self) {
      
      inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[DownloadResult]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Promise extends StObject {
    
    var jobId: Double
    
    var promise: js.Promise[UploadResult]
  }
  object Promise {
    
    inline def apply(jobId: Double, promise: js.Promise[UploadResult]): Promise = {
      val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    extension [Self <: Promise](x: Self) {
      
      inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[UploadResult]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
