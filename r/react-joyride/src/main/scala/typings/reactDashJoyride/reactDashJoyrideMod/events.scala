package typings.reactDashJoyride.reactDashJoyrideMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashJoyride.reactDashJoyrideStrings.`error:target_not_found`
import typings.reactDashJoyride.reactDashJoyrideStrings.`step:after`
import typings.reactDashJoyride.reactDashJoyrideStrings.`step:before`
import typings.reactDashJoyride.reactDashJoyrideStrings.`tour:end`
import typings.reactDashJoyride.reactDashJoyrideStrings.`tour:start`
import typings.reactDashJoyride.reactDashJoyrideStrings.`tour:status`
import typings.reactDashJoyride.reactDashJoyrideStrings.beacon
import typings.reactDashJoyride.reactDashJoyrideStrings.close
import typings.reactDashJoyride.reactDashJoyrideStrings.error
import typings.reactDashJoyride.reactDashJoyrideStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait events extends js.Object {
  var BEACON: beacon
  var ERROR: error
  var STEP_AFTER: `step:after`
  var STEP_BEFORE: `step:before`
  var TARGET_NOT_FOUND: `error:target_not_found`
  var TOOLTIP: tooltip
  var TOOLTIP_CLOSE: close
  var TOUR_END: `tour:end`
  var TOUR_START: `tour:start`
  var TOUR_STATUS: `tour:status`
}

object events {
  @scala.inline
  def apply(
    BEACON: beacon,
    ERROR: error,
    STEP_AFTER: `step:after`,
    STEP_BEFORE: `step:before`,
    TARGET_NOT_FOUND: `error:target_not_found`,
    TOOLTIP: tooltip,
    TOOLTIP_CLOSE: close,
    TOUR_END: `tour:end`,
    TOUR_START: `tour:start`,
    TOUR_STATUS: `tour:status`
  ): events = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], STEP_AFTER = STEP_AFTER.asInstanceOf[js.Any], STEP_BEFORE = STEP_BEFORE.asInstanceOf[js.Any], TARGET_NOT_FOUND = TARGET_NOT_FOUND.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], TOOLTIP_CLOSE = TOOLTIP_CLOSE.asInstanceOf[js.Any], TOUR_END = TOUR_END.asInstanceOf[js.Any], TOUR_START = TOUR_START.asInstanceOf[js.Any], TOUR_STATUS = TOUR_STATUS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[events]
  }
}

@JSImport("react-joyride", "EVENTS")
@js.native
object EVENTS extends TopLevel[events]

