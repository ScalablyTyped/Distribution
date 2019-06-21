package typings
package rsocketDashTypesLib.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriber[T] extends js.Object {
  def onComplete(): scala.Unit
  def onError(error: stdLib.Error): scala.Unit
  def onNext(value: T): scala.Unit
  def onSubscribe(subscription: ISubscription): scala.Unit
}

object ISubscriber {
  @scala.inline
  def apply[T](
    onComplete: () => scala.Unit,
    onError: stdLib.Error => scala.Unit,
    onNext: T => scala.Unit,
    onSubscribe: ISubscription => scala.Unit
  ): ISubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
  
    __obj.asInstanceOf[ISubscriber[T]]
  }
}

