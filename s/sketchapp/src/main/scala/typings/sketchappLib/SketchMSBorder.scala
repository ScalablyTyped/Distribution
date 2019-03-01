package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSBorder extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.border
  var color: SketchMSColor
  var fillType: SketchMSFillTypeEnum
  var isEnabled: scala.Boolean
  var position: SketchMSBorderPositionEnum
  var thickness: scala.Double
}

object SketchMSBorder {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.border,
    color: SketchMSColor,
    fillType: SketchMSFillTypeEnum,
    isEnabled: scala.Boolean,
    position: SketchMSBorderPositionEnum,
    thickness: scala.Double
  ): SketchMSBorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("fillType")(fillType)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("thickness")(thickness)
    __obj.asInstanceOf[SketchMSBorder]
  }
}

