package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateHeaderProps[Data] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ SidebarHeaderChildrenFnProps[Data], ReactNode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var headerData: js.UndefOr[Data] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var intervalRenderer: js.UndefOr[js.Function1[/* props */ js.UndefOr[IntervalRenderer[Data]], ReactNode]] = js.native
  
  var labelFormat: js.UndefOr[
    String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ])
  ] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var unit: js.UndefOr[Unit | primaryHeader] = js.native
}
object DateHeaderProps {
  
  @scala.inline
  def apply[Data](): DateHeaderProps[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeaderProps[Data]]
  }
  
  @scala.inline
  implicit class DateHeaderPropsMutableBuilder[Self <: DateHeaderProps[_], Data] (val x: Self with DateHeaderProps[Data]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* props */ SidebarHeaderChildrenFnProps[Data] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHeaderData(value: Data): Self = StObject.set(x, "headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderDataUndefined: Self = StObject.set(x, "headerData", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIntervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => ReactNode): Self = StObject.set(x, "intervalRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntervalRendererUndefined: Self = StObject.set(x, "intervalRenderer", js.undefined)
    
    @scala.inline
    def setLabelFormat(
      value: String | (js.Function3[
          /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFormatFunction3(
      value: (/* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): Self = StObject.set(x, "labelFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit | primaryHeader): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
