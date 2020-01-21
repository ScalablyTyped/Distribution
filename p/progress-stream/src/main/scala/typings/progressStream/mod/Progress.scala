package typings.progressStream.mod

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
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Progress]
  }
}

