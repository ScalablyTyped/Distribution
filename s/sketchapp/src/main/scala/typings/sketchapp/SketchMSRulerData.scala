package typings.sketchapp

import typings.sketchapp.sketchappStrings.rulerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRulerData extends js.Object {
  var _class: rulerData
  var base: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var guides: js.Array[_]
}

object SketchMSRulerData {
  @scala.inline
  def apply(_class: rulerData, base: Double, guides: js.Array[_], do_objectID: String = null): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class, base = base, guides = guides)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSRulerData]
  }
}

