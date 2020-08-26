package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisProps extends js.Object {
   // default: 'bottom'
  var attr: js.UndefOr[String] = js.native
   // default: 'x'
  var attrAxis: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var hideLine: js.UndefOr[Boolean] = js.native
  var hideTicks: js.UndefOr[Boolean] = js.native
  var innerHeight: js.UndefOr[Double] = js.native
  var innerWidth: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginRight: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var on0: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[top | bottom] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tickFormat: js.UndefOr[RVTickFormat] = js.native
  var tickLabelAngle: js.UndefOr[Double] = js.native
  var tickPadding: js.UndefOr[Double] = js.native
  var tickSize: js.UndefOr[Double] = js.native
  var tickSizeInner: js.UndefOr[Double] = js.native
  var tickSizeOuter: js.UndefOr[Double] = js.native
  var tickTotal: js.UndefOr[Double] = js.native
  var tickValues: js.UndefOr[js.Array[_]] = js.native
  var title: js.UndefOr[String] = js.native
  var top: js.UndefOr[Double] = js.native
   // default: 'y'
  var width: js.UndefOr[Double] = js.native
}

object XAxisProps {
  @scala.inline
  def apply(): XAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisProps]
  }
  @scala.inline
  implicit class XAxisPropsOps[Self <: XAxisProps] (val x: Self) extends AnyVal {
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
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setAttrAxis(value: String): Self = this.set("attrAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrAxis: Self = this.set("attrAxis", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideLine(value: Boolean): Self = this.set("hideLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideLine: Self = this.set("hideLine", js.undefined)
    @scala.inline
    def setHideTicks(value: Boolean): Self = this.set("hideTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTicks: Self = this.set("hideTicks", js.undefined)
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
    def setOn0(value: Boolean): Self = this.set("on0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn0: Self = this.set("on0", js.undefined)
    @scala.inline
    def setOrientation(value: top | bottom): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = this.set("tickFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTickFormat: Self = this.set("tickFormat", js.undefined)
    @scala.inline
    def setTickLabelAngle(value: Double): Self = this.set("tickLabelAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickLabelAngle: Self = this.set("tickLabelAngle", js.undefined)
    @scala.inline
    def setTickPadding(value: Double): Self = this.set("tickPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickPadding: Self = this.set("tickPadding", js.undefined)
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    @scala.inline
    def setTickSizeInner(value: Double): Self = this.set("tickSizeInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSizeInner: Self = this.set("tickSizeInner", js.undefined)
    @scala.inline
    def setTickSizeOuter(value: Double): Self = this.set("tickSizeOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSizeOuter: Self = this.set("tickSizeOuter", js.undefined)
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
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

