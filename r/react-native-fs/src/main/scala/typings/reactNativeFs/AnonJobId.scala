package typings.reactNativeFs

import typings.reactNativeFs.mod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJobId extends js.Object {
  var jobId: Double
  var promise: js.Promise[DownloadResult]
}

object AnonJobId {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[DownloadResult]): AnonJobId = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJobId]
  }
}

