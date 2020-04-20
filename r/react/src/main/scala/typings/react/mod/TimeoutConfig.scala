package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutConfig extends js.Object {
  /**
    * This timeout (in milliseconds) tells React how long to wait before showing the next state.
    *
    * React will always try to use a shorter lag when network and device allows it.
    *
    * **NOTE: We recommend that you share Suspense Config between different modules.**
    */
  var timeoutMs: Double
}

object TimeoutConfig {
  @scala.inline
  def apply(timeoutMs: Double): TimeoutConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutConfig]
  }
}

