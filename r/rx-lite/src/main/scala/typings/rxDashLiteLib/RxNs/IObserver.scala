package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait IObserver[T] extends js.Object {
  def onCompleted(): scala.Unit
  def onError(exception: js.Any): scala.Unit
  def onNext(value: T): scala.Unit
}

object IObserver {
  @scala.inline
  def apply[T](onCompleted: () => scala.Unit, onError: js.Any => scala.Unit, onNext: T => scala.Unit): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
  
    __obj.asInstanceOf[IObserver[T]]
  }
}

