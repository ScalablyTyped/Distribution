package typings.rotJs.schedulerSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler/scheduler", JSImport.Default)
@js.native
/**
  * @class Abstract scheduler
  */
class default[T] () extends Scheduler[T] {
  /* CompleteClass */
  override var _current: js.Any = js.native
  /* CompleteClass */
  override var _queue: typings.rotJs.eventqueueMod.default[T] = js.native
  /* CompleteClass */
  override var _repeat: js.Array[T] = js.native
  /**
    * @param {?} item
    * @param {bool} repeat
    */
  /* CompleteClass */
  override def add(item: T, repeat: Boolean): this.type = js.native
  /**
    * Clear all items
    */
  /* CompleteClass */
  override def clear(): this.type = js.native
  /**
    * @see ROT.EventQueue#getTime
    */
  /* CompleteClass */
  override def getTime(): Double = js.native
  /**
    * Get the time the given item is scheduled for
    * @param {?} item
    * @returns {number} time
    */
  /* CompleteClass */
  override def getTimeOf(item: T): js.UndefOr[Double] = js.native
  /**
    * Schedule next item
    * @returns {?}
    */
  /* CompleteClass */
  override def next(): js.Any = js.native
  /**
    * Remove a previously added item
    * @param {?} item
    * @returns {bool} successful?
    */
  /* CompleteClass */
  override def remove(item: js.Any): Boolean = js.native
}

