package typings.rtree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RTree = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RTree]
  inline def apply(max_node_width: Double): RTree = ^.asInstanceOf[js.Dynamic].apply(max_node_width.asInstanceOf[js.Any]).asInstanceOf[RTree]
  
  @JSImport("rtree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: String): RTree = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RTree]
  
  @js.native
  trait RTree extends StObject {
    
    def bbox(arg1: Any): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Any): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Any, arg3: Double): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Any, arg3: Double, arg4: Double): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Any, arg3: Unit, arg4: Double): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Unit, arg3: Double): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Unit, arg3: Double, arg4: Double): js.Array[Any] = js.native
    def bbox(arg1: Any, arg2: Unit, arg3: Unit, arg4: Double): js.Array[Any] = js.native
    
    def geoJSON(geoJSON: Any): Unit = js.native
    
    def insert(bounds: Rectangle, element: js.Object): Boolean = js.native
    
    def remove(area: Rectangle): js.Array[Any] = js.native
    def remove(area: Rectangle, element: js.Object): js.Array[Any] = js.native
    
    def search(area: Rectangle): js.Array[Any] = js.native
    def search(area: Rectangle, return_node: Boolean): js.Array[Any] = js.native
    def search(area: Rectangle, return_node: Boolean, return_array: js.Array[Any]): js.Array[Any] = js.native
    def search(area: Rectangle, return_node: Unit, return_array: js.Array[Any]): js.Array[Any] = js.native
    
    def toJSON(): String = js.native
    def toJSON(printing: String): String = js.native
    def toJSON(printing: Double): String = js.native
  }
  
  trait Rectangle extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object Rectangle {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): Rectangle = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rectangle]
    }
    
    extension [Self <: Rectangle](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
