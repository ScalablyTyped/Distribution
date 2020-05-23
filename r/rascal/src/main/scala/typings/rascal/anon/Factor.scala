package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factor extends js.Object {
  var factor: Double
  var max: Double
  var min: Double
  var strategy: String
}

object Factor {
  @scala.inline
  def apply(factor: Double, max: Double, min: Double, strategy: String): Factor = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factor]
  }
}

