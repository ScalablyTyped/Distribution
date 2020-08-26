package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CheckedObserverOps[Self <: CheckedObserver[_], T] (val x: Self with CheckedObserver[T]) extends AnyVal {
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
    def setCheckAccess(value: () => Unit): Self = this.set("checkAccess", js.Any.fromFunction0(value))
  }
  
}

