package typings
package reactDashMeasureLib.reactDashMeasureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomRight extends js.Object {
  val bottom: scala.Double
  val right: scala.Double
}

object BottomRight {
  @scala.inline
  def apply(bottom: scala.Double, right: scala.Double): BottomRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[BottomRight]
  }
}

