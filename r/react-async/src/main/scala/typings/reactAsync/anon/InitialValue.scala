package typings.reactAsync.anon

import typings.reactAsync.mod.AsyncProps
import typings.reactAsync.mod.PromiseFn
import typings.std.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialValue[T] extends js.Object {
  var initialValue: js.UndefOr[typings.std.Error | T] = js.undefined
  var promise: js.UndefOr[js.Promise[T]] = js.undefined
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.undefined
}

object InitialValue {
  @scala.inline
  def apply[T](
    initialValue: typings.std.Error | T = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null
  ): InitialValue[T] = {
    val __obj = js.Dynamic.literal()
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2(promiseFn))
    __obj.asInstanceOf[InitialValue[T]]
  }
}

