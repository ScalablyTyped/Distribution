package typings.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInfo extends js.Object {
  var x: Double
  var y: Double
}

object PositionInfo {
  @scala.inline
  def apply(x: Double, y: Double): PositionInfo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionInfo]
  }
}

