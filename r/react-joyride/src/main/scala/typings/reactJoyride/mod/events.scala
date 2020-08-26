package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.beacon
import typings.reactJoyride.reactJoyrideStrings.close
import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.errorColontarget_not_found
import typings.reactJoyride.reactJoyrideStrings.stepColonafter
import typings.reactJoyride.reactJoyrideStrings.stepColonbefore
import typings.reactJoyride.reactJoyrideStrings.tooltip
import typings.reactJoyride.reactJoyrideStrings.tourColonend
import typings.reactJoyride.reactJoyrideStrings.tourColonstart
import typings.reactJoyride.reactJoyrideStrings.tourColonstatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait events extends js.Object {
  var BEACON: beacon = js.native
  var ERROR: error = js.native
  var STEP_AFTER: stepColonafter = js.native
  var STEP_BEFORE: stepColonbefore = js.native
  var TARGET_NOT_FOUND: errorColontarget_not_found = js.native
  var TOOLTIP: tooltip = js.native
  var TOOLTIP_CLOSE: close = js.native
  var TOUR_END: tourColonend = js.native
  var TOUR_START: tourColonstart = js.native
  var TOUR_STATUS: tourColonstatus = js.native
}

object events {
  @scala.inline
  def apply(
    BEACON: beacon,
    ERROR: error,
    STEP_AFTER: stepColonafter,
    STEP_BEFORE: stepColonbefore,
    TARGET_NOT_FOUND: errorColontarget_not_found,
    TOOLTIP: tooltip,
    TOOLTIP_CLOSE: close,
    TOUR_END: tourColonend,
    TOUR_START: tourColonstart,
    TOUR_STATUS: tourColonstatus
  ): events = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], STEP_AFTER = STEP_AFTER.asInstanceOf[js.Any], STEP_BEFORE = STEP_BEFORE.asInstanceOf[js.Any], TARGET_NOT_FOUND = TARGET_NOT_FOUND.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], TOOLTIP_CLOSE = TOOLTIP_CLOSE.asInstanceOf[js.Any], TOUR_END = TOUR_END.asInstanceOf[js.Any], TOUR_START = TOUR_START.asInstanceOf[js.Any], TOUR_STATUS = TOUR_STATUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[events]
  }
  @scala.inline
  implicit class eventsOps[Self <: events] (val x: Self) extends AnyVal {
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
    def setBEACON(value: beacon): Self = this.set("BEACON", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: error): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTEP_AFTER(value: stepColonafter): Self = this.set("STEP_AFTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTEP_BEFORE(value: stepColonbefore): Self = this.set("STEP_BEFORE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTARGET_NOT_FOUND(value: errorColontarget_not_found): Self = this.set("TARGET_NOT_FOUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLTIP(value: tooltip): Self = this.set("TOOLTIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLTIP_CLOSE(value: close): Self = this.set("TOOLTIP_CLOSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOUR_END(value: tourColonend): Self = this.set("TOUR_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOUR_START(value: tourColonstart): Self = this.set("TOUR_START", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOUR_STATUS(value: tourColonstatus): Self = this.set("TOUR_STATUS", value.asInstanceOf[js.Any])
  }
  
}

