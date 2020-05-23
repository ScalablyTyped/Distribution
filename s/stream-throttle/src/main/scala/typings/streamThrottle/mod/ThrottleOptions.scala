package typings.streamThrottle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  val chunksize: js.UndefOr[Double] = js.undefined
  val rate: Double
}

object ThrottleOptions {
  @scala.inline
  def apply(rate: Double, chunksize: js.UndefOr[Double] = js.undefined): ThrottleOptions = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    if (!js.isUndefined(chunksize)) __obj.updateDynamic("chunksize")(chunksize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

