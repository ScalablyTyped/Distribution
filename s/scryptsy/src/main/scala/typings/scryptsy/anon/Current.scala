package typings.scryptsy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: Double
  var percent: Double
  var total: Double
}

object Current {
  @scala.inline
  def apply(current: Double, percent: Double, total: Double): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

