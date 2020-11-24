package typings.reactMdMenu.menuMod

import typings.react.mod.HTMLAttributes
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.reactMdMenu.reactMdMenuStrings.menu
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMenuProps
  extends HTMLAttributes[HTMLDivElement]
     with OverridableCSSTransitionProps
     with RenderConditionalPortalProps {
  
  /**
    * The positioning anchor for the menu relative to the button/control that
    * owns the menu.  This is used for the positioning logic as well as modifying
    * the animationg slightly to originate from a coordinate. When this is
    * omitted, it will default to:
    *
    * ```ts
    * const verticalAnchor = {
    *   x: "inner-right",
    *   y: "top",
    * };
    *
    * const horizontalAnchor = {
    *   x: "center",
    *   y: "center",
    * };
    * ```
    */
  var anchor: js.UndefOr[PositionAnchor] = js.native
  
  /**
    * Boolean if the menu should no longer close when the page is resized.
    * Instead, it'll automatically update its position within the viewport.
    */
  var closeOnResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the menu should not be closed when the page is scrolled.
    * Instead, it'll automatically update its position within the viewport. You
    * normally don't want to enable this prop as the menu won't close if the menu
    * control element is no longer in the viewport.
    */
  var closeOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of the control element that toggles the menu. This is required so
    * that the menu can be positioned to this element and is normally a
    * `<button>`.
    */
  var controlId: String = js.native
  
  /**
    * The element that should be focused first when opened. This can either be
    * the first or last focusable item in the menu, or a query selector string to
    * find an element.
    */
  var defaultFocus: js.UndefOr[first | last | String] = js.native
  
  /**
    * Boolean if the close on outside click logic should consider the control
    * element within the menu and not call the `onRequestClose` function when it
    * is been clicked. This should be enabled when creating a context menu but
    * normally should remain `false` otherwise since the control element has it's
    * own toggle logic that conflicts with this close click.
    */
  var disableControlClickOkay: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the menu should be rendered horizontally instead of vertically.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * The id for the menu. This is required for a11y.
    */
  @JSName("id")
  var id_BaseMenuProps: String = js.native
  
  /**
    * A function to call that should set the `visible` prop to false.
    */
  def onRequestClose(): Unit = js.native
  
  /**
    * Optional options to pass down to the `useFixedPositionin` hook styles to
    * change how the menu is fixed to the `MenuButton`.
    */
  var positionOptions: js.UndefOr[MenuPositionOptions] = js.native
  
  /**
    * The role for the menu. This should normally just be `"menu"`, but I might
    * expand on it to implement the `"listbox"` or other menu like widgets.
    */
  @JSName("role")
  var role_BaseMenuProps: js.UndefOr[menu] = js.native
  
  /**
    * Boolean if the menu is currently visible.
    */
  var visible: Boolean = js.native
}
object BaseMenuProps {
  
  @scala.inline
  def apply(controlId: String, id: String, onRequestClose: () => Unit, visible: Boolean): BaseMenuProps = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuProps]
  }
  
  @scala.inline
  implicit class BaseMenuPropsOps[Self <: BaseMenuProps] (val x: Self) extends AnyVal {
    
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
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: PositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setCloseOnResize(value: Boolean): Self = this.set("closeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnResize: Self = this.set("closeOnResize", js.undefined)
    
    @scala.inline
    def setCloseOnScroll(value: Boolean): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    
    @scala.inline
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFocus: Self = this.set("defaultFocus", js.undefined)
    
    @scala.inline
    def setDisableControlClickOkay(value: Boolean): Self = this.set("disableControlClickOkay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableControlClickOkay: Self = this.set("disableControlClickOkay", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setPositionOptions(value: MenuPositionOptions): Self = this.set("positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionOptions: Self = this.set("positionOptions", js.undefined)
    
    @scala.inline
    def setRole(value: menu): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
