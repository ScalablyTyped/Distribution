package typings.rx.Rx.internals

import typings.rx.Rx.CheckedObserver
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IScheduler
import typings.rx.Rx.Notification
import typings.rx.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledObserver[T] extends Observer[T] {
  
  def ensureActive(): Unit = js.native
}
object ScheduledObserver {
  
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    checked: () => CheckedObserver[T],
    ensureActive: () => Unit,
    makeSafe: IDisposable => Observer[T],
    notifyOn: IScheduler => Observer[T],
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
  ): ScheduledObserver[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checked = js.Any.fromFunction0(checked), ensureActive = js.Any.fromFunction0(ensureActive), makeSafe = js.Any.fromFunction1(makeSafe), notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
    __obj.asInstanceOf[ScheduledObserver[T]]
  }
  
  @scala.inline
  implicit class ScheduledObserverOps[Self <: ScheduledObserver[_], T] (val x: Self with ScheduledObserver[T]) extends AnyVal {
    
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
    def setEnsureActive(value: () => Unit): Self = this.set("ensureActive", js.Any.fromFunction0(value))
  }
}
