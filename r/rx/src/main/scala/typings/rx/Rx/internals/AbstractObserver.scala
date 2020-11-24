package typings.rx.Rx.internals

import typings.rx.Rx.IDisposable
import typings.rx.Rx.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractObserver[T]
  extends IObserver[T]
     with IDisposable {
  
  def completed(): Unit = js.native
  
  def error(error: js.Any): Unit = js.native
  
  def fail(e: js.Any): Boolean = js.native
  
  var isStopped: Boolean = js.native
  
  // Must be implemented by other observers
  def next(value: T): Unit = js.native
}
object AbstractObserver {
  
  @scala.inline
  def apply[T](
    completed: () => Unit,
    dispose: () => Unit,
    error: js.Any => Unit,
    fail: js.Any => Boolean,
    isStopped: Boolean,
    next: T => Unit,
    onCompleted: () => Unit,
    onError: js.Any => Unit,
    onNext: T => Unit
  ): AbstractObserver[T] = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), fail = js.Any.fromFunction1(fail), isStopped = isStopped.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[AbstractObserver[T]]
  }
  
  @scala.inline
  implicit class AbstractObserverOps[Self <: AbstractObserver[_], T] (val x: Self with AbstractObserver[T]) extends AnyVal {
    
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
    def setCompleted(value: () => Unit): Self = this.set("completed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFail(value: js.Any => Boolean): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStopped(value: Boolean): Self = this.set("isStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
  }
}
