package typings.rxjs.subscribeOnObservableMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchArg[T] extends js.Object {
  var source: Observable[T] = js.native
  var subscriber: Subscriber[T] = js.native
}

object DispatchArg {
  @scala.inline
  def apply[T](source: Observable[T], subscriber: Subscriber[T]): DispatchArg[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchArg[T]]
  }
  @scala.inline
  implicit class DispatchArgOps[Self <: DispatchArg[_], T] (val x: Self with DispatchArg[T]) extends AnyVal {
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
    def setSource(value: Observable[T]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriber(value: Subscriber[T]): Self = this.set("subscriber", value.asInstanceOf[js.Any])
  }
  
}

