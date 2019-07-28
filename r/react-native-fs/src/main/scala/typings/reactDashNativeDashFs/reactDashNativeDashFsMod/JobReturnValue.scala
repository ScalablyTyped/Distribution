package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReturnValue[Result] extends js.Object {
  var jobId: Double
  var promise: js.Promise[Result]
}

object JobReturnValue {
  @scala.inline
  def apply[Result](jobId: Double, promise: js.Promise[Result]): JobReturnValue[Result] = {
    val __obj = js.Dynamic.literal(jobId = jobId, promise = promise)
  
    __obj.asInstanceOf[JobReturnValue[Result]]
  }
}

