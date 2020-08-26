package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLinesProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
   // default: 'vertical'
  var attr: String = js.native
  var direction: js.UndefOr[vertical | horizontal] = js.native
  var height: js.UndefOr[Double] = js.native
  var innerHeight: js.UndefOr[Double] = js.native
  var innerWidth: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginRight: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tickTotal: js.UndefOr[Double] = js.native
  var tickValues: js.UndefOr[js.Array[_]] = js.native
  var top: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GridLinesProps {
  @scala.inline
  def apply(attr: String): GridLinesProps = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLinesProps]
  }
  @scala.inline
  implicit class GridLinesPropsOps[Self <: GridLinesProps] (val x: Self) extends AnyVal {
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
    def setAttr(value: String): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
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
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTickTotal(value: Double): Self = this.set("tickTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickTotal: Self = this.set("tickTotal", js.undefined)
    @scala.inline
    def setTickValuesVarargs(value: js.Any*): Self = this.set("tickValues", js.Array(value :_*))
    @scala.inline
    def setTickValues(value: js.Array[_]): Self = this.set("tickValues", value.asInstanceOf[js.Any])
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

