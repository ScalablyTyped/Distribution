package typings.reactInputCalendar

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInputCalendar {
  
  type ReactInputCalendar = Component[ReactInputCalendarProps, ReactInputCalendarState, js.Any]
  
  trait ReactInputCalendarProps extends StObject {
    
    /**
      * Define state when date picker would close once the user has clicked on a date.
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format of date for the onChange event. Default on the date format (ISO 8601) to ease the save of data.
      * Allowed Keys: All formats supported by moment.js
      * @default 'MM-DD-YYYY'
      */
    var computableFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Set initial date value
      * @default current date
      */
    var date: js.UndefOr[String | Date] = js.undefined
    
    /**
      * If true, the input field gets disabled and the icon next to it disappears.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format of date, which display in input and set in date property.
      * Allowed Keys: All formats supported by moment.js
      * @default 'MM-DD-YYYY'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Define the class name of the input field where the date picker represents its value.
      */
    var inputFieldClass: js.UndefOr[String] = js.undefined
    
    /**
      * Id that should be applied to the input field. Useful when using it with a label element.
      */
    var inputFieldId: js.UndefOr[String] = js.undefined
    
    /**
      * Set the selectable maximum date
      * @default null
      */
    var maxDate: js.UndefOr[String | Date] = js.undefined
    
    /**
      * Set the selectable minimum date
      * @default null
      */
    var minDate: js.UndefOr[String | Date] = js.undefined
    
    /**
      * Set minimal view. Values:
      * 0 - days
      * 1 - months
      * 2 - years.
      * @default 0 (DaysView)
      */
    var minView: js.UndefOr[Double] = js.undefined
    
    /**
      * Set a function that will be triggered the when input field is blurred. It will return the event and the date in the props.computableFormat format.
      */
    var onBlur: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[ReactInputCalendar, Event], 
          /* computableDate */ String, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Set a function that will be triggered whenever there is a change in the selected date. It will return the date in the props.computableFormat format.
      */
    var onChange: js.UndefOr[js.Function1[/* computableDate */ String, Unit]] = js.undefined
    
    /**
      * Set a function that will be triggered when the input field is focused.
      */
    var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[ReactInputCalendar, Event], Unit]] = js.undefined
    
    /**
      * Setting this value to true makes the calendar widget open when the iput field is focused.
      */
    var openOnInputFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value to show in the input text box if no date is set.
      */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object ReactInputCalendarProps {
    
    @scala.inline
    def apply(): ReactInputCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactInputCalendarProps]
    }
    
    @scala.inline
    implicit class ReactInputCalendarPropsMutableBuilder[Self <: ReactInputCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      @scala.inline
      def setComputableFormat(value: String): Self = StObject.set(x, "computableFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputableFormatUndefined: Self = StObject.set(x, "computableFormat", js.undefined)
      
      @scala.inline
      def setDate(value: String | Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInputFieldClass(value: String): Self = StObject.set(x, "inputFieldClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFieldClassUndefined: Self = StObject.set(x, "inputFieldClass", js.undefined)
      
      @scala.inline
      def setInputFieldId(value: String): Self = StObject.set(x, "inputFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFieldIdUndefined: Self = StObject.set(x, "inputFieldId", js.undefined)
      
      @scala.inline
      def setMaxDate(value: String | Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: String | Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
      
      @scala.inline
      def setOnBlur(
        value: (/* event */ SyntheticEvent[ReactInputCalendar, Event], /* computableDate */ String) => Unit
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* computableDate */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ SyntheticEvent[ReactInputCalendar, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOpenOnInputFocus(value: Boolean): Self = StObject.set(x, "openOnInputFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnInputFocusUndefined: Self = StObject.set(x, "openOnInputFocus", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait ReactInputCalendarState extends StObject
}
