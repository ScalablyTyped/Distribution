package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ trait AsyncProps[T] extends js.Object {
  var children: js.UndefOr[reactDashAsyncLib.AsyncChildren[T]] = js.undefined
  var deferFn: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[T]]] = js.undefined
  var initialValue: js.UndefOr[T] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onResolve: js.UndefOr[js.Function1[/* data */ T, scala.Unit]] = js.undefined
  var promiseFn: js.UndefOr[
    js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]]
  ] = js.undefined
  var watch: js.UndefOr[js.Any] = js.undefined
}

