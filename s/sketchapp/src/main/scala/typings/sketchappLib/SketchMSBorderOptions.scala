package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSBorderOptions extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.borderOptions
  var dashPattern: js.Array[scala.Double]
  var isEnabled: scala.Boolean
  var lineCapStyle: SketchMSBorderLineCapStyle
  var lineJoinStyle: SketchMSBorderLineJoinStyle
}

object SketchMSBorderOptions {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.borderOptions,
    dashPattern: js.Array[scala.Double],
    isEnabled: scala.Boolean,
    lineCapStyle: SketchMSBorderLineCapStyle,
    lineJoinStyle: SketchMSBorderLineJoinStyle
  ): SketchMSBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class, dashPattern = dashPattern, isEnabled = isEnabled, lineCapStyle = lineCapStyle, lineJoinStyle = lineJoinStyle)
  
    __obj.asInstanceOf[SketchMSBorderOptions]
  }
}

