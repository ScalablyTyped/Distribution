package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRulerData extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.rulerData
  var base: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var guides: js.Array[_]
}

object SketchMSRulerData {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.rulerData,
    base: scala.Double,
    guides: js.Array[_],
    do_objectID: java.lang.String = null
  ): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class, base = base, guides = guides)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSRulerData]
  }
}

