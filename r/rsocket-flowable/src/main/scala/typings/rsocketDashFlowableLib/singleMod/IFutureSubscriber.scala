package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): scala.Unit
  def onError(error: stdLib.Error): scala.Unit
  def onSubscribe(cancel: CancelCallback): scala.Unit
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](
    onComplete: T => scala.Unit,
    onError: stdLib.Error => scala.Unit,
    onSubscribe: CancelCallback => scala.Unit
  ): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
}

