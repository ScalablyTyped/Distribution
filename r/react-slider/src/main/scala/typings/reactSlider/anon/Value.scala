package typings.reactSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var index: Double
  var value: Double | js.Array[Double]
}

object Value {
  @scala.inline
  def apply(index: Double, value: Double | js.Array[Double]): Value = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

