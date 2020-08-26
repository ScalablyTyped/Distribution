package typings.reactSketchapp.propsMod

import typings.reactSketchapp.reactSketchappStrings.evenodd
import typings.reactSketchapp.reactSketchappStrings.nonzero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillProps extends js.Object {
  var fill: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[NumberProp] = js.native
  var fillRule: js.UndefOr[evenodd | nonzero] = js.native
}

object FillProps {
  @scala.inline
  def apply(): FillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillProps]
  }
  @scala.inline
  implicit class FillPropsOps[Self <: FillProps] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: NumberProp): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: evenodd | nonzero): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
  }
  
}

