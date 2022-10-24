package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateHeaderProps[Data] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ SidebarHeaderChildrenFnProps[Data], ReactNode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var headerData: js.UndefOr[Data] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var intervalRenderer: js.UndefOr[js.Function1[/* props */ js.UndefOr[IntervalRenderer[Data]], ReactNode]] = js.undefined
  
  var labelFormat: js.UndefOr[
    String | (js.Function3[
      /* param0 */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ])
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var unit: js.UndefOr[Unit | primaryHeader] = js.undefined
}
object DateHeaderProps {
  
  inline def apply[Data](): DateHeaderProps[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeaderProps[Data]]
  }
  
  extension [Self <: DateHeaderProps[?], Data](x: Self & DateHeaderProps[Data]) {
    
    inline def setChildren(value: /* props */ SidebarHeaderChildrenFnProps[Data] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeaderData(value: Data): Self = StObject.set(x, "headerData", value.asInstanceOf[js.Any])
    
    inline def setHeaderDataUndefined: Self = StObject.set(x, "headerData", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIntervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => ReactNode): Self = StObject.set(x, "intervalRenderer", js.Any.fromFunction1(value))
    
    inline def setIntervalRendererUndefined: Self = StObject.set(x, "intervalRenderer", js.undefined)
    
    inline def setLabelFormat(
      value: String | (js.Function3[
          /* param0 */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatFunction3(
      value: (/* param0 */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): Self = StObject.set(x, "labelFormat", js.Any.fromFunction3(value))
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: Unit | primaryHeader): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
