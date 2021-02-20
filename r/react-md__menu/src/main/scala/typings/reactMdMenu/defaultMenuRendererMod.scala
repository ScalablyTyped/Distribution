package typings.reactMdMenu

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMenuRendererMod {
  
  @JSImport("@react-md/menu/types/defaultMenuRenderer", "defaultMenuRenderer")
  @js.native
  def defaultMenuRenderer(hasHorizontalChildrenProps: LabelRequiredForA11y[AllInjectedMenuProps]): ReactElement = js.native
  
  @js.native
  trait AllInjectedMenuProps
    extends MenuPositionProps
       with RequiredMenuProps
       with RenderConditionalPortalProps {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AllInjectedMenuProps {
    
    @scala.inline
    def apply(
      children: js.Any,
      controlId: js.Any,
      defaultFocus: js.Any,
      id: js.Any,
      onRequestClose: js.Any,
      visible: js.Any
    ): AllInjectedMenuProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = onRequestClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllInjectedMenuProps]
    }
    
    @scala.inline
    implicit class AllInjectedMenuPropsMutableBuilder[Self <: AllInjectedMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type InjectedMenuProps = LabelRequiredForA11y[AllInjectedMenuProps]
  
  /* Inlined std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'anchor' | 'horizontal' | 'positionOptions' | 'closeOnScroll' | 'closeOnResize'> */
  @js.native
  trait MenuPositionProps extends StObject {
    
    var anchor: js.UndefOr[js.Any] = js.native
    
    var closeOnResize: js.UndefOr[js.Any] = js.native
    
    var closeOnScroll: js.UndefOr[js.Any] = js.native
    
    var horizontal: js.UndefOr[js.Any] = js.native
    
    var positionOptions: js.UndefOr[js.Any] = js.native
  }
  object MenuPositionProps {
    
    @scala.inline
    def apply(): MenuPositionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuPositionProps]
    }
    
    @scala.inline
    implicit class MenuPositionPropsMutableBuilder[Self <: MenuPositionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: js.Any): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setCloseOnResize(value: js.Any): Self = StObject.set(x, "closeOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnResizeUndefined: Self = StObject.set(x, "closeOnResize", js.undefined)
      
      @scala.inline
      def setCloseOnScroll(value: js.Any): Self = StObject.set(x, "closeOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnScrollUndefined: Self = StObject.set(x, "closeOnScroll", js.undefined)
      
      @scala.inline
      def setHorizontal(value: js.Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setPositionOptions(value: js.Any): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
    }
  }
  
  type MenuRenderer = js.Function2[/* props */ InjectedMenuProps, /* items */ js.Array[ValidMenuItem], ReactNode]
  
  /* Inlined std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'id' | 'visible' | 'onRequestClose' | 'controlId' | 'children' | 'defaultFocus'>> */
  @js.native
  trait RequiredMenuProps extends StObject {
    
    var children: js.Any = js.native
    
    var controlId: js.Any = js.native
    
    var defaultFocus: js.Any = js.native
    
    var id: js.Any = js.native
    
    var onRequestClose: js.Any = js.native
    
    var visible: js.Any = js.native
  }
  object RequiredMenuProps {
    
    @scala.inline
    def apply(
      children: js.Any,
      controlId: js.Any,
      defaultFocus: js.Any,
      id: js.Any,
      onRequestClose: js.Any,
      visible: js.Any
    ): RequiredMenuProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = onRequestClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredMenuProps]
    }
    
    @scala.inline
    implicit class RequiredMenuPropsMutableBuilder[Self <: RequiredMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlId(value: js.Any): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocus(value: js.Any): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRequestClose(value: js.Any): Self = StObject.set(x, "onRequestClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: js.Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
