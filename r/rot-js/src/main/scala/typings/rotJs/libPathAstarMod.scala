package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptions
import typings.rotJs.libPathPathMod.PassableCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathAstarMod {
  
  @JSImport("rot-js/lib/path/astar", JSImport.Default)
  @js.native
  open class default protected () extends AStar {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
  }
  
  @js.native
  trait AStar
    extends typings.rotJs.libPathPathMod.default {
    
    def _add(x: Double, y: Double): Unit = js.native
    def _add(x: Double, y: Double, prev: Item): Unit = js.native
    
    def _distance(x: Double, y: Double): Double = js.native
    
    var _done: StringDictionary[Item] = js.native
    
    var _fromX: Double = js.native
    
    var _fromY: Double = js.native
    
    var _todo: js.Array[Item] = js.native
  }
  
  trait Item extends StObject {
    
    var g: Double
    
    var h: Double
    
    var prev: Item | Null
    
    var x: Double
    
    var y: Double
  }
  object Item {
    
    inline def apply(g: Double, h: Double, x: Double, y: Double): Item = {
      val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], prev = null)
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Item): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
