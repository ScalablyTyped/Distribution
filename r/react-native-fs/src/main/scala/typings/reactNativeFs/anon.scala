package typings.reactNativeFs

import typings.reactNativeFs.mod.DownloadResult
import typings.reactNativeFs.mod.UploadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait JobId extends StObject {
    
    var jobId: Double = js.native
    
    var promise: js.Promise[DownloadResult] = js.native
  }
  object JobId {
    
    @scala.inline
    def apply(jobId: Double, promise: js.Promise[DownloadResult]): JobId = {
      val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobId]
    }
    
    @scala.inline
    implicit class JobIdMutableBuilder[Self <: JobId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: js.Promise[DownloadResult]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Promise extends StObject {
    
    var jobId: Double = js.native
    
    var promise: js.Promise[UploadResult] = js.native
  }
  object Promise {
    
    @scala.inline
    def apply(jobId: Double, promise: js.Promise[UploadResult]): Promise = {
      val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    @scala.inline
    implicit class PromiseMutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: js.Promise[UploadResult]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
