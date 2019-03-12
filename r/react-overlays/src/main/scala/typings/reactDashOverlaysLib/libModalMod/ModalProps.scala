package typings
package reactDashOverlaysLib.libModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends reactDashOverlaysLib.reactDashOverlaysMod.TransitionCallbacks
     with reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps {
  /**
    * When `true` The modal will automatically shift focus to itself when it opens, and
    * replace it to the last focused element when it closes. This also
    * works correctly with any Modal children that have the `autoFocus` prop.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include a backdrop component.
    */
  var backdrop: js.UndefOr[scala.Boolean | reactDashOverlaysLib.reactDashOverlaysLibStrings.static] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the backdrop components.
    */
  var backdropTransition: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A css class or set of classes applied to the modal container when the modal is open,
    * and removed when it is closed.
    */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true` The modal will prevent focus from leaving the Modal while open.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var enforceFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Close the modal when escape key is pressed
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A ModalManager instance used to track and manage the state of open
    * Modals. Useful when customizing how modals interact within a container
    */
  var manager: js.UndefOr[reactDashOverlaysLib.libModalManagerMod.namespaced] = js.undefined
  /**
    * A callback fired when the backdrop, if specified, is clicked.
    */
  var onBackdropClick: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when the escape key, if specified in `keyboard`, is pressed.
    */
  var onEscapeKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when either the backdrop is clicked, or the escape key is pressed.
    *
    * The `onHide` callback only signals intent from the Modal,
    * you must actually set the `show` prop to `false` for the Modal to close.
    */
  var onHide: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when the Modal is opening.
    */
  var onShow: js.UndefOr[js.Function] = js.undefined
  /**
    * A function that returns a backdrop component. Useful for custom
    * backdrop rendering.
    *
    * ```js
    *  renderBackdrop={props => <MyBackdrop {...props} />}
    * ```
    */
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * A function that returns the dialog component. Useful for custom
    * rendering. **Note:** the component should make sure to apply the provided ref.
    *
    * ```js
    *  renderDialog={props => <MyDialog {...props} />}
    * ```
    */
  var renderDialog: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    * When `true` The modal will restore focus to previously focused element once
    * modal is hidden
    */
  var restoreFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the visibility of the Modal
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the dialog component.
    */
  var transition: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: scala.Boolean | reactDashOverlaysLib.reactDashOverlaysLibStrings.static = null,
    backdropTransition: reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = null,
    className: java.lang.String = null,
    container: reactLib.reactMod.ReactNs.ReactNode | js.Function = null,
    containerClassName: java.lang.String = null,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    manager: reactDashOverlaysLib.libModalManagerMod.namespaced = null,
    onBackdropClick: js.Function = null,
    onEnter: /* node */ stdLib.HTMLElement => _ = null,
    onEntered: /* node */ stdLib.HTMLElement => _ = null,
    onEntering: /* node */ stdLib.HTMLElement => _ = null,
    onEscapeKeyDown: js.Function = null,
    onExit: /* node */ stdLib.HTMLElement => _ = null,
    onExited: /* node */ stdLib.HTMLElement => _ = null,
    onExiting: /* node */ stdLib.HTMLElement => _ = null,
    onHide: js.Function = null,
    onRendered: js.Function = null,
    onShow: js.Function = null,
    renderBackdrop: /* props */ js.Any => reactLib.reactMod.ReactNs.ReactNode = null,
    renderDialog: /* props */ js.Any => reactLib.reactMod.ReactNs.ReactNode = null,
    restoreFocus: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    transition: reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropTransition != null) __obj.updateDynamic("backdropTransition")(backdropTransition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(onBackdropClick)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(onEscapeKeyDown)
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (renderBackdrop != null) __obj.updateDynamic("renderBackdrop")(js.Any.fromFunction1(renderBackdrop))
    if (renderDialog != null) __obj.updateDynamic("renderDialog")(js.Any.fromFunction1(renderDialog))
    if (!js.isUndefined(restoreFocus)) __obj.updateDynamic("restoreFocus")(restoreFocus)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

