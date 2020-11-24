package typings.reactMdDialog.dialogMod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.reactMdDialog.reactMdDialogStrings.`full-page`
import typings.reactMdDialog.reactMdDialogStrings.alertdialog
import typings.reactMdDialog.reactMdDialogStrings.centered
import typings.reactMdDialog.reactMdDialogStrings.custom
import typings.reactMdDialog.reactMdDialogStrings.dialog
import typings.reactMdDialog.reactMdDialogStrings.div
import typings.reactMdDialog.reactMdDialogStrings.first
import typings.reactMdDialog.reactMdDialogStrings.last
import typings.reactMdDialog.reactMdDialogStrings.menu
import typings.reactMdDialog.reactMdDialogStrings.nav
import typings.reactMdDialog.reactMdDialogStrings.none
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.reactMdUtils.focusContainerMod.FocusContainerOptionsProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseDialogProps
  extends HTMLAttributes[HTMLDivElement]
     with OverridableCSSTransitionProps
     with RenderConditionalPortalProps
     with FocusContainerOptionsProps {
  
  /**
    * The component to render the dialog as. This really shouldn't be used
    * outside of the `@react-md/layout` and `@react-md/sheet` packages to
    * conditionally render a navigation panel.
    */
  var component: js.UndefOr[div | nav] = js.native
  
  /**
    * An optional className to apply to the dialog container when the `type` is
    * set to `"centered"` or when the `forceContainer` prop is enabled. You
    * probably don't want to use this prop in most cases.
    */
  var containerClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to apply to the dialog container when the `type` is set
    * to `"centered"` or when the `forceContainer` prop is enabled. You probably
    * don't want to use this prop in most cases.
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Either the "first" or "last" string to focus the first or last focusable
    * element within the container or a query selector string to find a focusable
    * element within the container.
    */
  @JSName("defaultFocus")
  var defaultFocus_BaseDialogProps: js.UndefOr[first | last | String] = js.native
  
  /**
    * Boolean if the ability to close the dialog via the escape key should be
    * disabled. You should really not be using this as it breaks accessibility in
    * most cases.
    *
    * Note: When the `modal` prop is enabled, this flag will be considered `true`
    * as well so that the escape keypress no longer closes the dialog.
    */
  var disableEscapeClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the dialog's focus container logic should be disabled. This
    * should normally be kept at the default of `false` unless implementing a
    * custom dialog that does not require consistent user focus.
    */
  var disableFocusContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * The Dialog component will attempt to automatically fix nested dialogs
    * behind the scenes using the `NestedDialogContextProvider` component. This
    * prop will disable that feature if it does not seem to be working as
    * expected.
    */
  var disableNestedDialogFixes: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the dialog should no longer add scroll locking to the page when
    * visible. You normally want this prop to stay `false`, but it is useful when
    * using custom dialogs that are more for popovers and don't require full user
    * attention.
    */
  var disableScrollLock: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the `appear`, `enter`, and `exit` transitions should be disabled
    * for the dialog.  This is just a shortcut so all three of those props don't
    * need to be disabled.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the dialog should be "forcefully" wrapped in the
    * `.md-dialog-container` element. You probably don't want to use this in most
    * cases, but the container element will be used when the `type` prop is set
    * to `"centered"`.
    */
  var forceContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * An id required for a11y for the dialog.
    */
  @JSName("id")
  var id_BaseDialogProps: String = js.native
  
  /**
    * Boolean if the dialog should act as a modal. This means that the user will
    * no longer be able to close the dialog by pressing the escape key or by
    * clicking on the overlay. You will be required to update the dialog to have
    * an action that closes the dialog instead.
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * A function used to close the dialog when the overlay is clicked or the
    * escape key is pressed when the `modal` prop is not enabled.
    */
  def onRequestClose(): Unit = js.native
  
  /**
    * Boolean if there should be an overlay displayed with the sheet. This is
    * recommended/required on mobile devices.
    */
  var overlay: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className to apply to the overlay.
    */
  var overlayClassName: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the overlay should be "hidden" from the user once it's visible
    * be keeping the opacity set to `0`. This is really only used for custom
    * dialogs like the `FixedDialog`.
    */
  var overlayHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional style to apply to the overlay.
    */
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The role for the dialog component. This should normally stay as the default
    * of `"dialog"` **unless** you want the screen reader to interrupt the normal
    * workflow for this message. It is good to set this value to `"alertdialog"`
    * error message confirmations or general confirmation prompts.
    *
    * Note: The `dialog` technically supports being rendered as a `menu`, but
    * this is really only for mobile sheet support and will not provide the menu
    * keyboard functionality automatically.
    */
  @JSName("role")
  var role_BaseDialogProps: js.UndefOr[dialog | alertdialog | menu | none] = js.native
  
  /**
    * The display type for the modal. If you would like to position the modal in
    * different locations within the page, you should set this prop to `"custom"`
    * and add custom styles to position it instead.
    */
  var `type`: js.UndefOr[`full-page` | centered | custom] = js.native
  
  /**
    * Boolean if the dialog is currently visible.
    */
  var visible: Boolean = js.native
}
object BaseDialogProps {
  
  @scala.inline
  def apply(id: String, onRequestClose: () => Unit, visible: Boolean): BaseDialogProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDialogProps]
  }
  
  @scala.inline
  implicit class BaseDialogPropsOps[Self <: BaseDialogProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: div | nav): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFocus: Self = this.set("defaultFocus", js.undefined)
    
    @scala.inline
    def setDisableEscapeClose(value: Boolean): Self = this.set("disableEscapeClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEscapeClose: Self = this.set("disableEscapeClose", js.undefined)
    
    @scala.inline
    def setDisableFocusContainer(value: Boolean): Self = this.set("disableFocusContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFocusContainer: Self = this.set("disableFocusContainer", js.undefined)
    
    @scala.inline
    def setDisableNestedDialogFixes(value: Boolean): Self = this.set("disableNestedDialogFixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNestedDialogFixes: Self = this.set("disableNestedDialogFixes", js.undefined)
    
    @scala.inline
    def setDisableScrollLock(value: Boolean): Self = this.set("disableScrollLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScrollLock: Self = this.set("disableScrollLock", js.undefined)
    
    @scala.inline
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTransition: Self = this.set("disableTransition", js.undefined)
    
    @scala.inline
    def setForceContainer(value: Boolean): Self = this.set("forceContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceContainer: Self = this.set("forceContainer", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayHidden(value: Boolean): Self = this.set("overlayHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayHidden: Self = this.set("overlayHidden", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    
    @scala.inline
    def setRole(value: dialog | alertdialog | menu | none): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setType(value: `full-page` | centered | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
