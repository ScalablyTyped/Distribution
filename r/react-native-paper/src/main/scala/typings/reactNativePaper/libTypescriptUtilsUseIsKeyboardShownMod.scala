package typings.reactNativePaper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptUtilsUseIsKeyboardShownMod {
  
  @JSImport("react-native-paper/lib/typescript/utils/useIsKeyboardShown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Props extends StObject {
    
    def onHide(): Unit
    
    def onShow(): Unit
  }
  object Props {
    
    inline def apply(onHide: () => Unit, onShow: () => Unit): Props = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    }
  }
}
