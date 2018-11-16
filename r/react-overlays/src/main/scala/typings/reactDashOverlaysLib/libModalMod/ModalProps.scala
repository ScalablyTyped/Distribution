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
     * A css class or classes for the backdrop component.
     */
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
     * A style object for the backdrop component.
     */
  var backdropStyle: js.UndefOr[js.Object] = js.undefined
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
  var onEscapeKeyUp: js.UndefOr[js.Function] = js.undefined
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

