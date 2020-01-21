package typings.reactToolbox.libTimePickerTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerTheme extends js.Object {
  /**
    * Added to the number which is active in clock face.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * AM label in dialog header when mode is AM/PM.
    */
  var am: js.UndefOr[String] = js.undefined
  /**
    * Added to the dialog when the selected format is AM.
    */
  var amFormat: js.UndefOr[String] = js.undefined
  /**
    * Wrapper for AM and PM labels in header when mode is AM/PM.
    */
  var ampm: js.UndefOr[String] = js.undefined
  /**
    * Used for buttons inside the dialog of the picker.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * Clock root class element.
    */
  var clock: js.UndefOr[String] = js.undefined
  /**
    * Wrapper for the proper positioning of the clock.
    */
  var clockWrapper: js.UndefOr[String] = js.undefined
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[String] = js.undefined
  /**
    * Used to style the clock face.
    */
  var face: js.UndefOr[String] = js.undefined
  /**
    * Used for the clock's hand.
    */
  var hand: js.UndefOr[String] = js.undefined
  /**
    * Dialog header wrapper class.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * Used for hours in dialog header.
    */
  var hours: js.UndefOr[String] = js.undefined
  /**
    * Added to the dialog hours are displayed.
    */
  var hoursDisplay: js.UndefOr[String] = js.undefined
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used for the knob of the hand.
    */
  var knob: js.UndefOr[String] = js.undefined
  /**
    * Used for minutes in dialog header.
    */
  var minutes: js.UndefOr[String] = js.undefined
  /**
    * Added to the dialog minutes are displayed.
    */
  var minutesDisplay: js.UndefOr[String] = js.undefined
  /**
    * Each of the numbers in the clock's face.
    */
  var number: js.UndefOr[String] = js.undefined
  /**
    * Placeholder for the clock inside the dialog (inner wrapper).
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * PM label in dialog header when mode is AM/PM.
    */
  var pm: js.UndefOr[String] = js.undefined
  /**
    * Added to the dialog when the selected format is PM.
    */
  var pmFormat: js.UndefOr[String] = js.undefined
  /**
    * Is the : separator between hours and minutes in dialog header.
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Added to the knob when no round number is selected.
    */
  var small: js.UndefOr[String] = js.undefined
}

object TimePickerTheme {
  @scala.inline
  def apply(
    active: String = null,
    am: String = null,
    amFormat: String = null,
    ampm: String = null,
    button: String = null,
    clock: String = null,
    clockWrapper: String = null,
    dialog: String = null,
    face: String = null,
    hand: String = null,
    header: String = null,
    hours: String = null,
    hoursDisplay: String = null,
    input: String = null,
    knob: String = null,
    minutes: String = null,
    minutesDisplay: String = null,
    number: String = null,
    placeholder: String = null,
    pm: String = null,
    pmFormat: String = null,
    separator: String = null,
    small: String = null
  ): TimePickerTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (am != null) __obj.updateDynamic("am")(am.asInstanceOf[js.Any])
    if (amFormat != null) __obj.updateDynamic("amFormat")(amFormat.asInstanceOf[js.Any])
    if (ampm != null) __obj.updateDynamic("ampm")(ampm.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (clock != null) __obj.updateDynamic("clock")(clock.asInstanceOf[js.Any])
    if (clockWrapper != null) __obj.updateDynamic("clockWrapper")(clockWrapper.asInstanceOf[js.Any])
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (hand != null) __obj.updateDynamic("hand")(hand.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (hoursDisplay != null) __obj.updateDynamic("hoursDisplay")(hoursDisplay.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (minutesDisplay != null) __obj.updateDynamic("minutesDisplay")(minutesDisplay.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (pm != null) __obj.updateDynamic("pm")(pm.asInstanceOf[js.Any])
    if (pmFormat != null) __obj.updateDynamic("pmFormat")(pmFormat.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerTheme]
  }
}

