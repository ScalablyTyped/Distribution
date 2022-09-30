package typings.reactDayPicker.indexEsmMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the components in use by DayPicker that can be customized via the {@link components} prop.
  */
/* Inlined std.Required<react-day-picker.react-day-picker/dist/index.esm.CustomComponents> */
trait Components extends StObject {
  
  var Caption: js.Function1[/* props */ CaptionProps, Element | Null]
  
  var CaptionLabel: js.Function1[/* props */ CaptionLabelProps, Element | Null]
  
  var Day: js.Function1[/* props */ DayProps, Element | Null]
  
  var DayContent: js.Function1[/* props */ DayContentProps, Element | Null]
  
  var Dropdown: js.Function1[/* props */ DropdownProps, Element | Null]
  
  var Footer: js.Function0[Element | Null]
  
  var Head: js.Function0[Element | Null]
  
  var HeadRow: js.Function0[Element | Null]
  
  var IconDropdown: js.Function1[/* props */ StyledComponent, Element | Null]
  
  var IconLeft: js.Function1[/* props */ StyledComponent, Element | Null]
  
  var IconRight: js.Function1[/* props */ StyledComponent, Element | Null]
  
  var Row: js.Function1[/* props */ RowProps, Element | Null]
  
  var WeekNumber: js.Function1[/* props */ WeekNumberProps, Element | Null]
}
object Components {
  
  inline def apply(
    Caption: /* props */ CaptionProps => Element | Null,
    CaptionLabel: /* props */ CaptionLabelProps => Element | Null,
    Day: /* props */ DayProps => Element | Null,
    DayContent: /* props */ DayContentProps => Element | Null,
    Dropdown: /* props */ DropdownProps => Element | Null,
    Footer: () => Element | Null,
    Head: () => Element | Null,
    HeadRow: () => Element | Null,
    IconDropdown: /* props */ StyledComponent => Element | Null,
    IconLeft: /* props */ StyledComponent => Element | Null,
    IconRight: /* props */ StyledComponent => Element | Null,
    Row: /* props */ RowProps => Element | Null,
    WeekNumber: /* props */ WeekNumberProps => Element | Null
  ): Components = {
    val __obj = js.Dynamic.literal(Caption = js.Any.fromFunction1(Caption), CaptionLabel = js.Any.fromFunction1(CaptionLabel), Day = js.Any.fromFunction1(Day), DayContent = js.Any.fromFunction1(DayContent), Dropdown = js.Any.fromFunction1(Dropdown), Footer = js.Any.fromFunction0(Footer), Head = js.Any.fromFunction0(Head), HeadRow = js.Any.fromFunction0(HeadRow), IconDropdown = js.Any.fromFunction1(IconDropdown), IconLeft = js.Any.fromFunction1(IconLeft), IconRight = js.Any.fromFunction1(IconRight), Row = js.Any.fromFunction1(Row), WeekNumber = js.Any.fromFunction1(WeekNumber))
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setCaption(value: /* props */ CaptionProps => Element | Null): Self = StObject.set(x, "Caption", js.Any.fromFunction1(value))
    
    inline def setCaptionLabel(value: /* props */ CaptionLabelProps => Element | Null): Self = StObject.set(x, "CaptionLabel", js.Any.fromFunction1(value))
    
    inline def setDay(value: /* props */ DayProps => Element | Null): Self = StObject.set(x, "Day", js.Any.fromFunction1(value))
    
    inline def setDayContent(value: /* props */ DayContentProps => Element | Null): Self = StObject.set(x, "DayContent", js.Any.fromFunction1(value))
    
    inline def setDropdown(value: /* props */ DropdownProps => Element | Null): Self = StObject.set(x, "Dropdown", js.Any.fromFunction1(value))
    
    inline def setFooter(value: () => Element | Null): Self = StObject.set(x, "Footer", js.Any.fromFunction0(value))
    
    inline def setHead(value: () => Element | Null): Self = StObject.set(x, "Head", js.Any.fromFunction0(value))
    
    inline def setHeadRow(value: () => Element | Null): Self = StObject.set(x, "HeadRow", js.Any.fromFunction0(value))
    
    inline def setIconDropdown(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconDropdown", js.Any.fromFunction1(value))
    
    inline def setIconLeft(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconLeft", js.Any.fromFunction1(value))
    
    inline def setIconRight(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconRight", js.Any.fromFunction1(value))
    
    inline def setRow(value: /* props */ RowProps => Element | Null): Self = StObject.set(x, "Row", js.Any.fromFunction1(value))
    
    inline def setWeekNumber(value: /* props */ WeekNumberProps => Element | Null): Self = StObject.set(x, "WeekNumber", js.Any.fromFunction1(value))
  }
}
