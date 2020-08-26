package typings.reactAsync.anon

import typings.reactAsync.mod.AsyncProps
import typings.reactAsync.mod.PromiseFn
import typings.std.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialValue[T] extends js.Object {
  var initialValue: js.UndefOr[typings.std.Error | T] = js.native
  var promise: js.UndefOr[js.Promise[T]] = js.native
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.native
}

object InitialValue {
  @scala.inline
  def apply[T](): InitialValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialValue[T]]
  }
  @scala.inline
  implicit class InitialValueOps[Self <: InitialValue[_], T] (val x: Self with InitialValue[T]) extends AnyVal {
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
    def setInitialValue(value: typings.std.Error | T): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = this.set("promiseFn", js.Any.fromFunction2(value))
    @scala.inline
    def deletePromiseFn: Self = this.set("promiseFn", js.undefined)
  }
  
}

