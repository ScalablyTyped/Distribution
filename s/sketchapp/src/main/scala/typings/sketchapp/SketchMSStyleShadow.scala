package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleShadow extends js.Object {
  var _class: styleShadow
  var blurRadius: Double
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[String] = js.undefined
  var isEnabled: Double
  var offsetX: Double
  var offsetY: Double
  var spread: Double
}

object SketchMSStyleShadow {
  @scala.inline
  def apply(
    _class: styleShadow,
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Double,
    offsetX: Double,
    offsetY: Double,
    spread: Double,
    do_objectID: String = null
  ): SketchMSStyleShadow = {
    val __obj = js.Dynamic.literal(_class = _class, blurRadius = blurRadius, color = color, contextSettings = contextSettings, isEnabled = isEnabled, offsetX = offsetX, offsetY = offsetY, spread = spread)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
}

