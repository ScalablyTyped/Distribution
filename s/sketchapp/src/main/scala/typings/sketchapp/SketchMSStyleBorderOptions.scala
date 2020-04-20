package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorderOptions extends js.Object {
  var _class: styleBorderOptions
  var dashPattern: js.Array[_]
  var isEnabled: Double
  var lineCapStyle: Double
  var lineJoinStyle: Double
}

object SketchMSStyleBorderOptions {
  @scala.inline
  def apply(
    _class: styleBorderOptions,
    dashPattern: js.Array[_],
    isEnabled: Double,
    lineCapStyle: Double,
    lineJoinStyle: Double
  ): SketchMSStyleBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
}

