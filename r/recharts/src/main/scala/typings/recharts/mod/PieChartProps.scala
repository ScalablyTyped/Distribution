package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import typings.recharts.rechartsStrings.centric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.recharts.mod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, baseValue, maxBarSize, style, className, children, reverseStackOrder */ @js.native
trait PieChartProps extends EventAttributes {
  var barCategoryGap: js.UndefOr[Double | String] = js.native
  var barGap: js.UndefOr[Double | String] = js.native
  var barSize: js.UndefOr[Double | String] = js.native
  var baseValue: js.UndefOr[BaseValueType] = js.native
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var innerRadius: js.UndefOr[Double | String] = js.native
  var layout: js.UndefOr[centric] = js.native
  var margin: js.UndefOr[PartialMargin] = js.native
  var maxBarSize: js.UndefOr[Double] = js.native
  var outerRadius: js.UndefOr[Double | String] = js.native
  var reverseStackOrder: js.UndefOr[Boolean] = js.native
  var stackOffset: js.UndefOr[StackOffsetType] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var syncId: js.UndefOr[String | Double] = js.native
  var throttleDelay: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PieChartProps {
  @scala.inline
  def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps] (val x: Self) extends AnyVal {
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
    def setCx(value: Double | String): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double | String): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setLayout(value: centric): Self = this.set("layout", value.asInstanceOf[js.Any])
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
    def setOuterRadius(value: Double | String): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    @scala.inline
    def setReverseStackOrder(value: Boolean): Self = this.set("reverseStackOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseStackOrder: Self = this.set("reverseStackOrder", js.undefined)
    @scala.inline
    def setStackOffset(value: StackOffsetType): Self = this.set("stackOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackOffset: Self = this.set("stackOffset", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
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

