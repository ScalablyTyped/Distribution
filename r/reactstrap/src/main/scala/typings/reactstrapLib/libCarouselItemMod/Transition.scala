package typings
package reactstrapLib.libCarouselItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  var onEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Transition {
  @scala.inline
  def apply(
    onEnter: () => scala.Unit = null,
    onEntered: () => scala.Unit = null,
    onEntering: () => scala.Unit = null,
    onExit: () => scala.Unit = null,
    onExited: () => scala.Unit = null,
    onExiting: () => scala.Unit = null
  ): Transition = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction0(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction0(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction0(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction0(onExiting))
    __obj.asInstanceOf[Transition]
  }
}

