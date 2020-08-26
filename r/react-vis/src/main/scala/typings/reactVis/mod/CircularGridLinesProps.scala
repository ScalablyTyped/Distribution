package typings.reactVis.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularGridLinesProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  var centerX: js.UndefOr[Double] = js.native
   // default: 0
  var centerY: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var innerHeight: js.UndefOr[Double] = js.native
  var innerWidth: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginRight: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var rRange: js.UndefOr[js.Array[Double]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tickTotal: js.UndefOr[Double] = js.native
  var tickValues: js.UndefOr[js.Array[Double]] = js.native
  var top: js.UndefOr[Double] = js.native
   // default: 0
  var width: js.UndefOr[Double] = js.native
}

object CircularGridLinesProps {
  @scala.inline
  def apply(): CircularGridLinesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularGridLinesProps]
  }
  @scala.inline
  implicit class CircularGridLinesPropsOps[Self <: CircularGridLinesProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInnerHeight(value: Double): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHeight: Self = this.set("innerHeight", js.undefined)
    @scala.inline
    def setInnerWidth(value: Double): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setRRangeVarargs(value: Double*): Self = this.set("rRange", js.Array(value :_*))
    @scala.inline
    def setRRange(value: js.Array[Double]): Self = this.set("rRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRRange: Self = this.set("rRange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTickTotal(value: Double): Self = this.set("tickTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickTotal: Self = this.set("tickTotal", js.undefined)
    @scala.inline
    def setTickValuesVarargs(value: Double*): Self = this.set("tickValues", js.Array(value :_*))
    @scala.inline
    def setTickValues(value: js.Array[Double]): Self = this.set("tickValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickValues: Self = this.set("tickValues", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

