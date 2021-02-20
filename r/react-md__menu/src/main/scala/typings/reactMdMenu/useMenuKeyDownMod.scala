package typings.reactMdMenu

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMenuKeyDownMod {
  
  @JSImport("@react-md/menu/types/useMenuKeyDown", "useMenuKeyDown")
  @js.native
  def useMenuKeyDown(hasMenuOnKeyDownOnRequestClosePortalledHorizontalDefaultFocus: MenuKeyDownOptions): KeyboardEventHandler[HTMLDivElement] = js.native
  
  @js.native
  trait MenuKeyDownOptions extends StObject {
    
    var defaultFocus: String = js.native
    
    var horizontal: Boolean = js.native
    
    var menu: HTMLDivElement | Null = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    def onRequestClose(): Unit = js.native
    
    var portalled: Boolean = js.native
  }
  object MenuKeyDownOptions {
    
    @scala.inline
    def apply(defaultFocus: String, horizontal: Boolean, onRequestClose: () => Unit, portalled: Boolean): MenuKeyDownOptions = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), portalled = portalled.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuKeyDownOptions]
    }
    
    @scala.inline
    implicit class MenuKeyDownOptionsMutableBuilder[Self <: MenuKeyDownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenu(value: HTMLDivElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuNull: Self = StObject.set(x, "menu", null)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPortalled(value: Boolean): Self = StObject.set(x, "portalled", value.asInstanceOf[js.Any])
    }
  }
}
