package typings.rotJs.eventqueueMod

import typings.rotJs.minHeapMod.MinHeap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventQueue[T] extends js.Object {
  
  var _events: MinHeap[T] = js.native
  
  var _time: Double = js.native
  
  /**
    * @param {?} event
    * @param {number} time
    */
  def add(event: T, time: Double): Unit = js.native
  
  /**
    * Clear all scheduled events
    */
  def clear(): this.type = js.native
  
  /**
    * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
    * @returns {? || null} The event previously added by addEvent, null if no event available
    */
  def get(): T | Null = js.native
  
  /**
    * Get the time associated with the given event
    * @param {?} event
    * @returns {number} time
    */
  def getEventTime(event: T): js.UndefOr[Double] = js.native
  
  /**
    * @returns {number} Elapsed time
    */
  def getTime(): Double = js.native
  
  /**
    * Remove an event from the queue
    * @param {?} event
    * @returns {bool} success?
    */
  def remove(event: T): Boolean = js.native
}
object EventQueue {
  
  @scala.inline
  def apply[T](
    _events: MinHeap[T],
    _time: Double,
    add: (T, Double) => Unit,
    clear: () => EventQueue[T],
    get: () => T | Null,
    getEventTime: T => js.UndefOr[Double],
    getTime: () => Double,
    remove: T => Boolean
  ): EventQueue[T] = {
    val __obj = js.Dynamic.literal(_events = _events.asInstanceOf[js.Any], _time = _time.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), getEventTime = js.Any.fromFunction1(getEventTime), getTime = js.Any.fromFunction0(getTime), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EventQueue[T]]
  }
  
  @scala.inline
  implicit class EventQueueOps[Self <: EventQueue[_], T] (val x: Self with EventQueue[T]) extends AnyVal {
    
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
    def set_events(value: MinHeap[T]): Self = this.set("_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_time(value: Double): Self = this.set("_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (T, Double) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => EventQueue[T]): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => T | Null): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventTime(value: T => js.UndefOr[Double]): Self = this.set("getEventTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTime(value: () => Double): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: T => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
