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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendProps extends StObject {
  
  var align: js.UndefOr[left | center | right] = js.undefined
  
  var chartHeight: js.UndefOr[Double] = js.undefined
  
  var chartWidth: js.UndefOr[Double] = js.undefined
  
  var content: js.UndefOr[ReactElement | ContentRenderer[LegendProps]] = js.undefined
  
  var formatter: js.UndefOr[LegendValueFormatter] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconType: js.UndefOr[IconType] = js.undefined
  
  var layout: js.UndefOr[LayoutType] = js.undefined
  
  var margin: js.UndefOr[PartialMargin] = js.undefined
  
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.undefined
  
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.undefined
  
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}
object LegendProps {
  
  @scala.inline
  def apply(): LegendProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendProps]
  }
  
  @scala.inline
  implicit class LegendPropsMutableBuilder[Self <: LegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setChartHeight(value: Double): Self = StObject.set(x, "chartHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartHeightUndefined: Self = StObject.set(x, "chartHeight", js.undefined)
    
    @scala.inline
    def setChartWidth(value: Double): Self = StObject.set(x, "chartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartWidthUndefined: Self = StObject.set(x, "chartWidth", js.undefined)
    
    @scala.inline
    def setContent(value: ReactElement | ContentRenderer[LegendProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: LegendProps => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
        ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => js.Any
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setLayout(value: LayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOnBBoxUpdate(value: /* box */ Width => Unit): Self = StObject.set(x, "onBBoxUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBBoxUpdateUndefined: Self = StObject.set(x, "onBBoxUpdate", js.undefined)
    
    @scala.inline
    def setOnClick(value: RechartsFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: RechartsFunction): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: RechartsFunction): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Array[LegendPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: LegendPayload*): Self = StObject.set(x, "payload", js.Array(value :_*))
    
    @scala.inline
    def setVerticalAlign(value: top | middle | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Object): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
