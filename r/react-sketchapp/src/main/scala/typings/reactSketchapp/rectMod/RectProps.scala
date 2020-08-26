package typings.reactSketchapp.rectMod

import typings.reactSketchapp.propsMod.ClipProps
import typings.reactSketchapp.propsMod.DefinationProps
import typings.reactSketchapp.propsMod.FillProps
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.StrokeProps
import typings.reactSketchapp.propsMod.TransformProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
  var height: NumberProp = js.native
  var rx: js.UndefOr[NumberProp] = js.native
  var ry: js.UndefOr[NumberProp] = js.native
  var width: NumberProp = js.native
  @JSName("x")
  var x_RectProps: NumberProp = js.native
  @JSName("y")
  var y_RectProps: NumberProp = js.native
}

object RectProps {
  @scala.inline
  def apply(height: NumberProp, width: NumberProp, x: NumberProp, y: NumberProp): RectProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectProps]
  }
  @scala.inline
  implicit class RectPropsOps[Self <: RectProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: NumberProp): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: NumberProp): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: NumberProp): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: NumberProp): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx(value: NumberProp): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: NumberProp): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
  }
  
}

