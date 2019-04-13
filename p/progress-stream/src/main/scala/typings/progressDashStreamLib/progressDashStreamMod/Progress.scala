package typings
package progressDashStreamLib.progressDashStreamMod

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
    val __obj = js.Dynamic.literal(delta = delta, eta = eta, length = length, percentage = percentage, remaining = remaining, runtime = runtime, speed = speed, transferred = transferred)
  
    __obj.asInstanceOf[Progress]
  }
}

