package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps
  extends StObject
     with Animatable {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var allowEscapeViewBox: js.UndefOr[AllowEscapeViewBox] = js.undefined
  
  var content: js.UndefOr[ReactElement | StatelessComponent[js.Any] | ContentRenderer[TooltipProps]] = js.undefined
  
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  
  var cursor: js.UndefOr[Boolean | js.Object | ReactElement | StatelessComponent[js.Any]] = js.undefined
  
  var filterNull: js.UndefOr[Boolean] = js.undefined
  
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  
  var itemSorter: js.UndefOr[ItemSorter[TooltipPayload]] = js.undefined
  
  var itemStyle: js.UndefOr[js.Object] = js.undefined
  
  var label: js.UndefOr[String | Double] = js.undefined
  
  var labelFormatter: js.UndefOr[LabelFormatter] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var payload: js.UndefOr[js.Array[TooltipPayload]] = js.undefined
  
  var position: js.UndefOr[Coordinate] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var useTranslate3d: js.UndefOr[Boolean] = js.undefined
  
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAllowEscapeViewBox(value: AllowEscapeViewBox): Self = StObject.set(x, "allowEscapeViewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEscapeViewBoxUndefined: Self = StObject.set(x, "allowEscapeViewBox", js.undefined)
    
    @scala.inline
    def setContent(value: ReactElement | StatelessComponent[js.Any] | ContentRenderer[TooltipProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: TooltipProps => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    @scala.inline
    def setCursor(value: Boolean | js.Object | ReactElement | StatelessComponent[js.Any]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFilterNull(value: Boolean): Self = StObject.set(x, "filterNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNullUndefined: Self = StObject.set(x, "filterNull", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setItemSorter(value: (TooltipPayload, TooltipPayload) => Double): Self = StObject.set(x, "itemSorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemSorterUndefined: Self = StObject.set(x, "itemSorter", js.undefined)
    
    @scala.inline
    def setItemStyle(value: js.Object): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFormatter(value: /* label */ String | Double => ReactNode): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Array[TooltipPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: TooltipPayload*): Self = StObject.set(x, "payload", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Coordinate): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setUseTranslate3d(value: Boolean): Self = StObject.set(x, "useTranslate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTranslate3dUndefined: Self = StObject.set(x, "useTranslate3d", js.undefined)
    
    @scala.inline
    def setViewBox(value: ViewBox): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Object): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
