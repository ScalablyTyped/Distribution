package typings
package streamDashThrottleLib.streamDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  val chunksize: js.UndefOr[scala.Double] = js.undefined
  val rate: scala.Double
}

object ThrottleOptions {
  @scala.inline
  def apply(rate: scala.Double, chunksize: scala.Int | scala.Double = null): ThrottleOptions = {
    val __obj = js.Dynamic.literal(rate = rate)
    if (chunksize != null) __obj.updateDynamic("chunksize")(chunksize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

