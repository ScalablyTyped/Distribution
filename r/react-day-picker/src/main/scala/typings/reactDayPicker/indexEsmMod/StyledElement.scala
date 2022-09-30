package typings.reactDayPicker.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The style (either via class names or via in-line styles) of an element. */
trait StyledElement[T] extends StObject {
  
  /** The buttons. */
  val button: T
  
  /** The style for resetting the buttons. */
  val button_reset: T
  
  /** The caption (showing the calendar heading and the navigation) */
  val caption: T
  
  /** The caption when between two months (when `multipleMonths > 2`). */
  val caption_between: T
  
  /** The drop-downs container. */
  val caption_dropdowns: T
  
  /** The caption when at the end of a series of months. */
  val caption_end: T
  
  /** The caption label. */
  val caption_label: T
  
  /** The caption when at the start of a series of months. */
  val caption_start: T
  
  /** The table cell containing the day element. */
  val cell: T
  
  /** The day element: it is a `span` when not interactive, a `button` otherwise. */
  val day: T
  
  /** The day when disabled. */
  val day_disabled: T
  
  /** The day when hidden. */
  val day_hidden: T
  
  /** The day when outside the month. */
  val day_outside: T
  
  /** The day when at the end of a selected range. */
  val day_range_end: T
  
  /** The day in the middle of a selected range: it does not include the "from" and the "to" days. */
  val day_range_middle: T
  
  /** The day when at the start of a selected range. */
  val day_range_start: T
  
  /** The day when selected. */
  val day_selected: T
  
  /** The day when today. */
  val day_today: T
  
  /** The drop-down (select) element. */
  val dropdown: T
  
  /** The drop-down icon. */
  val dropdown_icon: T
  
  /** The drop-down to change the month. */
  val dropdown_month: T
  
  /** The drop-down to change the year. */
  val dropdown_year: T
  
  /** The table’s head. */
  val head: T
  
  /** The head cell. */
  val head_cell: T
  
  /** The row in the head. */
  val head_row: T
  
  /** The table wrapper. */
  val month: T
  
  /** The months wrapper. */
  val months: T
  
  /** The root element when `numberOfMonths > 1`. */
  val multiple_months: T
  
  /** The navigation container. */
  val nav: T
  
  /** The navigation button. */
  val nav_button: T
  
  /** The "next month" navigation button. */
  val nav_button_next: T
  
  /** The "previous month" navigation button. */
  val nav_button_previous: T
  
  /** The icon for the navigation button. */
  val nav_icon: T
  
  /** The root element. */
  val root: T
  
  /** The table’s row. */
  val row: T
  
  /** Table containing the monthly calendar. */
  val table: T
  
  /** The table body. */
  val tbody: T
  
  /** The table footer. */
  val tfoot: T
  
  /** The style of an element visually hidden. */
  val vhidden: T
  
  /** The weeknumber displayed in the column. */
  val weeknumber: T
  
  /** The root element when `showWeekNumber={true}`. */
  val with_weeknumber: T
}
object StyledElement {
  
  inline def apply[T](
    button: T,
    button_reset: T,
    caption: T,
    caption_between: T,
    caption_dropdowns: T,
    caption_end: T,
    caption_label: T,
    caption_start: T,
    cell: T,
    day: T,
    day_disabled: T,
    day_hidden: T,
    day_outside: T,
    day_range_end: T,
    day_range_middle: T,
    day_range_start: T,
    day_selected: T,
    day_today: T,
    dropdown: T,
    dropdown_icon: T,
    dropdown_month: T,
    dropdown_year: T,
    head: T,
    head_cell: T,
    head_row: T,
    month: T,
    months: T,
    multiple_months: T,
    nav: T,
    nav_button: T,
    nav_button_next: T,
    nav_button_previous: T,
    nav_icon: T,
    root: T,
    row: T,
    table: T,
    tbody: T,
    tfoot: T,
    vhidden: T,
    weeknumber: T,
    with_weeknumber: T
  ): StyledElement[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], button_reset = button_reset.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_between = caption_between.asInstanceOf[js.Any], caption_dropdowns = caption_dropdowns.asInstanceOf[js.Any], caption_end = caption_end.asInstanceOf[js.Any], caption_label = caption_label.asInstanceOf[js.Any], caption_start = caption_start.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], day_disabled = day_disabled.asInstanceOf[js.Any], day_hidden = day_hidden.asInstanceOf[js.Any], day_outside = day_outside.asInstanceOf[js.Any], day_range_end = day_range_end.asInstanceOf[js.Any], day_range_middle = day_range_middle.asInstanceOf[js.Any], day_range_start = day_range_start.asInstanceOf[js.Any], day_selected = day_selected.asInstanceOf[js.Any], day_today = day_today.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], dropdown_icon = dropdown_icon.asInstanceOf[js.Any], dropdown_month = dropdown_month.asInstanceOf[js.Any], dropdown_year = dropdown_year.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], head_cell = head_cell.asInstanceOf[js.Any], head_row = head_row.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], multiple_months = multiple_months.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], nav_button = nav_button.asInstanceOf[js.Any], nav_button_next = nav_button_next.asInstanceOf[js.Any], nav_button_previous = nav_button_previous.asInstanceOf[js.Any], nav_icon = nav_icon.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], vhidden = vhidden.asInstanceOf[js.Any], weeknumber = weeknumber.asInstanceOf[js.Any], with_weeknumber = with_weeknumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledElement[T]]
  }
  
  extension [Self <: StyledElement[?], T](x: Self & StyledElement[T]) {
    
    inline def setButton(value: T): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButton_reset(value: T): Self = StObject.set(x, "button_reset", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: T): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaption_between(value: T): Self = StObject.set(x, "caption_between", value.asInstanceOf[js.Any])
    
    inline def setCaption_dropdowns(value: T): Self = StObject.set(x, "caption_dropdowns", value.asInstanceOf[js.Any])
    
    inline def setCaption_end(value: T): Self = StObject.set(x, "caption_end", value.asInstanceOf[js.Any])
    
    inline def setCaption_label(value: T): Self = StObject.set(x, "caption_label", value.asInstanceOf[js.Any])
    
    inline def setCaption_start(value: T): Self = StObject.set(x, "caption_start", value.asInstanceOf[js.Any])
    
    inline def setCell(value: T): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setDay(value: T): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDay_disabled(value: T): Self = StObject.set(x, "day_disabled", value.asInstanceOf[js.Any])
    
    inline def setDay_hidden(value: T): Self = StObject.set(x, "day_hidden", value.asInstanceOf[js.Any])
    
    inline def setDay_outside(value: T): Self = StObject.set(x, "day_outside", value.asInstanceOf[js.Any])
    
    inline def setDay_range_end(value: T): Self = StObject.set(x, "day_range_end", value.asInstanceOf[js.Any])
    
    inline def setDay_range_middle(value: T): Self = StObject.set(x, "day_range_middle", value.asInstanceOf[js.Any])
    
    inline def setDay_range_start(value: T): Self = StObject.set(x, "day_range_start", value.asInstanceOf[js.Any])
    
    inline def setDay_selected(value: T): Self = StObject.set(x, "day_selected", value.asInstanceOf[js.Any])
    
    inline def setDay_today(value: T): Self = StObject.set(x, "day_today", value.asInstanceOf[js.Any])
    
    inline def setDropdown(value: T): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdown_icon(value: T): Self = StObject.set(x, "dropdown_icon", value.asInstanceOf[js.Any])
    
    inline def setDropdown_month(value: T): Self = StObject.set(x, "dropdown_month", value.asInstanceOf[js.Any])
    
    inline def setDropdown_year(value: T): Self = StObject.set(x, "dropdown_year", value.asInstanceOf[js.Any])
    
    inline def setHead(value: T): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHead_cell(value: T): Self = StObject.set(x, "head_cell", value.asInstanceOf[js.Any])
    
    inline def setHead_row(value: T): Self = StObject.set(x, "head_row", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: T): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: T): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMultiple_months(value: T): Self = StObject.set(x, "multiple_months", value.asInstanceOf[js.Any])
    
    inline def setNav(value: T): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNav_button(value: T): Self = StObject.set(x, "nav_button", value.asInstanceOf[js.Any])
    
    inline def setNav_button_next(value: T): Self = StObject.set(x, "nav_button_next", value.asInstanceOf[js.Any])
    
    inline def setNav_button_previous(value: T): Self = StObject.set(x, "nav_button_previous", value.asInstanceOf[js.Any])
    
    inline def setNav_icon(value: T): Self = StObject.set(x, "nav_icon", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: T): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setTable(value: T): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTbody(value: T): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
    
    inline def setTfoot(value: T): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
    
    inline def setVhidden(value: T): Self = StObject.set(x, "vhidden", value.asInstanceOf[js.Any])
    
    inline def setWeeknumber(value: T): Self = StObject.set(x, "weeknumber", value.asInstanceOf[js.Any])
    
    inline def setWith_weeknumber(value: T): Self = StObject.set(x, "with_weeknumber", value.asInstanceOf[js.Any])
  }
}
