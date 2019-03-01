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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("dashPattern")(dashPattern)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("lineCapStyle")(lineCapStyle)
    __obj.updateDynamic("lineJoinStyle")(lineJoinStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
}

