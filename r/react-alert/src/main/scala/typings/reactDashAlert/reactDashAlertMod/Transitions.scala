package typings.reactDashAlert.reactDashAlertMod

import typings.reactDashAlert.reactDashAlertStrings.fade
import typings.reactDashAlert.reactDashAlertStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transitions extends js.Object {
  var FADE: fade
  var SCALE: scale
}

object Transitions {
  @scala.inline
  def apply(FADE: fade, SCALE: scale): Transitions = {
    val __obj = js.Dynamic.literal(FADE = FADE, SCALE = SCALE)
  
    __obj.asInstanceOf[Transitions]
  }
}

