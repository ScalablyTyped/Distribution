package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleBorder extends js.Object {
  var _class: styleBorder = js.native
  var color: SketchMSColor = js.native
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  var fillType: Double = js.native
  var gradient: SketchMSGradient = js.native
  var isEnabled: Double = js.native
  var position: Double = js.native
  var thickness: Double = js.native
}

object SketchMSStyleBorder {
  @scala.inline
  def apply(
    _class: styleBorder,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    position: Double,
    thickness: Double
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
  @scala.inline
  implicit class SketchMSStyleBorderOps[Self <: SketchMSStyleBorder] (val x: Self) extends AnyVal {
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
    def set_class(value: styleBorder): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: SketchMSColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = this.set("contextSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillType(value: Double): Self = this.set("fillType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: SketchMSGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
  }
  
}

