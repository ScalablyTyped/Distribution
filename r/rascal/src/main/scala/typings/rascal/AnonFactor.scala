package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactor extends js.Object {
  var factor: Double
  var max: Double
  var min: Double
  var strategy: String
}

object AnonFactor {
  @scala.inline
  def apply(factor: Double, max: Double, min: Double, strategy: String): AnonFactor = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactor]
  }
}

