package typings.rx.Rx.internals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityQueue[TTime] extends js.Object {
  
  def dequeue(): js.Any = js.native
  
  def enqueue(
    item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
  ): Unit = js.native
  
  def heapify(index: Double): Unit = js.native
  
  def isHigherPriority(left: Double, right: Double): Boolean = js.native
  
  var length: Double = js.native
  
  def peek(): js.Any = js.native
  
  def percolate(index: Double): Unit = js.native
  
  def remove(
    item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
  ): Boolean = js.native
  
  def removeAt(index: Double): Unit = js.native
}
object PriorityQueue {
  
  @scala.inline
  def apply[TTime](
    dequeue: () => js.Any,
    enqueue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Unit,
    heapify: Double => Unit,
    isHigherPriority: (Double, Double) => Boolean,
    length: Double,
    peek: () => js.Any,
    percolate: Double => Unit,
    remove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Boolean,
    removeAt: Double => Unit
  ): PriorityQueue[TTime] = {
    val __obj = js.Dynamic.literal(dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), heapify = js.Any.fromFunction1(heapify), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), percolate = js.Any.fromFunction1(percolate), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt))
    __obj.asInstanceOf[PriorityQueue[TTime]]
  }
  
  @scala.inline
  implicit class PriorityQueueOps[Self <: PriorityQueue[_], TTime] (val x: Self with PriorityQueue[TTime]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDequeue(value: () => js.Any): Self = this.set("dequeue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnqueue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Unit
    ): Self = this.set("enqueue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeapify(value: Double => Unit): Self = this.set("heapify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHigherPriority(value: (Double, Double) => Boolean): Self = this.set("isHigherPriority", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeek(value: () => js.Any): Self = this.set("peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPercolate(value: Double => Unit): Self = this.set("percolate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Boolean
    ): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAt(value: Double => Unit): Self = this.set("removeAt", js.Any.fromFunction1(value))
  }
}
