package typings.reactDashJoyride.reactDashJoyrideMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashJoyride.reactDashJoyrideStrings.beacon
import typings.reactDashJoyride.reactDashJoyrideStrings.complete
import typings.reactDashJoyride.reactDashJoyrideStrings.error
import typings.reactDashJoyride.reactDashJoyrideStrings.init
import typings.reactDashJoyride.reactDashJoyrideStrings.ready
import typings.reactDashJoyride.reactDashJoyrideStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait lifecycle extends js.Object {
  var BEACON: beacon
  var COMPLETE: complete
  var ERROR: error
  var INIT: init
  var READY: ready
  var TOOLTIP: tooltip
}

object lifecycle {
  @scala.inline
  def apply(BEACON: beacon, COMPLETE: complete, ERROR: error, INIT: init, READY: ready, TOOLTIP: tooltip): lifecycle = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], COMPLETE = COMPLETE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INIT = INIT.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[lifecycle]
  }
}

@JSImport("react-joyride", "LIFECYCLE")
@js.native
object LIFECYCLE extends TopLevel[lifecycle]

