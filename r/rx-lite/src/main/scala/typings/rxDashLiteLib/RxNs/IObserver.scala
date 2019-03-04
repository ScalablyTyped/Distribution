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
  def apply[T](
    onCompleted: js.Function0[scala.Unit],
    onError: js.Function1[js.Any, scala.Unit],
    onNext: js.Function1[T, scala.Unit]
  ): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = onCompleted, onError = onError, onNext = onNext)
  
    __obj.asInstanceOf[IObserver[T]]
  }
}

