package typings.reactNativeFs.anon

import typings.reactNativeFs.mod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobId extends js.Object {
  
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
  implicit class JobIdOps[Self <: JobId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobId(value: Double): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromise(value: js.Promise[DownloadResult]): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
}
