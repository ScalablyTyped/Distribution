package typings.reactAsync.mod

import typings.std.AbortController
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions[T] extends AsyncOptions[T] {
  var defer: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply[T](
    debugLabel: String = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    deferFn: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    dispatcher: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit = null,
    initialValue: T = null,
    json: js.UndefOr[Boolean] = js.undefined,
    onReject: /* error */ Error => Unit = null,
    onResolve: T => Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    reducer: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]] = null,
    watch: js.Any = null,
    watchFn: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _ = null
  ): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (debugLabel != null) __obj.updateDynamic("debugLabel")(debugLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (deferFn != null) __obj.updateDynamic("deferFn")(js.Any.fromFunction3(deferFn))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(js.Any.fromFunction3(dispatcher))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2(promiseFn))
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3(reducer))
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    __obj.asInstanceOf[FetchOptions[T]]
  }
}

