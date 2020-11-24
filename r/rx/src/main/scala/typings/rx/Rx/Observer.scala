package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer[T] extends js.Object {
  
  /**
    *  Hides the identity of an observer.
    * @returns An observer that hides the identity of the specified observer.
    */
  def asObserver(): Observer[T] = js.native
  
  /**
    *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
    *  If a violation is detected, an Error is thrown from the offending observer method call.
    * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
    */
  def checked(): CheckedObserver[T] = js.native
  
  def makeSafe(disposable: IDisposable): Observer[T] = js.native
  
  /**
    * Schedules the invocation of observer methods on the given scheduler.
    * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
    * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
    */
  def notifyOn(scheduler: IScheduler): Observer[T] = js.native
  
  /**
    * Notifies the observer of the end of the sequence.
    */
  def onCompleted(): Unit = js.native
  
  /**
    * Notifies the observer that an exception has occurred.
    * @param {Any} error The error that has occurred.
    */
  def onError(exception: js.Any): Unit = js.native
  
  /**
    * Notifies the observer of a new element in the sequence.
    * @param {Any} value Next element in the sequence.
    */
  def onNext(value: T): Unit = js.native
  
  /**
    *  Creates a notification callback from an observer.
    * @returns The action that forwards its input notification to the underlying observer.
    */
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
}
object Observer {
  
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    checked: () => CheckedObserver[T],
    makeSafe: IDisposable => Observer[T],
    notifyOn: IScheduler => Observer[T],
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checked = js.Any.fromFunction0(checked), makeSafe = js.Any.fromFunction1(makeSafe), notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[Observer[T]]
  }
  
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
    
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
    def setAsObserver(value: () => Observer[T]): Self = this.set("asObserver", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChecked(value: () => CheckedObserver[T]): Self = this.set("checked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeSafe(value: IDisposable => Observer[T]): Self = this.set("makeSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyOn(value: IScheduler => Observer[T]): Self = this.set("notifyOn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleted(value: () => Unit): Self = this.set("onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: T => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNotifier(value: () => js.Function1[/* notification */ Notification[T], Unit]): Self = this.set("toNotifier", js.Any.fromFunction0(value))
  }
}
