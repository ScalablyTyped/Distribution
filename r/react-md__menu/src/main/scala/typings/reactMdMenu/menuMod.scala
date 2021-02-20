package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.reactMdMenu.anon.PickBaseMenuPropshiddenvi
import typings.reactMdMenu.anon.PickBaseMenuPropshiddenviAbout
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.reactMdMenu.reactMdMenuStrings.menu
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactMdUtils.typesMod.PositionWidth
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@react-md/menu/types/Menu", "Menu")
  @js.native
  val Menu: ForwardRefExoticComponent[PickBaseMenuPropshiddenvi | PickBaseMenuPropshiddenviAbout] = js.native
  
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
    implicit class BaseMenuPropsMutableBuilder[Self <: BaseMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setCloseOnResize(value: Boolean): Self = StObject.set(x, "closeOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnResizeUndefined: Self = StObject.set(x, "closeOnResize", js.undefined)
      
      @scala.inline
      def setCloseOnScroll(value: Boolean): Self = StObject.set(x, "closeOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnScrollUndefined: Self = StObject.set(x, "closeOnScroll", js.undefined)
      
      @scala.inline
      def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      @scala.inline
      def setDisableControlClickOkay(value: Boolean): Self = StObject.set(x, "disableControlClickOkay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlClickOkayUndefined: Self = StObject.set(x, "disableControlClickOkay", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPositionOptions(value: MenuPositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
      
      @scala.inline
      def setRole(value: menu): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils.FixedPositionOptions, 'container' | 'element' | 'anchor'> */
  @js.native
  trait MenuPositionOptions extends StObject {
    
    var disableSwapping: js.UndefOr[Boolean] = js.native
    
    var disableVHBounds: js.UndefOr[Boolean] = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var initialY: js.UndefOr[Double] = js.native
    
    var preventOverlap: js.UndefOr[Boolean] = js.native
    
    var transformOrigin: js.UndefOr[Boolean] = js.native
    
    var vhMargin: js.UndefOr[Double] = js.native
    
    var vwMargin: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[PositionWidth] = js.native
    
    var xMargin: js.UndefOr[Double] = js.native
    
    var yMargin: js.UndefOr[Double] = js.native
  }
  object MenuPositionOptions {
    
    @scala.inline
    def apply(): MenuPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuPositionOptions]
    }
    
    @scala.inline
    implicit class MenuPositionOptionsMutableBuilder[Self <: MenuPositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      @scala.inline
      def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVHBoundsUndefined: Self = StObject.set(x, "disableVHBounds", js.undefined)
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      @scala.inline
      def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventOverlapUndefined: Self = StObject.set(x, "preventOverlap", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: Boolean): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      @scala.inline
      def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
      
      @scala.inline
      def setWidth(value: PositionWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
      
      @scala.inline
      def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    }
  }
  
  type MenuProps = LabelRequiredForA11y[BaseMenuProps]
}
