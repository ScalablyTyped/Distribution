package typings.reactDashSketchapp.typesMod

import typings.reactDashSketchapp.reactDashSketchappStrings.ltr
import typings.reactDashSketchapp.reactDashSketchappStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutInfo extends js.Object {
  var bottom: Double
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var height: Double
  var left: Double
  var right: Double
  var top: Double
  var width: Double
}

object LayoutInfo {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    direction: ltr | rtl = null
  ): LayoutInfo = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutInfo]
  }
}

