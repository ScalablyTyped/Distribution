package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): js.UndefOr[scala.Nothing]
  def onError(error: stdLib.Error): js.UndefOr[scala.Nothing]
  def onSubscribe(cancel: CancelCallback): js.UndefOr[scala.Nothing]
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](
    onComplete: T => js.UndefOr[scala.Nothing],
    onError: stdLib.Error => js.UndefOr[scala.Nothing],
    onSubscribe: CancelCallback => js.UndefOr[scala.Nothing]
  ): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
}

