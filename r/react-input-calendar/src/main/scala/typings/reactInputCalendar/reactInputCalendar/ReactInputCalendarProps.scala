package typings.reactInputCalendar.reactInputCalendar

import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactInputCalendarProps extends js.Object {
  
  /**
    * Define state when date picker would close once the user has clicked on a date.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Format of date for the onChange event. Default on the date format (ISO 8601) to ease the save of data.
    * Allowed Keys: All formats supported by moment.js
    * @default 'MM-DD-YYYY'
    */
  var computableFormat: js.UndefOr[String] = js.native
  
  /**
    * Set initial date value
    * @default current date
    */
  var date: js.UndefOr[String | Date] = js.native
  
  /**
    * If true, the input field gets disabled and the icon next to it disappears.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Format of date, which display in input and set in date property.
    * Allowed Keys: All formats supported by moment.js
    * @default 'MM-DD-YYYY'
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Define the class name of the input field where the date picker represents its value.
    */
  var inputFieldClass: js.UndefOr[String] = js.native
  
  /**
    * Id that should be applied to the input field. Useful when using it with a label element.
    */
  var inputFieldId: js.UndefOr[String] = js.native
  
  /**
    * Set the selectable maximum date
    * @default null
    */
  var maxDate: js.UndefOr[String | Date] = js.native
  
  /**
    * Set the selectable minimum date
    * @default null
    */
  var minDate: js.UndefOr[String | Date] = js.native
  
  /**
    * Set minimal view. Values:
    * 0 - days
    * 1 - months
    * 2 - years.
    * @default 0 (DaysView)
    */
  var minView: js.UndefOr[Double] = js.native
  
  /**
    * Set a function that will be triggered the when input field is blurred. It will return the event and the date in the props.computableFormat format.
    */
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[ReactInputCalendar, Event], 
      /* computableDate */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * Set a function that will be triggered whenever there is a change in the selected date. It will return the date in the props.computableFormat format.
    */
  var onChange: js.UndefOr[js.Function1[/* computableDate */ String, Unit]] = js.native
  
  /**
    * Set a function that will be triggered when the input field is focused.
    */
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[ReactInputCalendar, Event], Unit]] = js.native
  
  /**
    * Setting this value to true makes the calendar widget open when the iput field is focused.
    */
  var openOnInputFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Value to show in the input text box if no date is set.
    */
  var placeholder: js.UndefOr[String] = js.native
}
object ReactInputCalendarProps {
  
  @scala.inline
  def apply(): ReactInputCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactInputCalendarProps]
  }
  
  @scala.inline
  implicit class ReactInputCalendarPropsOps[Self <: ReactInputCalendarProps] (val x: Self) extends AnyVal {
    
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
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    
    @scala.inline
    def setComputableFormat(value: String): Self = this.set("computableFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputableFormat: Self = this.set("computableFormat", js.undefined)
    
    @scala.inline
    def setDate(value: String | Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInputFieldClass(value: String): Self = this.set("inputFieldClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFieldClass: Self = this.set("inputFieldClass", js.undefined)
    
    @scala.inline
    def setInputFieldId(value: String): Self = this.set("inputFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFieldId: Self = this.set("inputFieldId", js.undefined)
    
    @scala.inline
    def setMaxDate(value: String | Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: String | Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinView(value: Double): Self = this.set("minView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinView: Self = this.set("minView", js.undefined)
    
    @scala.inline
    def setOnBlur(
      value: (/* event */ SyntheticEvent[ReactInputCalendar, Event], /* computableDate */ String) => Unit
    ): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* computableDate */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ SyntheticEvent[ReactInputCalendar, Event] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOpenOnInputFocus(value: Boolean): Self = this.set("openOnInputFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnInputFocus: Self = this.set("openOnInputFocus", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
}
