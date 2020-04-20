package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBorder extends js.Object {
  var _class: styleBorder
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
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
    thickness: Double
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
}

