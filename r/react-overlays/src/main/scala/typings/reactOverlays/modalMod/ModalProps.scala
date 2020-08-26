package typings.reactOverlays.modalMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactOverlays.mod.TransitionCallbacks
import typings.reactOverlays.portalMod.PortalProps
import typings.reactOverlays.reactOverlaysStrings.static
import typings.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * When `true` The modal will automatically shift focus to itself when it opens, and
    * replace it to the last focused element when it closes. This also
    * works correctly with any Modal children that have the `autoFocus` prop.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Include a backdrop component.
    */
  var backdrop: js.UndefOr[Boolean | static] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the backdrop components.
    */
  var backdropTransition: js.UndefOr[ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * A css class or set of classes applied to the modal container when the modal is open,
    * and removed when it is closed.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * When `true` The modal will prevent focus from leaving the Modal while open.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * Close the modal when escape key is pressed
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * A ModalManager instance used to track and manage the state of open
    * Modals. Useful when customizing how modals interact within a container
    */
  var manager: js.UndefOr[typings.reactOverlays.modalManagerMod.^] = js.native
  /**
    * A callback fired when the backdrop, if specified, is clicked.
    */
  var onBackdropClick: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when the escape key, if specified in `keyboard`, is pressed.
    */
  var onEscapeKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when either the backdrop is clicked, or the escape key is pressed.
    *
    * The `onHide` callback only signals intent from the Modal,
    * you must actually set the `show` prop to `false` for the Modal to close.
    */
  var onHide: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when the Modal is opening.
    */
  var onShow: js.UndefOr[js.Function] = js.native
  /**
    * A function that returns a backdrop component. Useful for custom
    * backdrop rendering.
    *
    * ```js
    *  renderBackdrop={props => <MyBackdrop {...props} />}
    * ```
    */
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ js.Any, ReactNode]] = js.native
  /**
    * A function that returns the dialog component. Useful for custom
    * rendering. **Note:** the component should make sure to apply the provided ref.
    *
    * ```js
    *  renderDialog={props => <MyDialog {...props} />}
    * ```
    */
  var renderDialog: js.UndefOr[js.Function1[/* props */ js.Any, ReactNode]] = js.native
  /**
    * When `true` The modal will restore focus to previously focused element once
    * modal is hidden
    */
  var restoreFocus: js.UndefOr[Boolean] = js.native
  /**
    * Set the visibility of the Modal
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the dialog component.
    */
  var transition: js.UndefOr[ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackdrop(value: Boolean | static): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setBackdropTransition(value: ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]): Self = this.set("backdropTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropTransition: Self = this.set("backdropTransition", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setManager(value: typings.reactOverlays.modalManagerMod.^): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setOnBackdropClick(value: js.Function): Self = this.set("onBackdropClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBackdropClick: Self = this.set("onBackdropClick", js.undefined)
    @scala.inline
    def setOnEscapeKeyDown(value: js.Function): Self = this.set("onEscapeKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEscapeKeyDown: Self = this.set("onEscapeKeyDown", js.undefined)
    @scala.inline
    def setOnHide(value: js.Function): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: js.Function): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setRenderBackdrop(value: /* props */ js.Any => ReactNode): Self = this.set("renderBackdrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderBackdrop: Self = this.set("renderBackdrop", js.undefined)
    @scala.inline
    def setRenderDialog(value: /* props */ js.Any => ReactNode): Self = this.set("renderDialog", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderDialog: Self = this.set("renderDialog", js.undefined)
    @scala.inline
    def setRestoreFocus(value: Boolean): Self = this.set("restoreFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTransition(value: ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

