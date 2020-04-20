package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRate extends js.Object {
  var rate: Double
  var weight: Double
}

object AnonRate {
  @scala.inline
  def apply(rate: Double, weight: Double): AnonRate = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRate]
  }
}

