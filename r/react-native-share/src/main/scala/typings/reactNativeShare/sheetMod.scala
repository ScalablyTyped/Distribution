package typings.reactNativeShare

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetMod {
  
  @JSImport("react-native-share/Sheet", JSImport.Default)
  @js.native
  open class default () extends Sheet
  
  @js.native
  trait Sheet extends Component[SheetProps, SheetState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSheet(newProps: SheetProps): Unit = js.native
  }
  
  trait SheetProps extends StObject {
    
    var children: ReactNode
    
    var visible: Boolean
  }
  object SheetProps {
    
    inline def apply(visible: Boolean): SheetProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetProps]
    }
    
    extension [Self <: SheetProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait SheetState extends StObject {
    
    var bottom: Value
  }
  object SheetState {
    
    inline def apply(bottom: Value): SheetState = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetState]
    }
    
    extension [Self <: SheetState](x: Self) {
      
      inline def setBottom(value: Value): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    }
  }
}
