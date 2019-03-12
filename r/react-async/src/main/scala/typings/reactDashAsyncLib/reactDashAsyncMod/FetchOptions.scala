package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions[T] extends AsyncOptions[T] {
  var defer: js.UndefOr[scala.Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply[T](
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    deferFn: (/* args */ js.Array[_], /* props */ js.Object, /* controller */ stdLib.AbortController) => js.Promise[T] = null,
    initialValue: T = null,
    onReject: /* error */ stdLib.Error => scala.Unit = null,
    onResolve: T => scala.Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ js.Object, /* controller */ stdLib.AbortController) => js.Promise[T] = null,
    watch: js.Any = null,
    watchFn: (/* props */ js.Object, /* prevProps */ js.Object) => _ = null
  ): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (deferFn != null) __obj.updateDynamic("deferFn")(js.Any.fromFunction3(deferFn))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2(promiseFn))
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    __obj.asInstanceOf[FetchOptions[T]]
  }
}

