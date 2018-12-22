package typings
package reactDashInputDashCalendarLib.reactInputCalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactInputCalendarProps extends js.Object {
  /**
          * Define state when date picker would close once the user has clicked on a date.
          */
  var closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Format of date for the onChange event. Default on the date format (ISO 8601) to ease the save of data.
          * Allowed Keys: All formats supported by moment.js
          * @default 'MM-DD-YYYY'
          */
  var computableFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Set initial date value
          * @default current date
          */
  var date: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /**
          * If true, the input field gets disabled and the icon next to it disappears.
          */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Format of date, which display in input and set in date property.
          * Allowed Keys: All formats supported by moment.js
          * @default 'MM-DD-YYYY'
          */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Define the class name of the input field where the date picker represents its value.
          */
  var inputFieldClass: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Id that should be applied to the input field. Useful when using it with a label element.
          */
  var inputFieldId: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Set the selectable maximum date
          * @default null
          */
  var maxDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /**
          * Set the selectable minimum date
          * @default null
          */
  var minDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /**
          * Set minimal view. Values:
          * 0 - days
          * 1 - months
          * 2 - years.
          * @default 0 (DaysView)
          */
  var minView: js.UndefOr[scala.Double] = js.undefined
  /**
          * Set a function that will be triggered the when input field is blurred. It will return the event and the date in the props.computableFormat format.
          */
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[ReactInputCalendar, reactLib.Event], 
      /* computableDate */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /**
          * Set a function that will be triggered whenever there is a change in the selected date. It will return the date in the props.computableFormat format.
          */
  var onChange: js.UndefOr[js.Function1[/* computableDate */ java.lang.String, scala.Unit]] = js.undefined
  /**
          * Set a function that will be triggered when the input field is focused.
          */
  var onFocus: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[ReactInputCalendar, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /**
          * Setting this value to true makes the calendar widget open when the iput field is focused.
          */
  var openOnInputFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Value to show in the input text box if no date is set.
          */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

