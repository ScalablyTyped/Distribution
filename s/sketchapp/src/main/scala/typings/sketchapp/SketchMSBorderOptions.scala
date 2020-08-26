package typings.sketchapp

import typings.sketchapp.sketchappStrings.borderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSBorderOptions extends js.Object {
  var _class: borderOptions = js.native
  var dashPattern: js.Array[Double] = js.native
  var isEnabled: Boolean = js.native
  var lineCapStyle: SketchMSBorderLineCapStyle = js.native
  var lineJoinStyle: SketchMSBorderLineJoinStyle = js.native
}

object SketchMSBorderOptions {
  @scala.inline
  def apply(
    _class: borderOptions,
    dashPattern: js.Array[Double],
    isEnabled: Boolean,
    lineCapStyle: SketchMSBorderLineCapStyle,
    lineJoinStyle: SketchMSBorderLineJoinStyle
  ): SketchMSBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorderOptions]
  }
  @scala.inline
  implicit class SketchMSBorderOptionsOps[Self <: SketchMSBorderOptions] (val x: Self) extends AnyVal {
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
    def set_class(value: borderOptions): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashPatternVarargs(value: Double*): Self = this.set("dashPattern", js.Array(value :_*))
    @scala.inline
    def setDashPattern(value: js.Array[Double]): Self = this.set("dashPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineCapStyle(value: SketchMSBorderLineCapStyle): Self = this.set("lineCapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoinStyle(value: SketchMSBorderLineJoinStyle): Self = this.set("lineJoinStyle", value.asInstanceOf[js.Any])
  }
  
}

