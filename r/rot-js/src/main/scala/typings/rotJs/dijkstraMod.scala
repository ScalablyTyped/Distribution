package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptions
import typings.rotJs.pathPathMod.PassableCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dijkstraMod {
  
  @JSImport("rot-js/lib/path/dijkstra", JSImport.Default)
  @js.native
  class default protected () extends Dijkstra {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
  }
  
  @js.native
  trait Dijkstra
    extends typings.rotJs.pathPathMod.default {
    
    def _add(x: Double, y: Double): Unit = js.native
    def _add(x: Double, y: Double, prev: Item): Unit = js.native
    
    /**
      * Compute a non-cached value
      */
    def _compute(fromX: Double, fromY: Double): Unit = js.native
    
    var _computed: StringDictionary[Item] = js.native
    
    var _todo: js.Array[Item] = js.native
  }
  
  @js.native
  trait Item extends StObject {
    
    var prev: Item | Null = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Item {
    
    @scala.inline
    def apply(x: Double, y: Double): Item = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrev(value: Item): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
