package typings.reactNativeDraggableFlatlist

import typings.reactNativeDraggableFlatlist.anon.ReadonlySharedValuenumber
import typings.reactNativeReanimated.mod.Animated.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksUseCellTranslateMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/hooks/useCellTranslate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellTranslate(hasCellIndexCellSizeCellOffset: Params): ReadonlySharedValuenumber = ^.asInstanceOf[js.Dynamic].applyDynamic("useCellTranslate")(hasCellIndexCellSizeCellOffset.asInstanceOf[js.Any]).asInstanceOf[ReadonlySharedValuenumber]
  
  trait Params extends StObject {
    
    var cellIndex: SharedValue[Double]
    
    var cellOffset: SharedValue[Double]
    
    var cellSize: SharedValue[Double]
  }
  object Params {
    
    inline def apply(cellIndex: SharedValue[Double], cellOffset: SharedValue[Double], cellSize: SharedValue[Double]): Params = {
      val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], cellOffset = cellOffset.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setCellIndex(value: SharedValue[Double]): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellOffset(value: SharedValue[Double]): Self = StObject.set(x, "cellOffset", value.asInstanceOf[js.Any])
      
      inline def setCellSize(value: SharedValue[Double]): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    }
  }
}
