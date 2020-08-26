package typings.rsocketFlowable.singleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): Unit = js.native
  def onError(error: Error): Unit = js.native
  def onSubscribe(cancel: CancelCallback): Unit = js.native
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](onComplete: T => Unit, onError: Error => Unit, onSubscribe: CancelCallback => Unit): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
  @scala.inline
  implicit class IFutureSubscriberOps[Self <: IFutureSubscriber[_], T] (val x: Self with IFutureSubscriber[T]) extends AnyVal {
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
    def setOnComplete(value: T => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSubscribe(value: CancelCallback => Unit): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
  }
  
}

