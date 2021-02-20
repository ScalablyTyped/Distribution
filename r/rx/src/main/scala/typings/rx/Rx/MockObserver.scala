package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockObserver[T] extends Observer[T] {
  
  var messages: js.Array[Recorded] = js.native
}
object MockObserver {
  
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    checked: () => CheckedObserver[T],
    makeSafe: IDisposable => Observer[T],
    messages: js.Array[Recorded],
    notifyOn: IScheduler => Observer[T],
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): MockObserver[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checked = js.Any.fromFunction0(checked), makeSafe = js.Any.fromFunction1(makeSafe), messages = messages.asInstanceOf[js.Any], notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[MockObserver[T]]
  }
  
  @scala.inline
  implicit class MockObserverMutableBuilder[Self <: MockObserver[_], T] (val x: Self with MockObserver[T]) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[Recorded]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Recorded*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
