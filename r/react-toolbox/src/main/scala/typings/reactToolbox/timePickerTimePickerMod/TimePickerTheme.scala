package typings.reactToolbox.timePickerTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerTheme extends js.Object {
  /**
    * Added to the number which is active in clock face.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * AM label in dialog header when mode is AM/PM.
    */
  var am: js.UndefOr[String] = js.native
  /**
    * Added to the dialog when the selected format is AM.
    */
  var amFormat: js.UndefOr[String] = js.native
  /**
    * Wrapper for AM and PM labels in header when mode is AM/PM.
    */
  var ampm: js.UndefOr[String] = js.native
  /**
    * Used for buttons inside the dialog of the picker.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Clock root class element.
    */
  var clock: js.UndefOr[String] = js.native
  /**
    * Wrapper for the proper positioning of the clock.
    */
  var clockWrapper: js.UndefOr[String] = js.native
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[String] = js.native
  /**
    * Used to style the clock face.
    */
  var face: js.UndefOr[String] = js.native
  /**
    * Used for the clock's hand.
    */
  var hand: js.UndefOr[String] = js.native
  /**
    * Dialog header wrapper class.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Used for hours in dialog header.
    */
  var hours: js.UndefOr[String] = js.native
  /**
    * Added to the dialog hours are displayed.
    */
  var hoursDisplay: js.UndefOr[String] = js.native
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for the knob of the hand.
    */
  var knob: js.UndefOr[String] = js.native
  /**
    * Used for minutes in dialog header.
    */
  var minutes: js.UndefOr[String] = js.native
  /**
    * Added to the dialog minutes are displayed.
    */
  var minutesDisplay: js.UndefOr[String] = js.native
  /**
    * Each of the numbers in the clock's face.
    */
  var number: js.UndefOr[String] = js.native
  /**
    * Placeholder for the clock inside the dialog (inner wrapper).
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * PM label in dialog header when mode is AM/PM.
    */
  var pm: js.UndefOr[String] = js.native
  /**
    * Added to the dialog when the selected format is PM.
    */
  var pmFormat: js.UndefOr[String] = js.native
  /**
    * Is the : separator between hours and minutes in dialog header.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Added to the knob when no round number is selected.
    */
  var small: js.UndefOr[String] = js.native
}

object TimePickerTheme {
  @scala.inline
  def apply(): TimePickerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerTheme]
  }
  @scala.inline
  implicit class TimePickerThemeOps[Self <: TimePickerTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAm(value: String): Self = this.set("am", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAm: Self = this.set("am", js.undefined)
    @scala.inline
    def setAmFormat(value: String): Self = this.set("amFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmFormat: Self = this.set("amFormat", js.undefined)
    @scala.inline
    def setAmpm(value: String): Self = this.set("ampm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpm: Self = this.set("ampm", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setClock(value: String): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
    @scala.inline
    def setClockWrapper(value: String): Self = this.set("clockWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockWrapper: Self = this.set("clockWrapper", js.undefined)
    @scala.inline
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setFace(value: String): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    @scala.inline
    def setHand(value: String): Self = this.set("hand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHand: Self = this.set("hand", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    @scala.inline
    def setHoursDisplay(value: String): Self = this.set("hoursDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoursDisplay: Self = this.set("hoursDisplay", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setKnob(value: String): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    @scala.inline
    def setMinutesDisplay(value: String): Self = this.set("minutesDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutesDisplay: Self = this.set("minutesDisplay", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPm(value: String): Self = this.set("pm", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePm: Self = this.set("pm", js.undefined)
    @scala.inline
    def setPmFormat(value: String): Self = this.set("pmFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePmFormat: Self = this.set("pmFormat", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
  
}

