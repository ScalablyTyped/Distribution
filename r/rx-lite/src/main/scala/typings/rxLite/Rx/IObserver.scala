package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observer
@js.native
trait IObserver[T] extends js.Object {
  
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
  implicit class IObserverOps[Self <: IObserver[_], T] (val x: Self with IObserver[T]) extends AnyVal {
    
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
    def setOnCompleted(value: () => Unit): Self = this.set("onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: T => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
  }
}
