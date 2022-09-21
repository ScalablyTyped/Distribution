package typings.rnSwipeablePanel

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barMod {
  
  @JSImport("rn-swipeable-panel/dist/Bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bar(hasBarStyleBarContainerStyle: BarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bar")(hasBarStyleBarContainerStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BarProps extends StObject {
    
    var barContainerStyle: js.UndefOr[js.Object] = js.undefined
    
    var barStyle: js.UndefOr[js.Object] = js.undefined
  }
  object BarProps {
    
    inline def apply(): BarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarProps]
    }
    
    extension [Self <: BarProps](x: Self) {
      
      inline def setBarContainerStyle(value: js.Object): Self = StObject.set(x, "barContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setBarContainerStyleUndefined: Self = StObject.set(x, "barContainerStyle", js.undefined)
      
      inline def setBarStyle(value: js.Object): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    }
  }
}
