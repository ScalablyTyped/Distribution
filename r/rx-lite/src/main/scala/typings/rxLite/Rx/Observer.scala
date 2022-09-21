package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T]
  extends StObject
     with IObserver[T] {
  
  def asObserver(): Observer[T]
  
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit]
}
object Observer {
  
  inline def apply[T](
    asObserver: () => Observer[T],
    onCompleted: () => Unit,
    onError: Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setAsObserver(value: () => Observer[T]): Self = StObject.set(x, "asObserver", js.Any.fromFunction0(value))
    
    inline def setToNotifier(value: () => js.Function1[/* notification */ Notification[T], Unit]): Self = StObject.set(x, "toNotifier", js.Any.fromFunction0(value))
  }
}
