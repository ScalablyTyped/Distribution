package typings.rnSwipeablePanel

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCloseMod {
  
  @JSImport("rn-swipeable-panel/dist/Close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Close(param0: CloseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Close")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CloseProps extends StObject {
    
    var iconStyle: js.UndefOr[js.Object] = js.undefined
    
    def onPress(): Unit
    
    var rootStyle: js.UndefOr[js.Object] = js.undefined
  }
  object CloseProps {
    
    inline def apply(onPress: () => Unit): CloseProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[CloseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseProps] (val x: Self) extends AnyVal {
      
      inline def setIconStyle(value: js.Object): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setRootStyle(value: js.Object): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
    }
  }
}
