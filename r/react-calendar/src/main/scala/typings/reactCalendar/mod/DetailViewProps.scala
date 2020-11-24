package typings.reactCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailViewProps extends js.Object {
  
  var activeStartDate: Date = js.native
  
  var calendarType: js.UndefOr[CalendarType] = js.native
  
  var hover: js.UndefOr[Date] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var onClick: js.UndefOr[DateCallback] = js.native
  
  var onMouseOver: js.UndefOr[DateCallback] = js.native
  
  var renderChildren: js.UndefOr[
    js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
  
   // For backwards compatibility
  var tileClassName: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ] = js.native
  
  var tileContent: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.native
  
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTileProperties, Boolean]] = js.native
  
  var value: js.UndefOr[Date | js.Array[Date]] = js.native
}
object DetailViewProps {
  
  @scala.inline
  def apply(activeStartDate: Date): DetailViewProps = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailViewProps]
  }
  
  @scala.inline
  implicit class DetailViewPropsOps[Self <: DetailViewProps] (val x: Self) extends AnyVal {
    
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
    def setActiveStartDate(value: Date): Self = this.set("activeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarType(value: CalendarType): Self = this.set("calendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarType: Self = this.set("calendarType", js.undefined)
    
    @scala.inline
    def setHover(value: Date): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* date */ Date => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: /* date */ Date => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setRenderChildren(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = this.set("renderChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderChildren: Self = this.set("renderChildren", js.undefined)
    
    @scala.inline
    def setTileClassNameVarargs(value: String*): Self = this.set("tileClassName", js.Array(value :_*))
    
    @scala.inline
    def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = this.set("tileClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileClassName(
      value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
    ): Self = this.set("tileClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileClassName: Self = this.set("tileClassName", js.undefined)
    
    @scala.inline
    def setTileContentFunction1(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = this.set("tileContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileContent(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
        ])
    ): Self = this.set("tileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileContent: Self = this.set("tileContent", js.undefined)
    
    @scala.inline
    def setTileDisabled(value: /* props */ CalendarTileProperties => Boolean): Self = this.set("tileDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTileDisabled: Self = this.set("tileDisabled", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Date*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
