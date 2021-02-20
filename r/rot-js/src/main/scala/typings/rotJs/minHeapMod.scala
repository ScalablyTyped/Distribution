package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minHeapMod {
  
  @JSImport("rot-js/lib/MinHeap", "MinHeap")
  @js.native
  class MinHeap[T] () extends StObject {
    
    def debugPrint(): Unit = js.native
    
    var existNode: js.Any = js.native
    
    def find(v: T): HeapWrapper[T] | Null = js.native
    
    var heap: js.Any = js.native
    
    var leftChildNode: js.Any = js.native
    
    def len(): Double = js.native
    
    def lessThan(a: HeapWrapper[T], b: HeapWrapper[T]): Boolean = js.native
    
    var minNode: js.Any = js.native
    
    var parentNode: js.Any = js.native
    
    def pop(): HeapWrapper[T] = js.native
    
    def push(value: T, key: Double): Unit = js.native
    
    def remove(v: T): Boolean = js.native
    
    var rightChildNode: js.Any = js.native
    
    def shift(v: Double): Unit = js.native
    
    var swap: js.Any = js.native
    
    var timestamp: js.Any = js.native
    
    var updateDown: js.Any = js.native
    
    var updateUp: js.Any = js.native
  }
  
  @js.native
  trait HeapWrapper[T] extends StObject {
    
    var key: Double = js.native
    
    var timestamp: Double = js.native
    
    var value: T = js.native
  }
  object HeapWrapper {
    
    @scala.inline
    def apply[T](key: Double, timestamp: Double, value: T): HeapWrapper[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapWrapper[T]]
    }
    
    @scala.inline
    implicit class HeapWrapperMutableBuilder[Self <: HeapWrapper[_], T] (val x: Self with HeapWrapper[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
