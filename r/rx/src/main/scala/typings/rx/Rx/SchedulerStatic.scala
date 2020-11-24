package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerStatic extends js.Object {
  
  var async: IScheduler = js.native
  
  var currentThread: ICurrentThreadScheduler = js.native
  
  var default: IScheduler = js.native
  
  var immediate: IScheduler = js.native
  
  /** Determines whether the given object is a scheduler */
  def isScheduler(s: js.Any): Boolean = js.native
  
  /**
    * Normalizes the specified TimeSpan value to a positive value.
    * @param {Number} timeSpan The time span value to normalize.
    * @returns {Number} The specified TimeSpan value if it is zero or positive; otherwise, 0
    */
  def normalize(timeSpan: Double): Double = js.native
  
  /** Gets the current time according to the local machine's system clock. */
  def now(): Double = js.native
}
object SchedulerStatic {
  
  @scala.inline
  def apply(
    async: IScheduler,
    currentThread: ICurrentThreadScheduler,
    default: IScheduler,
    immediate: IScheduler,
    isScheduler: js.Any => Boolean,
    normalize: Double => Double,
    now: () => Double
  ): SchedulerStatic = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], currentThread = currentThread.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], isScheduler = js.Any.fromFunction1(isScheduler), normalize = js.Any.fromFunction1(normalize), now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[SchedulerStatic]
  }
  
  @scala.inline
  implicit class SchedulerStaticOps[Self <: SchedulerStatic] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: IScheduler): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentThread(value: ICurrentThreadScheduler): Self = this.set("currentThread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: IScheduler): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediate(value: IScheduler): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScheduler(value: js.Any => Boolean): Self = this.set("isScheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalize(value: Double => Double): Self = this.set("normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
  }
}
