package typings.reactNativeFs

import typings.reactNativeFs.mod.UploadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  var jobId: Double
  var promise: js.Promise[UploadResult]
}

object AnonPromise {
  @scala.inline
  def apply(jobId: Double, promise: js.Promise[UploadResult]): AnonPromise = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromise]
  }
}

