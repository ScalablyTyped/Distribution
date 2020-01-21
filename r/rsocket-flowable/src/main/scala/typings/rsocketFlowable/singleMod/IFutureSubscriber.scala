package typings.rsocketFlowable.singleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): Unit
  def onError(error: Error): Unit
  def onSubscribe(cancel: CancelCallback): Unit
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](onComplete: T => Unit, onError: Error => Unit, onSubscribe: CancelCallback => Unit): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
}

