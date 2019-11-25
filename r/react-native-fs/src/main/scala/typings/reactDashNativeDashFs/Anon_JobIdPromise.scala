package typings.reactDashNativeDashFs

import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.UploadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobIdPromise extends js.Object {
  var jobId: Double
  var promise: js.Promise[UploadResult]
}

object Anon_JobIdPromise {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[UploadResult]): Anon_JobIdPromise = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JobIdPromise]
  }
}

