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
    onEnter: js.Function0[scala.Unit] = null,
    onEntered: js.Function0[scala.Unit] = null,
    onEntering: js.Function0[scala.Unit] = null,
    onExit: js.Function0[scala.Unit] = null,
    onExited: js.Function0[scala.Unit] = null,
    onExiting: js.Function0[scala.Unit] = null
  ): Transition = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    __obj.asInstanceOf[Transition]
  }
}

