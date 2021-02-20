package typings.reactNativeShare

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetMod {
  
  @JSImport("react-native-share/Sheet", JSImport.Default)
  @js.native
  class default () extends Sheet
  
  @js.native
  trait Sheet
    extends Component[SheetProps, SheetState, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSheet(newProps: SheetProps): Unit = js.native
  }
  
  @js.native
  trait SheetProps extends StObject {
    
    var children: ReactNode = js.native
    
    var visible: Boolean = js.native
  }
  object SheetProps {
    
    @scala.inline
    def apply(visible: Boolean): SheetProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetProps]
    }
    
    @scala.inline
    implicit class SheetPropsMutableBuilder[Self <: SheetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SheetState extends StObject {
    
    var bottom: Value = js.native
  }
  object SheetState {
    
    @scala.inline
    def apply(bottom: Value): SheetState = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetState]
    }
    
    @scala.inline
    implicit class SheetStateMutableBuilder[Self <: SheetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Value): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    }
  }
}
