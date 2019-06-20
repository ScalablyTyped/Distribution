package typings
package reactDashBootstrapLib.libModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends reactLib.reactMod.HTMLProps[Modal]
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
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  // Required
  var onHide: js.Function
  var onShow: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, _]] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var transition: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    onHide: js.Function,
    HTMLProps: reactLib.reactMod.HTMLProps[Modal] = null,
    TransitionCallbacks: reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks = null,
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: scala.Boolean | java.lang.String = null,
    backdropClassName: java.lang.String = null,
    backdropStyle: js.Any = null,
    backdropTransitionTimeout: scala.Int | scala.Double = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    container: js.Any = null,
    containerClassName: java.lang.String = null,
    dialogClassName: java.lang.String = null,
    dialogComponent: js.Any = null,
    dialogTransitionTimeout: scala.Int | scala.Double = null,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    onBackdropClick: /* node */ stdLib.HTMLElement => _ = null,
    onEscapeKeyUp: /* node */ stdLib.HTMLElement => _ = null,
    onShow: /* node */ stdLib.HTMLElement => _ = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    transition: reactLib.reactMod.ReactElement = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(onHide = onHide)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropStyle != null) __obj.updateDynamic("backdropStyle")(backdropStyle)
    if (backdropTransitionTimeout != null) __obj.updateDynamic("backdropTransitionTimeout")(backdropTransitionTimeout.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (dialogClassName != null) __obj.updateDynamic("dialogClassName")(dialogClassName)
    if (dialogComponent != null) __obj.updateDynamic("dialogComponent")(dialogComponent)
    if (dialogTransitionTimeout != null) __obj.updateDynamic("dialogTransitionTimeout")(dialogTransitionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1(onBackdropClick))
    if (onEscapeKeyUp != null) __obj.updateDynamic("onEscapeKeyUp")(js.Any.fromFunction1(onEscapeKeyUp))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[ModalProps]
  }
}

