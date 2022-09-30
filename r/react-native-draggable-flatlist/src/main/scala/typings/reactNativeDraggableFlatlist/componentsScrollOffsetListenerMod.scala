package typings.reactNativeDraggableFlatlist

import typings.reactNativeReanimated.mod.Animated.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsScrollOffsetListenerMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/components/ScrollOffsetListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasScrollOffsetOnScrollOffsetChange: Props): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasScrollOffsetOnScrollOffsetChange.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  trait Props extends StObject {
    
    def onScrollOffsetChange(offset: Double): Unit
    
    var scrollOffset: SharedValue[Double]
  }
  object Props {
    
    inline def apply(onScrollOffsetChange: Double => Unit, scrollOffset: SharedValue[Double]): Props = {
      val __obj = js.Dynamic.literal(onScrollOffsetChange = js.Any.fromFunction1(onScrollOffsetChange), scrollOffset = scrollOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnScrollOffsetChange(value: Double => Unit): Self = StObject.set(x, "onScrollOffsetChange", js.Any.fromFunction1(value))
      
      inline def setScrollOffset(value: SharedValue[Double]): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    }
  }
}
