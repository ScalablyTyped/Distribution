package typings.rotJs.schedulerSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler[T] extends js.Object {
  
  var _current: js.Any = js.native
  
  var _queue: typings.rotJs.eventqueueMod.default[T] = js.native
  
  var _repeat: js.Array[T] = js.native
  
  /**
    * @param {?} item
    * @param {bool} repeat
    */
  def add(item: T, repeat: Boolean): this.type = js.native
  
  /**
    * Clear all items
    */
  def clear(): this.type = js.native
  
  /**
    * @see ROT.EventQueue#getTime
    */
  def getTime(): Double = js.native
  
  /**
    * Get the time the given item is scheduled for
    * @param {?} item
    * @returns {number} time
    */
  def getTimeOf(item: T): js.UndefOr[Double] = js.native
  
  /**
    * Schedule next item
    * @returns {?}
    */
  def next(): js.Any = js.native
  
  /**
    * Remove a previously added item
    * @param {?} item
    * @returns {bool} successful?
    */
  def remove(item: js.Any): Boolean = js.native
}
object Scheduler {
  
  @scala.inline
  def apply[T](
    _current: js.Any,
    _queue: typings.rotJs.eventqueueMod.default[T],
    _repeat: js.Array[T],
    add: (T, Boolean) => Scheduler[T],
    clear: () => Scheduler[T],
    getTime: () => Double,
    getTimeOf: T => js.UndefOr[Double],
    next: () => js.Any,
    remove: js.Any => Boolean
  ): Scheduler[T] = {
    val __obj = js.Dynamic.literal(_current = _current.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _repeat = _repeat.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), getTime = js.Any.fromFunction0(getTime), getTimeOf = js.Any.fromFunction1(getTimeOf), next = js.Any.fromFunction0(next), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Scheduler[T]]
  }
  
  @scala.inline
  implicit class SchedulerOps[Self <: Scheduler[_], T] (val x: Self with Scheduler[T]) extends AnyVal {
    
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
    def set_current(value: js.Any): Self = this.set("_current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_queue(value: typings.rotJs.eventqueueMod.default[T]): Self = this.set("_queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_repeatVarargs(value: T*): Self = this.set("_repeat", js.Array(value :_*))
    
    @scala.inline
    def set_repeat(value: js.Array[T]): Self = this.set("_repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (T, Boolean) => Scheduler[T]): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Scheduler[T]): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Double): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeOf(value: T => js.UndefOr[Double]): Self = this.set("getTimeOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: () => js.Any): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: js.Any => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
