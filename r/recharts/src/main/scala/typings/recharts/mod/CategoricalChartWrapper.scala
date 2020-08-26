package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalChartWrapper[L] extends js.Object {
  var barCategoryGap: js.UndefOr[Double | String] = js.native
  var barGap: js.UndefOr[Double | String] = js.native
  var barSize: js.UndefOr[Double | String] = js.native
  var baseValue: js.UndefOr[BaseValueType] = js.native
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  var height: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[L] = js.native
  var margin: js.UndefOr[PartialMargin] = js.native
  var maxBarSize: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[RechartsFunction] = js.native
  var onMouseDown: js.UndefOr[RechartsFunction] = js.native
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.native
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.native
  var onMouseMove: js.UndefOr[RechartsFunction] = js.native
  var onMouseUp: js.UndefOr[RechartsFunction] = js.native
  var reverseStackOrder: js.UndefOr[Boolean] = js.native
  var stackOffset: js.UndefOr[StackOffsetType] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var syncId: js.UndefOr[String | Double] = js.native
  var throttleDelay: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object CategoricalChartWrapper {
  @scala.inline
  def apply[L](): CategoricalChartWrapper[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalChartWrapper[L]]
  }
  @scala.inline
  implicit class CategoricalChartWrapperOps[Self <: CategoricalChartWrapper[_], L] (val x: Self with CategoricalChartWrapper[L]) extends AnyVal {
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
    def setBarCategoryGap(value: Double | String): Self = this.set("barCategoryGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarCategoryGap: Self = this.set("barCategoryGap", js.undefined)
    @scala.inline
    def setBarGap(value: Double | String): Self = this.set("barGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarGap: Self = this.set("barGap", js.undefined)
    @scala.inline
    def setBarSize(value: Double | String): Self = this.set("barSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSize: Self = this.set("barSize", js.undefined)
    @scala.inline
    def setBaseValue(value: BaseValueType): Self = this.set("baseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseValue: Self = this.set("baseValue", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ReactNode | js.Array[ReactNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLayout(value: L): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: PartialMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxBarSize(value: Double): Self = this.set("maxBarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBarSize: Self = this.set("maxBarSize", js.undefined)
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setReverseStackOrder(value: Boolean): Self = this.set("reverseStackOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseStackOrder: Self = this.set("reverseStackOrder", js.undefined)
    @scala.inline
    def setStackOffset(value: StackOffsetType): Self = this.set("stackOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackOffset: Self = this.set("stackOffset", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSyncId(value: String | Double): Self = this.set("syncId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncId: Self = this.set("syncId", js.undefined)
    @scala.inline
    def setThrottleDelay(value: Double): Self = this.set("throttleDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleDelay: Self = this.set("throttleDelay", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

