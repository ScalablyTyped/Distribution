package typings.reactMdMenu

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMenuMod {
  
  @JSImport("@react-md/menu/types/useMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useMenu(
    hasPropRefVisibleControlIdHorizontalPropOnClickPropOnKeyDownPortalledDefaultFocusOnRequestCloseDisableControlClickOkay: MenuOptions
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenu")(hasPropRefVisibleControlIdHorizontalPropOnClickPropOnKeyDownPortalledDefaultFocusOnRequestCloseDisableControlClickOkay.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait MenuOptions extends StObject {
    
    /**
      * The id of the element that controls the menu's visibility. This is required
      * so that the menu won't be closed when the control element is clicked since
      * it'll have it's own toggle functionality built-in already.
      */
    var controlId: String
    
    /**
      * The default focusable element within the menu.
      */
    var defaultFocus: first | last | String
    
    /**
      * Boolean if the close on outside click logic should consider the control
      * element within the menu and not call the `onRequestClose` function when it
      * is been clicked. This should be enabled when creating a context menu but
      * normally should remain `false` otherwise since the control element has it's
      * own toggle logic that conflicts with this close click.
      */
    var disableControlClickOkay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the menu is oriented horizontally instead of vertically.  This
      * will update the keydown handlers to use the `ArrowLeft` and `ArrowRight`
      * keys instead of `ArrowUp` and `ArrrowDown` to navigate.
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional click handler to call when the `Menu` (or any child item) is
      * clicked. This will be merged with the default implementation to close the
      * menu once clicked.
      */
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * An optional keydown handler to call when the `Menu` (or any child item)
      * triggers a keydown event. This will be merged witht he default logic of
      * allowing items to be focused with the arrow keys or closing when the escape
      * or tab key is pressed.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * The function that should close the menu.
      */
    def onRequestClose(): Unit
    
    /**
      * Boolean if the menu has been portalled so that the tab keypress behavior
      * can be fixed since tab order is destroyed when portalling.
      */
    var portalled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional ref to be merged into the menu's required ref handler.
      */
    var ref: js.UndefOr[Ref[HTMLDivElement | Null]] = js.undefined
    
    /**
      * Boolean if the menu is currently visible.
      */
    var visible: Boolean
  }
  object MenuOptions {
    
    @scala.inline
    def apply(
      controlId: String,
      defaultFocus: first | last | String,
      onRequestClose: () => Unit,
      visible: Boolean
    ): MenuOptions = {
      val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuOptions]
    }
    
    @scala.inline
    implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlClickOkay(value: Boolean): Self = StObject.set(x, "disableControlClickOkay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlClickOkayUndefined: Self = StObject.set(x, "disableControlClickOkay", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPortalled(value: Boolean): Self = StObject.set(x, "portalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalledUndefined: Self = StObject.set(x, "portalled", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ (HTMLDivElement | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'onClick' | 'onKeyDown'> */
  @js.native
  trait ReturnValue extends StObject {
    
    var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    def ref(): Unit = js.native
    def ref(instance: HTMLDivElement): Unit = js.native
  }
}
