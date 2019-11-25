package typings.reactDashNativeDashFs

import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobId extends js.Object {
  var jobId: Double
  var promise: js.Promise[DownloadResult]
}

object Anon_JobId {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[DownloadResult]): Anon_JobId = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JobId]
  }
}

