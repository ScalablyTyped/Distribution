package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedObserver[T] extends Observer[T] {
  
  def checkAccess(): Unit = js.native
}
object CheckedObserver {
  
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    checkAccess: () => Unit,
    checked: () => CheckedObserver[T],
    makeSafe: IDisposable => Observer[T],
    notifyOn: IScheduler => Observer[T],
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): CheckedObserver[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checkAccess = js.Any.fromFunction0(checkAccess), checked = js.Any.fromFunction0(checked), makeSafe = js.Any.fromFunction1(makeSafe), notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[CheckedObserver[T]]
  }
  
  @scala.inline
  implicit class CheckedObserverMutableBuilder[Self <: CheckedObserver[_], T] (val x: Self with CheckedObserver[T]) extends AnyVal {
    
    @scala.inline
    def setCheckAccess(value: () => Unit): Self = StObject.set(x, "checkAccess", js.Any.fromFunction0(value))
  }
}
