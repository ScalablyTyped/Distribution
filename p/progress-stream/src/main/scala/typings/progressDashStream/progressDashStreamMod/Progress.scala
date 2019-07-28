package typings.progressDashStream.progressDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var delta: Double
  var eta: Double
  var length: Double
  var percentage: Double
  var remaining: Double
  var runtime: Double
  var speed: Double
  var transferred: Double
}

object Progress {
  @scala.inline
  def apply(
    delta: Double,
    eta: Double,
    length: Double,
    percentage: Double,
    remaining: Double,
    runtime: Double,
    speed: Double,
    transferred: Double
  ): Progress = {
    val __obj = js.Dynamic.literal(delta = delta, eta = eta, length = length, percentage = percentage, remaining = remaining, runtime = runtime, speed = speed, transferred = transferred)
  
    __obj.asInstanceOf[Progress]
  }
}

