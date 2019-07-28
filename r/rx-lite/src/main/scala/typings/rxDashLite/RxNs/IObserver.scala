package typings.rxDashLite.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait IObserver[T] extends js.Object {
  def onCompleted(): Unit
  def onError(exception: js.Any): Unit
  def onNext(value: T): Unit
}

object IObserver {
  @scala.inline
  def apply[T](onCompleted: () => Unit, onError: js.Any => Unit, onNext: T => Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
  
    __obj.asInstanceOf[IObserver[T]]
  }
}

