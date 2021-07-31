package typings.reactNativeShareMenu

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-share-menu", JSImport.Default)
  @js.native
  val default: ShareMenu = js.native
  
  trait ShareMenu extends StObject {
    
    def clearSharedText(): Unit
    
    def getSharedText(callback: js.Function1[/* text */ String, Unit]): Unit
  }
  object ShareMenu {
    
    @JSImport("react-native-share-menu", "ShareMenu")
    @js.native
    val ^ : ShareMenu = js.native
    
    @scala.inline
    implicit class ShareMenuMutableBuilder[Self <: ShareMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearSharedText(value: () => Unit): Self = StObject.set(x, "clearSharedText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSharedText(value: js.Function1[/* text */ String, Unit] => Unit): Self = StObject.set(x, "getSharedText", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ShareMenu
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShareMenu = default
}
