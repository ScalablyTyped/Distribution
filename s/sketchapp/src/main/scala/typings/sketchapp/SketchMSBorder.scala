package typings.sketchapp

import typings.sketchapp.sketchappStrings.border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSBorder extends js.Object {
  var _class: border = js.native
  var color: SketchMSColor = js.native
  var fillType: SketchMSFillTypeEnum = js.native
  var isEnabled: Boolean = js.native
  var position: SketchMSBorderPositionEnum = js.native
  var thickness: Double = js.native
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
  @scala.inline
  implicit class SketchMSBorderOps[Self <: SketchMSBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_class(value: border): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: SketchMSColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillType(value: SketchMSFillTypeEnum): Self = this.set("fillType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: SketchMSBorderPositionEnum): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
  }
  
}

