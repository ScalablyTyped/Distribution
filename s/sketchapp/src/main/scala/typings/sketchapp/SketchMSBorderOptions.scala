package typings.sketchapp

import typings.sketchapp.sketchappStrings.borderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSBorderOptions extends js.Object {
  var _class: borderOptions
  var dashPattern: js.Array[Double]
  var isEnabled: Boolean
  var lineCapStyle: SketchMSBorderLineCapStyle
  var lineJoinStyle: SketchMSBorderLineJoinStyle
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
}

