package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleColorControls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleColorControls extends js.Object {
  var _class: styleColorControls = js.native
  var brightness: Double = js.native
  var contrast: Double = js.native
  var hue: Double = js.native
  var isEnabled: Double = js.native
  var saturation: Double = js.native
}

object SketchMSStyleColorControls {
  @scala.inline
  def apply(
    _class: styleColorControls,
    brightness: Double,
    contrast: Double,
    hue: Double,
    isEnabled: Double,
    saturation: Double
  ): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
  @scala.inline
  implicit class SketchMSStyleColorControlsOps[Self <: SketchMSStyleColorControls] (val x: Self) extends AnyVal {
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
    def set_class(value: styleColorControls): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
  }
  
}

