package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorderOptions extends js.Object {
  var _class: styleBorderOptions
  var dashPattern: js.Array[_]
  var do_objectID: js.UndefOr[String] = js.undefined
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
    lineJoinStyle: Double,
    do_objectID: String = null
  ): SketchMSStyleBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class, dashPattern = dashPattern, isEnabled = isEnabled, lineCapStyle = lineCapStyle, lineJoinStyle = lineJoinStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
}

