package typings.readableStream.mod

import typings.safeBuffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferList[D /* <: Buffer */] extends StObject {
  
  def clear(): Unit = js.native
  
  def concat(n: Double): D = js.native
  
  var head: Entry[D] = js.native
  
  def join(s: js.Any): String = js.native
  
  var length: Double = js.native
  
  def push(v: D): Unit = js.native
  
  def shift(): D = js.native
  
  var tail: Entry[D] = js.native
  
  def unshift(v: D): Unit = js.native
}
object BufferList {
  
  @scala.inline
  def apply[D /* <: Buffer */](
    clear: () => Unit,
    concat: Double => D,
    head: Entry[D],
    join: js.Any => String,
    length: Double,
    push: D => Unit,
    shift: () => D,
    tail: Entry[D],
    unshift: D => Unit
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), concat = js.Any.fromFunction1(concat), head = head.asInstanceOf[js.Any], join = js.Any.fromFunction1(join), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), tail = tail.asInstanceOf[js.Any], unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[BufferList[D]]
  }
  
  @scala.inline
  implicit class BufferListMutableBuilder[Self <: BufferList[_], D /* <: Buffer */] (val x: Self with BufferList[D]) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConcat(value: Double => D): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHead(value: Entry[D]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoin(value: js.Any => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: D => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: () => D): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTail(value: Entry[D]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnshift(value: D => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
  }
}
