package typings
package reactDashBootstrapLib.libModalMod.ModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libModalMod.Modal]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  // Optional
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  var backdropStyle: js.UndefOr[js.Any] = js.undefined
  var backdropTransitionTimeout: js.UndefOr[scala.Double] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogComponent: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var dialogTransitionTimeout: js.UndefOr[scala.Double] = js.undefined
  var enforceFocus: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  // Required
  var onHide: js.Function
  var onShow: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, _]] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var transition: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
}

