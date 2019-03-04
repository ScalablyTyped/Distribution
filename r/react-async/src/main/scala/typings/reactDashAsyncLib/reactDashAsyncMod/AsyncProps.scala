package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProps[T] extends AsyncOptions[T] {
  var children: js.UndefOr[reactDashAsyncLib.AsyncChildren[T]] = js.undefined
}

object AsyncProps {
  @scala.inline
  def apply[T](
    children: reactDashAsyncLib.AsyncChildren[T] = null,
    deferFn: js.Function3[
      /* args */ js.Array[_], 
      /* props */ js.Object, 
      /* controller */ stdLib.AbortController, 
      js.Promise[T]
    ] = null,
    initialValue: T = null,
    onReject: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onResolve: js.Function1[T, scala.Unit] = null,
    promise: js.Promise[T] = null,
    promiseFn: js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]] = null,
    watch: js.Any = null,
    watchFn: js.Function2[/* props */ js.Object, /* prevProps */ js.Object, _] = null
  ): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (deferFn != null) __obj.updateDynamic("deferFn")(deferFn)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(onReject)
    if (onResolve != null) __obj.updateDynamic("onResolve")(onResolve)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(promiseFn)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(watchFn)
    __obj.asInstanceOf[AsyncProps[T]]
  }
}

