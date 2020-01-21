package typings.reactInputCalendar.reactInputCalendar

import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInputCalendarProps extends js.Object {
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
      /* event */ SyntheticEvent[ReactInputCalendar, Event_], 
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
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[ReactInputCalendar, Event_], Unit]] = js.undefined
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
  def apply(
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    computableFormat: String = null,
    date: String | Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    inputFieldClass: String = null,
    inputFieldId: String = null,
    maxDate: String | Date = null,
    minDate: String | Date = null,
    minView: Int | Double = null,
    onBlur: (/* event */ SyntheticEvent[ReactInputCalendar, Event_], /* computableDate */ String) => Unit = null,
    onChange: /* computableDate */ String => Unit = null,
    onFocus: /* event */ SyntheticEvent[ReactInputCalendar, Event_] => Unit = null,
    openOnInputFocus: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null
  ): ReactInputCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (computableFormat != null) __obj.updateDynamic("computableFormat")(computableFormat.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputFieldClass != null) __obj.updateDynamic("inputFieldClass")(inputFieldClass.asInstanceOf[js.Any])
    if (inputFieldId != null) __obj.updateDynamic("inputFieldId")(inputFieldId.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minView != null) __obj.updateDynamic("minView")(minView.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (!js.isUndefined(openOnInputFocus)) __obj.updateDynamic("openOnInputFocus")(openOnInputFocus.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactInputCalendarProps]
  }
}

