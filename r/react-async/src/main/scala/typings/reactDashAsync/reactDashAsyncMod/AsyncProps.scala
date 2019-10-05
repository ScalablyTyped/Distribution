package typings.reactDashAsync.reactDashAsyncMod

import typings.std.AbortController
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProps[T] extends AsyncOptions[T] {
  var children: js.UndefOr[AsyncChildren[T]] = js.undefined
}

object AsyncProps {
  @scala.inline
  def apply[T](
    children: AsyncChildren[T] = null,
    debugLabel: String = null,
    deferFn: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    dispatcher: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit = null,
    initialValue: T = null,
    onReject: /* error */ Error => Unit = null,
    onResolve: T => Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    reducer: (/* state */ AsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]]) => AsyncState[T] = null,
    watch: js.Any = null,
    watchFn: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _ = null
  ): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (debugLabel != null) __obj.updateDynamic("debugLabel")(debugLabel)
    if (deferFn != null) __obj.updateDynamic("deferFn")(js.Any.fromFunction3(deferFn))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(js.Any.fromFunction3(dispatcher))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2(promiseFn))
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3(reducer))
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    __obj.asInstanceOf[AsyncProps[T]]
  }
}

