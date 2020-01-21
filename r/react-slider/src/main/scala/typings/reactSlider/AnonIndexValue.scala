package typings.reactSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexValue extends js.Object {
  var index: Double
  var value: Double | js.Array[Double]
}

object AnonIndexValue {
  @scala.inline
  def apply(index: Double, value: Double | js.Array[Double]): AnonIndexValue = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndexValue]
  }
}

