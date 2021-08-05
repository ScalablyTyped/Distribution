package typings.reactMdMenu

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMenuClickMod {
  
  @JSImport("@react-md/menu/types/useMenuClick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMenuClick(hasOnClickOnRequestClose: MenuClickOptions): MouseEventHandler[HTMLDivElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuClick")(hasOnClickOnRequestClose.asInstanceOf[js.Any]).asInstanceOf[MouseEventHandler[HTMLDivElement]]
  
  trait MenuClickOptions extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    def onRequestClose(): Unit
  }
  object MenuClickOptions {
    
    inline def apply(onRequestClose: () => Unit): MenuClickOptions = {
      val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose))
      __obj.asInstanceOf[MenuClickOptions]
    }
    
    extension [Self <: MenuClickOptions](x: Self) {
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    }
  }
}
