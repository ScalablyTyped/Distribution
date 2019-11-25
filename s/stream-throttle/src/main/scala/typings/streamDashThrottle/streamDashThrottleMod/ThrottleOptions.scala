package typings.streamDashThrottle.streamDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  val chunksize: js.UndefOr[Double] = js.undefined
  val rate: Double
}

object ThrottleOptions {
  @scala.inline
  def apply(rate: Double, chunksize: Int | Double = null): ThrottleOptions = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    if (chunksize != null) __obj.updateDynamic("chunksize")(chunksize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

