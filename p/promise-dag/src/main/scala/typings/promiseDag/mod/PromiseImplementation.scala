package typings.promiseDag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseImplementation[P /* <: js.Thenable[_] */] extends js.Object {
  def all(values: js.Array[_]): P = js.native
  def reject(value: js.Any): P = js.native
  def resolve(value: js.Any): P = js.native
}

object PromiseImplementation {
  @scala.inline
  def apply[/* <: js.Thenable[_] */ P](all: js.Array[_] => P, reject: js.Any => P, resolve: js.Any => P): PromiseImplementation[P] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[PromiseImplementation[P]]
  }
  @scala.inline
  implicit class PromiseImplementationOps[Self <: PromiseImplementation[_], /* <: js.Thenable[_] */ P] (val x: Self with PromiseImplementation[P]) extends AnyVal {
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
    def setAll(value: js.Array[_] => P): Self = this.set("all", js.Any.fromFunction1(value))
    @scala.inline
    def setReject(value: js.Any => P): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: js.Any => P): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

