package typings
package progressDashStreamLib.progressDashStreamMod.progressUnderscoreStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var delta: scala.Double
  var eta: scala.Double
  var length: scala.Double
  var percentage: scala.Double
  var remaining: scala.Double
  var runtime: scala.Double
  var speed: scala.Double
  var transferred: scala.Double
}

object Progress {
  @scala.inline
  def apply(
    delta: scala.Double,
    eta: scala.Double,
    length: scala.Double,
    percentage: scala.Double,
    remaining: scala.Double,
    runtime: scala.Double,
    speed: scala.Double,
    transferred: scala.Double
  ): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delta")(delta)
    __obj.updateDynamic("eta")(eta)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("percentage")(percentage)
    __obj.updateDynamic("remaining")(remaining)
    __obj.updateDynamic("runtime")(runtime)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("transferred")(transferred)
    __obj.asInstanceOf[Progress]
  }
}

