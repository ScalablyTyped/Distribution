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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
}

