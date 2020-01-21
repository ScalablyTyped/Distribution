package typings.rsocketTypes.reactiveStreamTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriber[T] extends js.Object {
  def onComplete(): Unit
  def onError(error: Error): Unit
  def onNext(value: T): Unit
  def onSubscribe(subscription: ISubscription): Unit
}

object ISubscriber {
  @scala.inline
  def apply[T](
    onComplete: () => Unit,
    onError: Error => Unit,
    onNext: T => Unit,
    onSubscribe: ISubscription => Unit
  ): ISubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[ISubscriber[T]]
  }
}

