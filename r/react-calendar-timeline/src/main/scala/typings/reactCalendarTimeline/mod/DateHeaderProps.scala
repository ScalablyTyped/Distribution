package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateHeaderProps[Data] extends js.Object {
  
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
  implicit class DateHeaderPropsOps[Self <: DateHeaderProps[_], Data] (val x: Self with DateHeaderProps[Data]) extends AnyVal {
    
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
    def setChildren(value: /* props */ SidebarHeaderChildrenFnProps[Data] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHeaderData(value: Data): Self = this.set("headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderData: Self = this.set("headerData", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIntervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => ReactNode): Self = this.set("intervalRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIntervalRenderer: Self = this.set("intervalRenderer", js.undefined)
    
    @scala.inline
    def setLabelFormatFunction3(
      value: (/* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): Self = this.set("labelFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabelFormat(
      value: String | (js.Function3[
          /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit | primaryHeader): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
