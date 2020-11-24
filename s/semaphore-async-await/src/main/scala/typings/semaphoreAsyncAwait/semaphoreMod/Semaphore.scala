package typings.semaphoreAsyncAwait.semaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Semaphore extends js.Object {
  
  /**
    * Alias for {@linkcode Semaphore.wait}.
    * @returns  A promise that gets resolved when execution is allowed to proceed.
    */
  def acquire(): js.Promise[Boolean] = js.native
  
  /**
    * Acquires all permits that are currently available and returns the number of acquired permits.
    * @returns  Number of acquired permits.
    */
  def drainPermits(): Double = js.native
  
  /**
    * Schedules func to be called once a permit becomes available.
    * Returns a promise that resolves to the return value of func.
    * @typeparam T  The return type of func.
    * @param func  The function to be executed.
    * @return  A promise that gets resolved with the return value of the function.
    */
  def execute[T](func: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
  
  /**
    * Returns the number of available permits.
    * @returns  The number of available permits.
    */
  def getPermits(): Double = js.native
  
  var permits: js.Any = js.native
  
  var promiseResolverQueue: js.Any = js.native
  
  /**
    * Alias for {@linkcode Semaphore.signal}.
    */
  def release(): Unit = js.native
  
  /**
    * Increases the number of permits by one. If there are other functions waiting, one of them will
    * continue to execute in a future iteration of the event loop.
    */
  def signal(): Unit = js.native
  
  /**
    * Synchronous function that tries to acquire a permit and returns true if successful, false otherwise.
    * @returns  Whether a permit could be acquired.
    */
  def tryAcquire(): Boolean = js.native
  
  /**
    * Same as {@linkcode Semaphore.wait} except the promise returned gets resolved with false if no
    * permit becomes available in time.
    * @param milliseconds  The time spent waiting before the wait is aborted. This is a lower bound,
    * don't rely on it being precise.
    * @returns  A promise that gets resolved with true when execution is allowed to proceed or
    * false if the time given elapses before a permit becomes available.
    */
  def waitFor(milliseconds: Double): js.Promise[Boolean] = js.native
}
object Semaphore {
  
  @scala.inline
  def apply(
    acquire: () => js.Promise[Boolean],
    drainPermits: () => Double,
    execute: js.Function0[js.Any | js.Thenable[js.Any]] => js.Promise[js.Any],
    getPermits: () => Double,
    permits: js.Any,
    promiseResolverQueue: js.Any,
    release: () => Unit,
    signal: () => Unit,
    tryAcquire: () => Boolean,
    waitFor: Double => js.Promise[Boolean]
  ): Semaphore = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), drainPermits = js.Any.fromFunction0(drainPermits), execute = js.Any.fromFunction1(execute), getPermits = js.Any.fromFunction0(getPermits), permits = permits.asInstanceOf[js.Any], promiseResolverQueue = promiseResolverQueue.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), signal = js.Any.fromFunction0(signal), tryAcquire = js.Any.fromFunction0(tryAcquire), waitFor = js.Any.fromFunction1(waitFor))
    __obj.asInstanceOf[Semaphore]
  }
  
  @scala.inline
  implicit class SemaphoreOps[Self <: Semaphore] (val x: Self) extends AnyVal {
    
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
    def setAcquire(value: () => js.Promise[Boolean]): Self = this.set("acquire", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrainPermits(value: () => Double): Self = this.set("drainPermits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecute(value: js.Function0[js.Any | js.Thenable[js.Any]] => js.Promise[js.Any]): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPermits(value: () => Double): Self = this.set("getPermits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPermits(value: js.Any): Self = this.set("permits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseResolverQueue(value: js.Any): Self = this.set("promiseResolverQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignal(value: () => Unit): Self = this.set("signal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTryAcquire(value: () => Boolean): Self = this.set("tryAcquire", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaitFor(value: Double => js.Promise[Boolean]): Self = this.set("waitFor", js.Any.fromFunction1(value))
  }
}
