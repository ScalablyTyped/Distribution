package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReturnValue[Result] extends js.Object {
  var jobId: scala.Double
  var promise: js.Promise[Result]
}

object JobReturnValue {
  @scala.inline
  def apply[Result](jobId: scala.Double, promise: js.Promise[Result]): JobReturnValue[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[JobReturnValue[Result]]
  }
}

