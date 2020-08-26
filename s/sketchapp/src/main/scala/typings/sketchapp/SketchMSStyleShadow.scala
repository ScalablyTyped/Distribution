package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleShadow extends js.Object {
  var _class: styleShadow = js.native
  var blurRadius: Double = js.native
  var color: SketchMSColor = js.native
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  var isEnabled: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var spread: Double = js.native
}

object SketchMSStyleShadow {
  @scala.inline
  def apply(
    _class: styleShadow,
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Double,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): SketchMSStyleShadow = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
  @scala.inline
  implicit class SketchMSStyleShadowOps[Self <: SketchMSStyleShadow] (val x: Self) extends AnyVal {
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
    def set_class(value: styleShadow): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: SketchMSColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = this.set("contextSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpread(value: Double): Self = this.set("spread", value.asInstanceOf[js.Any])
  }
  
}

