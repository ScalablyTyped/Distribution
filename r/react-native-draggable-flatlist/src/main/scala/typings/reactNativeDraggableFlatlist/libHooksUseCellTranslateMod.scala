package typings.reactNativeDraggableFlatlist

import typings.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseCellTranslateMod {
  
  @JSImport("react-native-draggable-flatlist/lib/hooks/useCellTranslate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellTranslate(param0: Params): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("useCellTranslate")(param0.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  trait Params extends StObject {
    
    var cellIndex: Value
    
    var cellOffset: Value
    
    var cellSize: Value
  }
  object Params {
    
    inline def apply(cellIndex: Value, cellOffset: Value, cellSize: Value): Params = {
      val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], cellOffset = cellOffset.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setCellIndex(value: Value): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellOffset(value: Value): Self = StObject.set(x, "cellOffset", value.asInstanceOf[js.Any])
      
      inline def setCellSize(value: Value): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    }
  }
}
