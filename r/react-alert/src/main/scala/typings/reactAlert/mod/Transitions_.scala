package typings.reactAlert.mod

import typings.reactAlert.reactAlertStrings.fade
import typings.reactAlert.reactAlertStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transitions_ extends js.Object {
  var FADE: fade
  var SCALE: scale
}

object Transitions_ {
  @scala.inline
  def apply(FADE: fade, SCALE: scale): Transitions_ = {
    val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transitions_]
  }
}

