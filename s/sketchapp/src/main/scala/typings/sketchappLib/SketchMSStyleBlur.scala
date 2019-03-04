package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBlur extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleBlur
  var center: Anon_X
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var isEnabled: scala.Double
  var motionAngle: scala.Double
  var radius: scala.Double
  var `type`: scala.Double
}

object SketchMSStyleBlur {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleBlur,
    center: Anon_X,
    isEnabled: scala.Double,
    motionAngle: scala.Double,
    radius: scala.Double,
    `type`: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleBlur = {
    val __obj = js.Dynamic.literal(_class = _class, center = center, isEnabled = isEnabled, motionAngle = motionAngle, radius = radius)
    __obj.updateDynamic("type")(`type`)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleBlur]
  }
}

