package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleReflection extends js.Object {
  var _class: styleReflection
  var distance: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var isEnabled: Double
  var strength: Double
}

object SketchMSStyleReflection {
  @scala.inline
  def apply(
    _class: styleReflection,
    distance: Double,
    isEnabled: Double,
    strength: Double,
    do_objectID: String = null
  ): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = _class, distance = distance, isEnabled = isEnabled, strength = strength)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
}

