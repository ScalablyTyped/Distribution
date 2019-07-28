package typings.rheostat.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicState extends js.Object {
  var max: Double
  var min: Double
  var values: js.Array[Double]
}

object PublicState {
  @scala.inline
  def apply(max: Double, min: Double, values: js.Array[Double]): PublicState = {
    val __obj = js.Dynamic.literal(max = max, min = min, values = values)
  
    __obj.asInstanceOf[PublicState]
  }
}

