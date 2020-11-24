package typings.rotJs.minHeapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/MinHeap", "MinHeap")
@js.native
class MinHeap[T] () extends js.Object {
  
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
