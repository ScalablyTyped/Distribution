package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousObserver[T]
  extends StObject
     with Observer[T]
object AnonymousObserver {
  
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
  ): AnonymousObserver[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checked = js.Any.fromFunction0(checked), makeSafe = js.Any.fromFunction1(makeSafe), notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[AnonymousObserver[T]]
  }
}
