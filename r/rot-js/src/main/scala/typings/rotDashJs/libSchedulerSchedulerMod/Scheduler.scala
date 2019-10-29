package typings.rotDashJs.libSchedulerSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduler[T] extends js.Object {
  var _current: js.Any
  var _queue: typings.rotDashJs.libEventqueueMod.default[T]
  var _repeat: js.Array[T]
  /**
    * @param {?} item
    * @param {bool} repeat
    */
  def add(item: T, repeat: Boolean): this.type
  /**
    * Clear all items
    */
  def clear(): this.type
  /**
    * @see ROT.EventQueue#getTime
    */
  def getTime(): Double
  /**
    * Get the time the given item is scheduled for
    * @param {?} item
    * @returns {number} time
    */
  def getTimeOf(item: T): js.UndefOr[Double]
  /**
    * Schedule next item
    * @returns {?}
    */
  def next(): js.Any
  /**
    * Remove a previously added item
    * @param {?} item
    * @returns {bool} successful?
    */
  def remove(item: js.Any): Boolean
}

object Scheduler {
  @scala.inline
  def apply[T](
    _current: js.Any,
    _queue: typings.rotDashJs.libEventqueueMod.default[T],
    _repeat: js.Array[T],
    add: (T, Boolean) => Scheduler[T],
    clear: () => Scheduler[T],
    getTime: () => Double,
    getTimeOf: T => js.UndefOr[Double],
    next: () => js.Any,
    remove: js.Any => Boolean
  ): Scheduler[T] = {
    val __obj = js.Dynamic.literal(_current = _current, _queue = _queue, _repeat = _repeat, add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), getTime = js.Any.fromFunction0(getTime), getTimeOf = js.Any.fromFunction1(getTimeOf), next = js.Any.fromFunction0(next), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Scheduler[T]]
  }
}

