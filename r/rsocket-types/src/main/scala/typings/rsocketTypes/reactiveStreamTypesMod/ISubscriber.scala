package typings.rsocketTypes.reactiveStreamTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriber[T] extends js.Object {
  def onComplete(): Unit = js.native
  def onError(error: Error): Unit = js.native
  def onNext(value: T): Unit = js.native
  def onSubscribe(subscription: ISubscription): Unit = js.native
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
  @scala.inline
  implicit class ISubscriberOps[Self <: ISubscriber[_], T] (val x: Self with ISubscriber[T]) extends AnyVal {
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNext(value: T => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSubscribe(value: ISubscription => Unit): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
  }
  
}

