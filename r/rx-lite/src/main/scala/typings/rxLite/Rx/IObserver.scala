package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observer
@js.native
trait IObserver[T] extends StObject {
  
  def onCompleted(): Unit = js.native
  
  def onError(exception: js.Any): Unit = js.native
  
  def onNext(value: T): Unit = js.native
}
object IObserver {
  
  @scala.inline
  def apply[T](onCompleted: () => Unit, onError: js.Any => Unit, onNext: T => Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[IObserver[T]]
  }
  
  @scala.inline
  implicit class IObserverMutableBuilder[Self <: IObserver[_], T] (val x: Self with IObserver[T]) extends AnyVal {
    
    @scala.inline
    def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
  }
}
