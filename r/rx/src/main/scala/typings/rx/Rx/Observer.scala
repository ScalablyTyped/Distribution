package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  /**
    *  Hides the identity of an observer.
    * @returns An observer that hides the identity of the specified observer.
    */
  def asObserver(): Observer[T]
  
  /**
    *  Checks access to the observer for grammar violations. This includes checking for multiple OnError or OnCompleted calls, as well as reentrancy in any of the observer methods.
    *  If a violation is detected, an Error is thrown from the offending observer method call.
    * @returns An observer that checks callbacks invocations against the observer grammar and, if the checks pass, forwards those to the specified observer.
    */
  def checked(): CheckedObserver[T]
  
  def makeSafe(disposable: IDisposable): Observer[T]
  
  /**
    * Schedules the invocation of observer methods on the given scheduler.
    * @param {Scheduler} scheduler Scheduler to schedule observer messages on.
    * @returns {Observer} Observer whose messages are scheduled on the given scheduler.
    */
  def notifyOn(scheduler: IScheduler): Observer[T]
  
  /**
    * Notifies the observer of the end of the sequence.
    */
  def onCompleted(): Unit
  
  /**
    * Notifies the observer that an exception has occurred.
    * @param {Any} error The error that has occurred.
    */
  def onError(exception: js.Any): Unit
  
  /**
    * Notifies the observer of a new element in the sequence.
    * @param {Any} value Next element in the sequence.
    */
  def onNext(value: T): Unit
  
  /**
    *  Creates a notification callback from an observer.
    * @returns The action that forwards its input notification to the underlying observer.
    */
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit]
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
  implicit class ObserverMutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
    
    @scala.inline
    def setAsObserver(value: () => Observer[T]): Self = StObject.set(x, "asObserver", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChecked(value: () => CheckedObserver[T]): Self = StObject.set(x, "checked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeSafe(value: IDisposable => Observer[T]): Self = StObject.set(x, "makeSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyOn(value: IScheduler => Observer[T]): Self = StObject.set(x, "notifyOn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNotifier(value: () => js.Function1[/* notification */ Notification[T], Unit]): Self = StObject.set(x, "toNotifier", js.Any.fromFunction0(value))
  }
}
