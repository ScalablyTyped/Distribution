package typings.reactDayPicker.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map of the components that can be changed using the `components` prop.
  *
  * Look at the [components
  * source](https://github.com/gpbl/react-day-picker/tree/master/packages/react-day-picker/src/components)
  * to understand how internal components are built.
  */
trait CustomComponents extends StObject {
  
  /** The component for the caption element. */
  var Caption: js.UndefOr[js.Function1[/* props */ CaptionProps, Element | Null]] = js.undefined
  
  /** The component for the caption element. */
  var CaptionLabel: js.UndefOr[js.Function1[/* props */ CaptionLabelProps, Element | Null]] = js.undefined
  
  /**
    * The component for the day element.
    *
    * Each `Day` in DayPicker should render one of the following, according to
    * the return value of {@link useDayRender}.
    *
    * - an empty `React.Fragment`, to render if `isHidden` is true
    * - a `button` element, when the day is interactive, e.g. is selectable
    * - a `div` or a `span` element, when the day is not interactive
    *
    */
  var Day: js.UndefOr[js.Function1[/* props */ DayProps, Element | Null]] = js.undefined
  
  /** The component for the content of the day element. */
  var DayContent: js.UndefOr[js.Function1[/* props */ DayContentProps, Element | Null]] = js.undefined
  
  /** The component for the drop-down elements. */
  var Dropdown: js.UndefOr[js.Function1[/* props */ DropdownProps, Element | Null]] = js.undefined
  
  /** The component for the table footer. */
  var Footer: js.UndefOr[js.Function0[Element | Null]] = js.undefined
  
  /** The component for the table’s head. */
  var Head: js.UndefOr[js.Function0[Element | Null]] = js.undefined
  
  /** The component for the table’s head row. */
  var HeadRow: js.UndefOr[js.Function0[Element | Null]] = js.undefined
  
  /** The component for the small icon in the drop-downs. */
  var IconDropdown: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
  
  /** The arrow left icon (used for the Navigation buttons). */
  var IconLeft: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
  
  /** The arrow right icon (used for the Navigation buttons). */
  var IconRight: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
  
  /** The component for the table rows. */
  var Row: js.UndefOr[js.Function1[/* props */ RowProps, Element | Null]] = js.undefined
  
  /** The component for the week number in the table rows. */
  var WeekNumber: js.UndefOr[js.Function1[/* props */ WeekNumberProps, Element | Null]] = js.undefined
}
object CustomComponents {
  
  inline def apply(): CustomComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomComponents] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: /* props */ CaptionProps => Element | Null): Self = StObject.set(x, "Caption", js.Any.fromFunction1(value))
    
    inline def setCaptionLabel(value: /* props */ CaptionLabelProps => Element | Null): Self = StObject.set(x, "CaptionLabel", js.Any.fromFunction1(value))
    
    inline def setCaptionLabelUndefined: Self = StObject.set(x, "CaptionLabel", js.undefined)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "Caption", js.undefined)
    
    inline def setDay(value: /* props */ DayProps => Element | Null): Self = StObject.set(x, "Day", js.Any.fromFunction1(value))
    
    inline def setDayContent(value: /* props */ DayContentProps => Element | Null): Self = StObject.set(x, "DayContent", js.Any.fromFunction1(value))
    
    inline def setDayContentUndefined: Self = StObject.set(x, "DayContent", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
    
    inline def setDropdown(value: /* props */ DropdownProps => Element | Null): Self = StObject.set(x, "Dropdown", js.Any.fromFunction1(value))
    
    inline def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
    
    inline def setFooter(value: () => Element | Null): Self = StObject.set(x, "Footer", js.Any.fromFunction0(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
    
    inline def setHead(value: () => Element | Null): Self = StObject.set(x, "Head", js.Any.fromFunction0(value))
    
    inline def setHeadRow(value: () => Element | Null): Self = StObject.set(x, "HeadRow", js.Any.fromFunction0(value))
    
    inline def setHeadRowUndefined: Self = StObject.set(x, "HeadRow", js.undefined)
    
    inline def setHeadUndefined: Self = StObject.set(x, "Head", js.undefined)
    
    inline def setIconDropdown(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconDropdown", js.Any.fromFunction1(value))
    
    inline def setIconDropdownUndefined: Self = StObject.set(x, "IconDropdown", js.undefined)
    
    inline def setIconLeft(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconLeft", js.Any.fromFunction1(value))
    
    inline def setIconLeftUndefined: Self = StObject.set(x, "IconLeft", js.undefined)
    
    inline def setIconRight(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconRight", js.Any.fromFunction1(value))
    
    inline def setIconRightUndefined: Self = StObject.set(x, "IconRight", js.undefined)
    
    inline def setRow(value: /* props */ RowProps => Element | Null): Self = StObject.set(x, "Row", js.Any.fromFunction1(value))
    
    inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    
    inline def setWeekNumber(value: /* props */ WeekNumberProps => Element | Null): Self = StObject.set(x, "WeekNumber", js.Any.fromFunction1(value))
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "WeekNumber", js.undefined)
  }
}
