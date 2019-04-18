package typings
package reactDashHooksDashHelperLib.reactDashHooksDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProps extends js.Object {
  var go: js.UndefOr[js.Function1[/* step */ scala.Double | java.lang.String, scala.Unit]] = js.undefined
  var pause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var previous: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def next(): scala.Unit
}

object NavigationProps {
  @scala.inline
  def apply(
    next: () => scala.Unit,
    go: /* step */ scala.Double | java.lang.String => scala.Unit = null,
    pause: () => scala.Unit = null,
    play: () => scala.Unit = null,
    previous: () => scala.Unit = null
  ): NavigationProps = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    if (go != null) __obj.updateDynamic("go")(js.Any.fromFunction1(go))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction0(play))
    if (previous != null) __obj.updateDynamic("previous")(js.Any.fromFunction0(previous))
    __obj.asInstanceOf[NavigationProps]
  }
}

