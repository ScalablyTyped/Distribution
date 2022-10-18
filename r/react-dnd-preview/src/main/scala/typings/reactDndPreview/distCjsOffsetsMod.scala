package typings.reactDndPreview

import typings.react.mod.RefObject
import typings.reactDnd.distTypesMonitorsMod.DragLayerMonitor
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsOffsetsMod {
  
  @JSImport("react-dnd-preview/dist/cjs/offsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePointerPosition(monitor: DragLayerMonitor[Any], childRef: RefObject[Element]): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointerPosition")(monitor.asInstanceOf[js.Any], childRef.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
