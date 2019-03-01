package typings
package reactDashSortableDashHocLib.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Dimensions {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Dimensions]
  }
}

