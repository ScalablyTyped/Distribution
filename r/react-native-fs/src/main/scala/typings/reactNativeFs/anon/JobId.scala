package typings.reactNativeFs.anon

import typings.reactNativeFs.mod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobId extends js.Object {
  var jobId: Double
  var promise: js.Promise[DownloadResult]
}

object JobId {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[DownloadResult]): JobId = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobId]
  }
}

