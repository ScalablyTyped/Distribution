package typings.reactSketchapp.lineMod

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
trait LineProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
  var x1: NumberProp = js.native
  var x2: NumberProp = js.native
  var y1: NumberProp = js.native
  var y2: NumberProp = js.native
}

object LineProps {
  @scala.inline
  def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): LineProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  @scala.inline
  implicit class LinePropsOps[Self <: LineProps] (val x: Self) extends AnyVal {
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
    def setX1(value: NumberProp): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: NumberProp): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: NumberProp): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: NumberProp): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

