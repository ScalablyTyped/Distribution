package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorder extends js.Object {
  var _class: styleBorder
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[String] = js.undefined
  var fillType: Double
  var gradient: SketchMSGradient
  var isEnabled: Double
  var position: Double
  var thickness: Double
}

object SketchMSStyleBorder {
  @scala.inline
  def apply(
    _class: styleBorder,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    position: Double,
    thickness: Double,
    do_objectID: String = null
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = _class, color = color, contextSettings = contextSettings, fillType = fillType, gradient = gradient, isEnabled = isEnabled, position = position, thickness = thickness)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
}

