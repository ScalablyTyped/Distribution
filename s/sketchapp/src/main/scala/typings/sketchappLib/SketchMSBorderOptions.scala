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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("dashPattern")(dashPattern)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("lineCapStyle")(lineCapStyle)
    __obj.updateDynamic("lineJoinStyle")(lineJoinStyle)
    __obj.asInstanceOf[SketchMSBorderOptions]
  }
}

