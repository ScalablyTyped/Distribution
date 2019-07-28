package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleColorControls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleColorControls extends js.Object {
  var _class: styleColorControls
  var brightness: Double
  var contrast: Double
  var do_objectID: js.UndefOr[String] = js.undefined
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
    saturation: Double,
    do_objectID: String = null
  ): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = _class, brightness = brightness, contrast = contrast, hue = hue, isEnabled = isEnabled, saturation = saturation)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
}

