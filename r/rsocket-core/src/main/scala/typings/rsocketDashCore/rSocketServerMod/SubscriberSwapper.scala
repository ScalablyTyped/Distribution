package typings.rsocketDashCore.rSocketServerMod

import typings.rsocketDashTypes.reactiveStreamTypesMod.ISubscriber
import typings.rsocketDashTypes.reactiveStreamTypesMod.ISubscription
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketServer", "SubscriberSwapper")
@js.native
class SubscriberSwapper[T] () extends ISubscriber[T] {
  def this(target: Partial[ISubscriber[T]]) = this()
  /* CompleteClass */
  override def onComplete(): Unit = js.native
  /* CompleteClass */
  override def onError(error: Error): Unit = js.native
  /* CompleteClass */
  override def onNext(value: T): Unit = js.native
  /* CompleteClass */
  override def onSubscribe(subscription: ISubscription): Unit = js.native
  def swap(next: Partial[ISubscriber[T]]): ISubscriber[T] = js.native
}

