package typings.reactNativeFs.anon

import typings.reactNativeFs.mod.UploadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  var jobId: Double
  var promise: js.Promise[UploadResult]
}

object Promise {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[UploadResult]): Promise = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
}

