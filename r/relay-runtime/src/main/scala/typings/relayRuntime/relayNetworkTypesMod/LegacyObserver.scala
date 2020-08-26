package typings.relayRuntime.relayNetworkTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyObserver[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
}

object LegacyObserver {
  @scala.inline
  def apply[T](): LegacyObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyObserver[T]]
  }
  @scala.inline
  implicit class LegacyObserverOps[Self <: LegacyObserver[_], T] (val x: Self with LegacyObserver[T]) extends AnyVal {
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
    def setOnCompleted(value: () => Unit): Self = this.set("onCompleted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCompleted: Self = this.set("onCompleted", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnNext(value: /* data */ T => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
  }
  
}

