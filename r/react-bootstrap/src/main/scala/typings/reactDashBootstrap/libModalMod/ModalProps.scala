package typings.reactDashBootstrap.libModalMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactElement
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends AllHTMLAttributes[Modal]
     with TransitionCallbacks
     with ClassAttributes[Modal] {
  // Optional
  var animation: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  var backdropClassName: js.UndefOr[String] = js.undefined
  var backdropStyle: js.UndefOr[js.Any] = js.undefined
  var backdropTransitionTimeout: js.UndefOr[Double] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerClassName: js.UndefOr[String] = js.undefined
  var dialogClassName: js.UndefOr[String] = js.undefined
  var dialogComponent: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var dialogTransitionTimeout: js.UndefOr[Double] = js.undefined
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
    **/
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  // Required
  var onHide: js.Function
  var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  var restoreFocus: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[ReactElement] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    onHide: js.Function,
    AllHTMLAttributes: AllHTMLAttributes[Modal] = null,
    ClassAttributes: ClassAttributes[Modal] = null,
    TransitionCallbacks: TransitionCallbacks = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdrop: Boolean | String = null,
    backdropClassName: String = null,
    backdropStyle: js.Any = null,
    backdropTransitionTimeout: Int | Double = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    container: js.Any = null,
    containerClassName: String = null,
    dialogClassName: String = null,
    dialogComponent: js.Any = null,
    dialogTransitionTimeout: Int | Double = null,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: /* node */ HTMLElement => _ = null,
    onEscapeKeyDown: /* node */ HTMLElement => _ = null,
    onEscapeKeyUp: /* node */ HTMLElement => _ = null,
    onShow: /* node */ HTMLElement => _ = null,
    restoreFocus: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    transition: ReactElement = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(onHide = onHide)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(onEscapeKeyDown))
    if (onEscapeKeyUp != null) __obj.updateDynamic("onEscapeKeyUp")(js.Any.fromFunction1(onEscapeKeyUp))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(restoreFocus)) __obj.updateDynamic("restoreFocus")(restoreFocus)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[ModalProps]
  }
}

