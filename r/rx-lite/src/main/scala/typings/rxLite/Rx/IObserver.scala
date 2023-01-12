package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observer
trait IObserver[T] extends StObject {
  
  def onCompleted(): Unit
  
  def onError(exception: Any): Unit
  
  def onNext(value: T): Unit
}
object IObserver {
  
  inline def apply[T](onCompleted: () => Unit, onError: Any => Unit, onNext: T => Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[IObserver[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObserver[?], T] (val x: Self & IObserver[T]) extends AnyVal {
    
    inline def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
    
    inline def setOnError(value: Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
  }
}
