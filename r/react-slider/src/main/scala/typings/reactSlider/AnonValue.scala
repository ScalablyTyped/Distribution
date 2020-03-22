package typings.reactSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var index: Double
  var value: Double | js.Array[Double]
}

object AnonValue {
  @scala.inline
  def apply(index: Double, value: Double | js.Array[Double]): AnonValue = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

