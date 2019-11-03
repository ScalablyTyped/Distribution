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

@JSImport("react-joyride", "LIFECYCLE")
@js.native
object LIFECYCLE extends TopLevel[lifecycle]

object lifecycle {
  @scala.inline
  def apply(BEACON: beacon, COMPLETE: complete, ERROR: error, INIT: init, READY: ready, TOOLTIP: tooltip): lifecycle = {
    val __obj = js.Dynamic.literal(BEACON = BEACON, COMPLETE = COMPLETE, ERROR = ERROR, INIT = INIT, READY = READY, TOOLTIP = TOOLTIP)
  
    __obj.asInstanceOf[lifecycle]
  }
}

