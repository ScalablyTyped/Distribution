package typings.reactSketchapp.circleMod

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
trait CircleProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
  var cx: NumberProp = js.native
  var cy: NumberProp = js.native
  var r: NumberProp = js.native
}

object CircleProps {
  @scala.inline
  def apply(cx: NumberProp, cy: NumberProp, r: NumberProp): CircleProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
  @scala.inline
  implicit class CirclePropsOps[Self <: CircleProps] (val x: Self) extends AnyVal {
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
    def setCx(value: NumberProp): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: NumberProp): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: NumberProp): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

