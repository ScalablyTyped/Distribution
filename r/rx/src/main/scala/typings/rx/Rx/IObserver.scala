package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObserver[T] extends StObject {
  
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
}
object IObserver {
  
  @scala.inline
  def apply[T](onCompleted: () => Unit, onError: js.Any => Unit, onNext: T => Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[IObserver[T]]
  }
  
  @scala.inline
  implicit class IObserverMutableBuilder[Self <: IObserver[?], T] (val x: Self & IObserver[T]) extends AnyVal {
    
    @scala.inline
    def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
  }
}
