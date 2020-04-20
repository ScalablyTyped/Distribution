package typings.sketchapp

import typings.sketchapp.sketchappStrings.graphicsContextSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGraphicsContextSettings extends js.Object {
  var _class: graphicsContextSettings
  var blendMode: SketchMSGraphicsContextSettingsBlendMode
  var opacity: Double
}

object SketchMSGraphicsContextSettings {
  @scala.inline
  def apply(
    _class: graphicsContextSettings,
    blendMode: SketchMSGraphicsContextSettingsBlendMode,
    opacity: Double
  ): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
}

