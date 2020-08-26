package typings.reduxPromiseMiddleware.anon

import typings.reduxPromiseMiddleware.mod.AsyncFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var promise: js.Promise[_] | AsyncFunction = js.native
}

object Data {
  @scala.inline
  def apply(promise: js.Promise[_] | AsyncFunction): Data = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setPromiseFunction0(value: () => js.Promise[js.Any]): Self = this.set("promise", js.Any.fromFunction0(value))
    @scala.inline
    def setPromise(value: js.Promise[_] | AsyncFunction): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

