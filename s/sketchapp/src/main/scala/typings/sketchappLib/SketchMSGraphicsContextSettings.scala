package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGraphicsContextSettings extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.graphicsContextSettings
  var blendMode: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var opacity: scala.Double
}

object SketchMSGraphicsContextSettings {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.graphicsContextSettings,
    blendMode: scala.Double,
    opacity: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("blendMode")(blendMode)
    __obj.updateDynamic("opacity")(opacity)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
}

