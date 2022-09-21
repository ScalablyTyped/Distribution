package typings.recharts.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps
  extends StObject
     with Animatable {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var allowEscapeViewBox: js.UndefOr[AllowEscapeViewBox] = js.undefined
  
  var content: js.UndefOr[ReactElement | FunctionComponent[Any] | ContentRenderer[TooltipProps]] = js.undefined
  
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  
  var cursor: js.UndefOr[Boolean | js.Object | ReactElement | FunctionComponent[Any]] = js.undefined
  
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
  
  inline def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  extension [Self <: TooltipProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAllowEscapeViewBox(value: AllowEscapeViewBox): Self = StObject.set(x, "allowEscapeViewBox", value.asInstanceOf[js.Any])
    
    inline def setAllowEscapeViewBoxUndefined: Self = StObject.set(x, "allowEscapeViewBox", js.undefined)
    
    inline def setContent(value: ReactElement | FunctionComponent[Any] | ContentRenderer[TooltipProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: TooltipProps => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setCursor(value: Boolean | js.Object | ReactElement | FunctionComponent[Any]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFilterNull(value: Boolean): Self = StObject.set(x, "filterNull", value.asInstanceOf[js.Any])
    
    inline def setFilterNullUndefined: Self = StObject.set(x, "filterNull", js.undefined)
    
    inline def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setItemSorter(value: (TooltipPayload, TooltipPayload) => Double): Self = StObject.set(x, "itemSorter", js.Any.fromFunction2(value))
    
    inline def setItemSorterUndefined: Self = StObject.set(x, "itemSorter", js.undefined)
    
    inline def setItemStyle(value: js.Object): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatter(value: /* label */ String | Double => ReactNode): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction1(value))
    
    inline def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPayload(value: js.Array[TooltipPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: TooltipPayload*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setPosition(value: Coordinate): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setUseTranslate3d(value: Boolean): Self = StObject.set(x, "useTranslate3d", value.asInstanceOf[js.Any])
    
    inline def setUseTranslate3dUndefined: Self = StObject.set(x, "useTranslate3d", js.undefined)
    
    inline def setViewBox(value: ViewBox): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setWrapperStyle(value: js.Object): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
