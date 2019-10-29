package typings.rotDashJs.libEventqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/eventqueue", JSImport.Default)
@js.native
/**
  * @class Generic event queue: stores events and retrieves them based on their time
  */
class default[T] () extends EventQueue[T] {
  /* CompleteClass */
  override var _eventTimes: js.Array[Double] = js.native
  /* CompleteClass */
  override var _events: js.Array[T] = js.native
  /* CompleteClass */
  override var _time: Double = js.native
  /**
    * Remove an event from the queue
    * @param {int} index
    */
  /* CompleteClass */
  override def _remove(index: Double): Unit = js.native
  /**
    * @param {?} event
    * @param {number} time
    */
  /* CompleteClass */
  override def add(event: T, time: Double): Unit = js.native
  /**
    * Clear all scheduled events
    */
  /* CompleteClass */
  override def clear(): this.type = js.native
  /**
    * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
    * @returns {? || null} The event previously added by addEvent, null if no event available
    */
  /* CompleteClass */
  override def get(): T | Null = js.native
  /**
    * Get the time associated with the given event
    * @param {?} event
    * @returns {number} time
    */
  /* CompleteClass */
  override def getEventTime(event: T): js.UndefOr[Double] = js.native
  /**
    * @returns {number} Elapsed time
    */
  /* CompleteClass */
  override def getTime(): Double = js.native
  /**
    * Remove an event from the queue
    * @param {?} event
    * @returns {bool} success?
    */
  /* CompleteClass */
  override def remove(event: T): Boolean = js.native
}

