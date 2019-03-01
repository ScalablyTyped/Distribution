package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions[T] extends js.Object {
  var deferFn: js.UndefOr[
    js.Function3[
      /* args */ js.Array[_], 
      /* props */ js.Object, 
      /* controller */ stdLib.AbortController, 
      js.Promise[T]
    ]
  ] = js.undefined
  var initialValue: js.UndefOr[T] = js.undefined
  var onReject: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onResolve: js.UndefOr[js.Function1[/* data */ T, scala.Unit]] = js.undefined
  var promiseFn: js.UndefOr[
    js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]]
  ] = js.undefined
  var watch: js.UndefOr[js.Any] = js.undefined
  var watchFn: js.UndefOr[js.Function2[/* props */ js.Object, /* prevProps */ js.Object, _]] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply[T](
    deferFn: js.Function3[
      /* args */ js.Array[_], 
      /* props */ js.Object, 
      /* controller */ stdLib.AbortController, 
      js.Promise[T]
    ] = null,
    initialValue: T = null,
    onReject: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onResolve: js.Function1[/* data */ T, scala.Unit] = null,
    promiseFn: js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]] = null,
    watch: js.Any = null,
    watchFn: js.Function2[/* props */ js.Object, /* prevProps */ js.Object, _] = null
  ): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (deferFn != null) __obj.updateDynamic("deferFn")(deferFn)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(onReject)
    if (onResolve != null) __obj.updateDynamic("onResolve")(onResolve)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(promiseFn)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(watchFn)
    __obj.asInstanceOf[AsyncOptions[T]]
  }
}

