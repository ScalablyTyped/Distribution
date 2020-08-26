package typings.sketchapp

import typings.sketchapp.sketchappStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSRect extends js.Object {
  var _class: rect = js.native
  var constrainProportions: Boolean = js.native
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SketchMSRect {
  @scala.inline
  def apply(_class: rect, constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRect]
  }
  @scala.inline
  implicit class SketchMSRectOps[Self <: SketchMSRect] (val x: Self) extends AnyVal {
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
    def set_class(value: rect): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstrainProportions(value: Boolean): Self = this.set("constrainProportions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

