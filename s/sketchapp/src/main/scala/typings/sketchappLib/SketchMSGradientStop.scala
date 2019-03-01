package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradientStop extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.gradientStop
  var color: SketchMSColor
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var position: scala.Double
}

object SketchMSGradientStop {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.gradientStop,
    color: SketchMSColor,
    position: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSGradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("position")(position)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGradientStop]
  }
}

