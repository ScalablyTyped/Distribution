package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minHeapMod {
  
  @JSImport("rot-js/lib/MinHeap", "MinHeap")
  @js.native
  open class MinHeap[T] () extends StObject {
    
    def debugPrint(): Unit = js.native
    
    /* private */ var existNode: Any = js.native
    
    def find(v: T): HeapWrapper[T] | Null = js.native
    
    /* private */ var heap: Any = js.native
    
    /* private */ var leftChildNode: Any = js.native
    
    def len(): Double = js.native
    
    def lessThan(a: HeapWrapper[T], b: HeapWrapper[T]): Boolean = js.native
    
    /* private */ var minNode: Any = js.native
    
    /* private */ var parentNode: Any = js.native
    
    def pop(): HeapWrapper[T] = js.native
    
    def push(value: T, key: Double): Unit = js.native
    
    def remove(v: T): Boolean = js.native
    
    /* private */ var rightChildNode: Any = js.native
    
    def shift(v: Double): Unit = js.native
    
    /* private */ var swap: Any = js.native
    
    /* private */ var timestamp: Any = js.native
    
    /* private */ var updateDown: Any = js.native
    
    /* private */ var updateUp: Any = js.native
  }
  
  trait HeapWrapper[T] extends StObject {
    
    var key: Double
    
    var timestamp: Double
    
    var value: T
  }
  object HeapWrapper {
    
    inline def apply[T](key: Double, timestamp: Double, value: T): HeapWrapper[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapWrapper[T]]
    }
    
    extension [Self <: HeapWrapper[?], T](x: Self & HeapWrapper[T]) {
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
