package typings.sketchapp

import typings.sketchapp.sketchappStrings.border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSBorder extends js.Object {
  var _class: border
  var color: SketchMSColor
  var fillType: SketchMSFillTypeEnum
  var isEnabled: Boolean
  var position: SketchMSBorderPositionEnum
  var thickness: Double
}

object SketchMSBorder {
  @scala.inline
  def apply(
    _class: border,
    color: SketchMSColor,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    position: SketchMSBorderPositionEnum,
    thickness: Double
  ): SketchMSBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorder]
  }
}

