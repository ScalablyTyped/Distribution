package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransition extends js.Object {
  var animations: js.Array[OptionsCustomTransitionAnimation]
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object OptionsCustomTransition {
  @scala.inline
  def apply(animations: js.Array[OptionsCustomTransitionAnimation], duration: scala.Int | scala.Double = null): OptionsCustomTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animations")(animations)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransition]
  }
}

