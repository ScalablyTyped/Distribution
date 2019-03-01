package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleReflection extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleReflection
  var distance: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var isEnabled: scala.Double
  var strength: scala.Double
}

object SketchMSStyleReflection {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleReflection,
    distance: scala.Double,
    isEnabled: scala.Double,
    strength: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("strength")(strength)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
}

