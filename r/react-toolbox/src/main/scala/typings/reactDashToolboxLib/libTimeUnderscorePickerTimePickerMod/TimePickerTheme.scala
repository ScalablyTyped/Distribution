package typings
package reactDashToolboxLib.libTimeUnderscorePickerTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerTheme extends js.Object {
  /**
    * Added to the number which is active in clock face.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * AM label in dialog header when mode is AM/PM.
    */
  var am: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the dialog when the selected format is AM.
    */
  var amFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wrapper for AM and PM labels in header when mode is AM/PM.
    */
  var ampm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for buttons inside the dialog of the picker.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Clock root class element.
    */
  var clock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wrapper for the proper positioning of the clock.
    */
  var clockWrapper: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the clock face.
    */
  var face: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the clock's hand.
    */
  var hand: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Dialog header wrapper class.
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for hours in dialog header.
    */
  var hours: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the dialog hours are displayed.
    */
  var hoursDisplay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the knob of the hand.
    */
  var knob: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for minutes in dialog header.
    */
  var minutes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the dialog minutes are displayed.
    */
  var minutesDisplay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Each of the numbers in the clock's face.
    */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Placeholder for the clock inside the dialog (inner wrapper).
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * PM label in dialog header when mode is AM/PM.
    */
  var pm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the dialog when the selected format is PM.
    */
  var pmFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is the : separator between hours and minutes in dialog header.
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the knob when no round number is selected.
    */
  var small: js.UndefOr[java.lang.String] = js.undefined
}

object TimePickerTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    am: java.lang.String = null,
    amFormat: java.lang.String = null,
    ampm: java.lang.String = null,
    button: java.lang.String = null,
    clock: java.lang.String = null,
    clockWrapper: java.lang.String = null,
    dialog: java.lang.String = null,
    face: java.lang.String = null,
    hand: java.lang.String = null,
    header: java.lang.String = null,
    hours: java.lang.String = null,
    hoursDisplay: java.lang.String = null,
    input: java.lang.String = null,
    knob: java.lang.String = null,
    minutes: java.lang.String = null,
    minutesDisplay: java.lang.String = null,
    number: java.lang.String = null,
    placeholder: java.lang.String = null,
    pm: java.lang.String = null,
    pmFormat: java.lang.String = null,
    separator: java.lang.String = null,
    small: java.lang.String = null
  ): TimePickerTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (am != null) __obj.updateDynamic("am")(am)
    if (amFormat != null) __obj.updateDynamic("amFormat")(amFormat)
    if (ampm != null) __obj.updateDynamic("ampm")(ampm)
    if (button != null) __obj.updateDynamic("button")(button)
    if (clock != null) __obj.updateDynamic("clock")(clock)
    if (clockWrapper != null) __obj.updateDynamic("clockWrapper")(clockWrapper)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (face != null) __obj.updateDynamic("face")(face)
    if (hand != null) __obj.updateDynamic("hand")(hand)
    if (header != null) __obj.updateDynamic("header")(header)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (hoursDisplay != null) __obj.updateDynamic("hoursDisplay")(hoursDisplay)
    if (input != null) __obj.updateDynamic("input")(input)
    if (knob != null) __obj.updateDynamic("knob")(knob)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes)
    if (minutesDisplay != null) __obj.updateDynamic("minutesDisplay")(minutesDisplay)
    if (number != null) __obj.updateDynamic("number")(number)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pm != null) __obj.updateDynamic("pm")(pm)
    if (pmFormat != null) __obj.updateDynamic("pmFormat")(pmFormat)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (small != null) __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[TimePickerTheme]
  }
}

