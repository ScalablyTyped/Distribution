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

