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

trait events extends js.Object {
  var BEACON: beacon
  var ERROR: error
  var STEP_AFTER: stepColonafter
  var STEP_BEFORE: stepColonbefore
  var TARGET_NOT_FOUND: errorColontarget_not_found
  var TOOLTIP: tooltip
  var TOOLTIP_CLOSE: close
  var TOUR_END: tourColonend
  var TOUR_START: tourColonstart
  var TOUR_STATUS: tourColonstatus
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
}

