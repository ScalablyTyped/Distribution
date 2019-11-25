package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleColorControls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleColorControls extends js.Object {
  var _class: styleColorControls
  var brightness: Double
  var contrast: Double
  var hue: Double
  var isEnabled: Double
  var saturation: Double
}

object SketchMSStyleColorControls {
  @scala.inline
  def apply(
    _class: styleColorControls,
    brightness: Double,
    contrast: Double,
    hue: Double,
    isEnabled: Double,
    saturation: Double
  ): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
}

