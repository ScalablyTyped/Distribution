package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransition extends js.Object {
  var animations: js.Array[OptionsCustomTransitionAnimation]
  var duration: js.UndefOr[Double] = js.undefined
}

object OptionsCustomTransition {
  @scala.inline
  def apply(animations: js.Array[OptionsCustomTransitionAnimation], duration: Int | Double = null): OptionsCustomTransition = {
    val __obj = js.Dynamic.literal(animations = animations)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransition]
  }
}

