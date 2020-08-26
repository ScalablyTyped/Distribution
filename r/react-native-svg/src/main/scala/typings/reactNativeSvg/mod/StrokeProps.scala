package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeProps extends js.Object {
  var stroke: js.UndefOr[Color] = js.native
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.native
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  var strokeLinecap: js.UndefOr[Linecap] = js.native
  var strokeLinejoin: js.UndefOr[Linejoin] = js.native
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.native
  var strokeOpacity: js.UndefOr[NumberProp] = js.native
  var strokeWidth: js.UndefOr[NumberProp] = js.native
}

object StrokeProps {
  @scala.inline
  def apply(): StrokeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeProps]
  }
  @scala.inline
  implicit class StrokePropsOps[Self <: StrokeProps] (val x: Self) extends AnyVal {
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
    def setStrokeVarargs(value: Double*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: Color): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharrayVarargs(value: NumberProp*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffset(value: NumberProp): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: Linecap): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: Linejoin): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: NumberProp): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: NumberProp): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: NumberProp): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

