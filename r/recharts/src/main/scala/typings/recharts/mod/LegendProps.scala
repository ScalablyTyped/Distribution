package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import typings.recharts.anon.Width
import typings.recharts.rechartsStrings.bottom
import typings.recharts.rechartsStrings.center
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.middle
import typings.recharts.rechartsStrings.right
import typings.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendProps extends js.Object {
  
  var align: js.UndefOr[left | center | right] = js.native
  
  var chartHeight: js.UndefOr[Double] = js.native
  
  var chartWidth: js.UndefOr[Double] = js.native
  
  var content: js.UndefOr[ReactElement | ContentRenderer[LegendProps]] = js.native
  
  var formatter: js.UndefOr[LegendValueFormatter] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[IconType] = js.native
  
  var layout: js.UndefOr[LayoutType] = js.native
  
  var margin: js.UndefOr[PartialMargin] = js.native
  
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.native
  
  var onClick: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.native
  
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.native
  
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wrapperStyle: js.UndefOr[js.Object] = js.native
}
object LegendProps {
  
  @scala.inline
  def apply(): LegendProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendProps]
  }
  
  @scala.inline
  implicit class LegendPropsOps[Self <: LegendProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setChartHeight(value: Double): Self = this.set("chartHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartHeight: Self = this.set("chartHeight", js.undefined)
    
    @scala.inline
    def setChartWidth(value: Double): Self = this.set("chartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartWidth: Self = this.set("chartWidth", js.undefined)
    
    @scala.inline
    def setContentFunction1(value: LegendProps => ReactNode): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: ReactElement | ContentRenderer[LegendProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
        ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => js.Any
    ): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: IconType): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setLayout(value: LayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnBBoxUpdate(value: /* box */ Width => Unit): Self = this.set("onBBoxUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBBoxUpdate: Self = this.set("onBBoxUpdate", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: LegendPayload*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: js.Array[LegendPayload]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: top | middle | bottom): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Object): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
