package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSInnerShadow
import typings.sketchapp.sketchappStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSShadow extends js.Object {
  var _class: shadow | MSInnerShadow
  var blurRadius: Double
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var isEnabled: Boolean
  var offsetX: Double
  var offsetY: Double
  var spread: Double
}

object SketchMSShadow {
  @scala.inline
  def apply(
    _class: shadow | MSInnerShadow,
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): SketchMSShadow = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius, color = color, contextSettings = contextSettings, isEnabled = isEnabled, offsetX = offsetX, offsetY = offsetY, spread = spread)
  
    __obj.asInstanceOf[SketchMSShadow]
  }
}

