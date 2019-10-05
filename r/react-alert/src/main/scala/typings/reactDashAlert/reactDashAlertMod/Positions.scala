package typings.reactDashAlert.reactDashAlertMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashAlert.reactDashAlertStrings.`bottom center`
import typings.reactDashAlert.reactDashAlertStrings.`bottom left`
import typings.reactDashAlert.reactDashAlertStrings.`bottom right`
import typings.reactDashAlert.reactDashAlertStrings.`middle left`
import typings.reactDashAlert.reactDashAlertStrings.`middle right`
import typings.reactDashAlert.reactDashAlertStrings.`top center`
import typings.reactDashAlert.reactDashAlertStrings.`top left`
import typings.reactDashAlert.reactDashAlertStrings.`top right`
import typings.reactDashAlert.reactDashAlertStrings.middle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Positions extends js.Object {
  var BOTTOM_CENTER: `bottom center`
  var BOTTOM_LEFT: `bottom left`
  var BOTTOM_RIGHT: `bottom right`
  var MIDDLE: middle
  var MIDDLE_LEFT: `middle left`
  var MIDDLE_RIGHT: `middle right`
  var TOP_CENTER: `top center`
  var TOP_LEFT: `top left`
  var TOP_RIGHT: `top right`
}

object Positions {
  @scala.inline
  def apply(
    BOTTOM_CENTER: `bottom center`,
    BOTTOM_LEFT: `bottom left`,
    BOTTOM_RIGHT: `bottom right`,
    MIDDLE: middle,
    MIDDLE_LEFT: `middle left`,
    MIDDLE_RIGHT: `middle right`,
    TOP_CENTER: `top center`,
    TOP_LEFT: `top left`,
    TOP_RIGHT: `top right`
  ): Positions = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER, BOTTOM_LEFT = BOTTOM_LEFT, BOTTOM_RIGHT = BOTTOM_RIGHT, MIDDLE = MIDDLE, MIDDLE_LEFT = MIDDLE_LEFT, MIDDLE_RIGHT = MIDDLE_RIGHT, TOP_CENTER = TOP_CENTER, TOP_LEFT = TOP_LEFT, TOP_RIGHT = TOP_RIGHT)
  
    __obj.asInstanceOf[Positions]
  }
}

@JSImport("react-alert", "positions")
@js.native
object positions extends TopLevel[Positions]

