package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rate extends js.Object {
  var rate: Double
  var weight: Double
}

object Rate {
  @scala.inline
  def apply(rate: Double, weight: Double): Rate = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rate]
  }
}

