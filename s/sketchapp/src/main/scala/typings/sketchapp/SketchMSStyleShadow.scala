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
    spread: Double
  ): SketchMSStyleShadow = {
    val __obj = js.Dynamic.literal(_class = _class, blurRadius = blurRadius, color = color, contextSettings = contextSettings, isEnabled = isEnabled, offsetX = offsetX, offsetY = offsetY, spread = spread)
  
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
}

