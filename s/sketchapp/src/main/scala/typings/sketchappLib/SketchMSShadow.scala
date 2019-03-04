package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSShadow extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.shadow | sketchappLib.sketchappLibStrings.MSInnerShadow
  var blurRadius: scala.Double
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var isEnabled: scala.Boolean
  var offsetX: scala.Double
  var offsetY: scala.Double
  var spread: scala.Double
}

object SketchMSShadow {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.shadow | sketchappLib.sketchappLibStrings.MSInnerShadow,
    blurRadius: scala.Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: scala.Boolean,
    offsetX: scala.Double,
    offsetY: scala.Double,
    spread: scala.Double
  ): SketchMSShadow = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius, color = color, contextSettings = contextSettings, isEnabled = isEnabled, offsetX = offsetX, offsetY = offsetY, spread = spread)
  
    __obj.asInstanceOf[SketchMSShadow]
  }
}

