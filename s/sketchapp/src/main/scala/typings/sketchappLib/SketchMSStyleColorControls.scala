package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleColorControls extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleColorControls
  var brightness: scala.Double
  var contrast: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var hue: scala.Double
  var isEnabled: scala.Double
  var saturation: scala.Double
}

object SketchMSStyleColorControls {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleColorControls,
    brightness: scala.Double,
    contrast: scala.Double,
    hue: scala.Double,
    isEnabled: scala.Double,
    saturation: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = _class, brightness = brightness, contrast = contrast, hue = hue, isEnabled = isEnabled, saturation = saturation)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
}

