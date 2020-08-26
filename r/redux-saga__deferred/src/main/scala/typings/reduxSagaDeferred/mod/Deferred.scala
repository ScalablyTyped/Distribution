package typings.reduxSagaDeferred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[R] extends js.Object {
  var promise: js.Promise[R] = js.native
  def reject(error: js.Any): Unit = js.native
  def resolve(result: R): Unit = js.native
}

object Deferred {
  @scala.inline
  def apply[R](promise: js.Promise[R], reject: js.Any => Unit, resolve: R => Unit): Deferred[R] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Deferred[R]]
  }
  @scala.inline
  implicit class DeferredOps[Self <: Deferred[_], R] (val x: Self with Deferred[R]) extends AnyVal {
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
    def setPromise(value: js.Promise[R]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: js.Any => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: R => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

