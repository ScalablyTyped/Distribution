package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions[T]
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var deferFn: js.UndefOr[DeferFn[T]] = js.undefined
  var initialValue: js.UndefOr[T] = js.undefined
  var onReject: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onResolve: js.UndefOr[js.Function1[/* data */ T, scala.Unit]] = js.undefined
  var promise: js.UndefOr[js.Promise[T]] = js.undefined
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.undefined
  var watch: js.UndefOr[js.Any] = js.undefined
  var watchFn: js.UndefOr[js.Function2[/* props */ js.Object, /* prevProps */ js.Object, _]] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply[T](
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deferFn: DeferFn[T] = null,
    initialValue: T = null,
    onReject: /* error */ stdLib.Error => scala.Unit = null,
    onResolve: /* data */ T => scala.Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: PromiseFn[T] = null,
    watch: js.Any = null,
    watchFn: (/* props */ js.Object, /* prevProps */ js.Object) => _ = null
  ): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deferFn != null) __obj.updateDynamic("deferFn")(deferFn)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(promiseFn)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    __obj.asInstanceOf[AsyncOptions[T]]
  }
}

