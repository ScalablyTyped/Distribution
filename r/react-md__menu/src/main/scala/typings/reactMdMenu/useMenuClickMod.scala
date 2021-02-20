package typings.reactMdMenu

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMenuClickMod {
  
  @JSImport("@react-md/menu/types/useMenuClick", "useMenuClick")
  @js.native
  def useMenuClick(hasOnClickOnRequestClose: MenuClickOptions): MouseEventHandler[HTMLDivElement] = js.native
  
  @js.native
  trait MenuClickOptions extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    def onRequestClose(): Unit = js.native
  }
  object MenuClickOptions {
    
    @scala.inline
    def apply(onRequestClose: () => Unit): MenuClickOptions = {
      val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose))
      __obj.asInstanceOf[MenuClickOptions]
    }
    
    @scala.inline
    implicit class MenuClickOptionsMutableBuilder[Self <: MenuClickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    }
  }
}
