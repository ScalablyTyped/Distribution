package typings.sketchapp

import typings.sketchapp.sketchappStrings.rulerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSRulerData extends js.Object {
  var _class: rulerData = js.native
  var base: Double = js.native
  var guides: js.Array[_] = js.native
}

object SketchMSRulerData {
  @scala.inline
  def apply(_class: rulerData, base: Double, guides: js.Array[_]): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRulerData]
  }
  @scala.inline
  implicit class SketchMSRulerDataOps[Self <: SketchMSRulerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_class(value: rulerData): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuidesVarargs(value: js.Any*): Self = this.set("guides", js.Array(value :_*))
    @scala.inline
    def setGuides(value: js.Array[_]): Self = this.set("guides", value.asInstanceOf[js.Any])
  }
  
}

