package typings.rotJs.eventqueueMod

import typings.rotJs.minHeapMod.MinHeap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventQueue[T] extends js.Object {
  var _events: MinHeap[T]
  var _time: Double
  /**
    * @param {?} event
    * @param {number} time
    */
  def add(event: T, time: Double): Unit
  /**
    * Clear all scheduled events
    */
  def clear(): this.type
  /**
    * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
    * @returns {? || null} The event previously added by addEvent, null if no event available
    */
  def get(): T | Null
  /**
    * Get the time associated with the given event
    * @param {?} event
    * @returns {number} time
    */
  def getEventTime(event: T): js.UndefOr[Double]
  /**
    * @returns {number} Elapsed time
    */
  def getTime(): Double
  /**
    * Remove an event from the queue
    * @param {?} event
    * @returns {bool} success?
    */
  def remove(event: T): Boolean
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
}

