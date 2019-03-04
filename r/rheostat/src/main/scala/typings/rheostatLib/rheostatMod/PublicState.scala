package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicState extends js.Object {
  var max: scala.Double
  var min: scala.Double
  var values: js.Array[scala.Double]
}

object PublicState {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, values: js.Array[scala.Double]): PublicState = {
    val __obj = js.Dynamic.literal(max = max, min = min, values = values)
  
    __obj.asInstanceOf[PublicState]
  }
}

