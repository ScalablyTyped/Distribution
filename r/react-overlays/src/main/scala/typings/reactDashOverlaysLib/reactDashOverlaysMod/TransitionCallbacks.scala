package typings
package reactDashOverlaysLib.reactDashOverlaysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionCallbacks extends js.Object {
  /**
    * Callback fired before the Overlay transitions in
    */
  var onEnter: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning in
    */
  var onEntered: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition in
    */
  var onEntering: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  /**
    * Callback fired right before the Overlay transitions out
    */
  var onExit: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning out
    */
  var onExited: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition out
    */
  var onExiting: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
}

object TransitionCallbacks {
  @scala.inline
  def apply(
    onEnter: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntered: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntering: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExit: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExited: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExiting: js.Function1[/* node */ reactLib.HTMLElement, _] = null
  ): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    __obj.asInstanceOf[TransitionCallbacks]
  }
}

