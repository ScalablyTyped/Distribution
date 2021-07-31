package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerStatic extends StObject {
  
  var default: IScheduler
  
  var async: IScheduler
  
  var currentThread: ICurrentThreadScheduler
  
  var immediate: IScheduler
  
  /** Determines whether the given object is a scheduler */
  def isScheduler(s: js.Any): Boolean
  
  /**
    * Normalizes the specified TimeSpan value to a positive value.
    * @param {Number} timeSpan The time span value to normalize.
    * @returns {Number} The specified TimeSpan value if it is zero or positive; otherwise, 0
    */
  def normalize(timeSpan: Double): Double
  
  /** Gets the current time according to the local machine's system clock. */
  def now(): Double
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
  implicit class SchedulerStaticMutableBuilder[Self <: SchedulerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: IScheduler): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentThread(value: ICurrentThreadScheduler): Self = StObject.set(x, "currentThread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: IScheduler): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediate(value: IScheduler): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScheduler(value: js.Any => Boolean): Self = StObject.set(x, "isScheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalize(value: Double => Double): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
