package typings
package reactDashBootstrapLib.reactDashBootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionCallbacks extends js.Object {
  var onEnter: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onEntered: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onEntering: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onExit: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onExited: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onExiting: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
}

object TransitionCallbacks {
  @scala.inline
  def apply(
    onEnter: /* node */ stdLib.HTMLElement => _ = null,
    onEntered: /* node */ stdLib.HTMLElement => _ = null,
    onEntering: /* node */ stdLib.HTMLElement => _ = null,
    onExit: /* node */ stdLib.HTMLElement => _ = null,
    onExited: /* node */ stdLib.HTMLElement => _ = null,
    onExiting: /* node */ stdLib.HTMLElement => _ = null
  ): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    __obj.asInstanceOf[TransitionCallbacks]
  }
}

