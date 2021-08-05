package typings.restartHooks

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeObserverMod {
  
  @JSImport("@restart/hooks/cjs/useResizeObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TElement /* <: Element */](): Rect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Rect | Null]
  inline def default[TElement /* <: Element */](element: TElement): Rect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Rect | Null]
  
  trait Rect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Rect {
    
    inline def apply(height: Double, width: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
