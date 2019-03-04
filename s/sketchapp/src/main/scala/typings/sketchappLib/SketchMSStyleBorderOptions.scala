package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorderOptions extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleBorderOptions
  var dashPattern: js.Array[_]
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var isEnabled: scala.Double
  var lineCapStyle: scala.Double
  var lineJoinStyle: scala.Double
}

object SketchMSStyleBorderOptions {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleBorderOptions,
    dashPattern: js.Array[_],
    isEnabled: scala.Double,
    lineCapStyle: scala.Double,
    lineJoinStyle: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class, dashPattern = dashPattern, isEnabled = isEnabled, lineCapStyle = lineCapStyle, lineJoinStyle = lineJoinStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
}

