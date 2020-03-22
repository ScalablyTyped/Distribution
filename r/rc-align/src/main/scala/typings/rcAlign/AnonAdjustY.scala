package typings.rcAlign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjustY extends js.Object {
  var adjustX: Boolean | Double
  var adjustY: Boolean | Double
}

object AnonAdjustY {
  @scala.inline
  def apply(adjustX: Boolean | Double, adjustY: Boolean | Double): AnonAdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdjustY]
  }
}

