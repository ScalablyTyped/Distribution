package typings.reactDashAsync

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashAsync.Anon_Cancel
import typings.reactDashAsync.Anon_Data
import typings.reactDashAsync.Anon_DataError
import typings.reactDashAsync.Anon_DataErrorFalse
import typings.reactDashAsync.Anon_DataErrorFalseFinishedAt
import typings.reactDashAsync.Anon_Error
import typings.reactDashAsync.Anon_Fulfill
import typings.reactDashAsync.Anon_Payload
import typings.std.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncMod {
  type AsyncAction[T] = Start | Cancel | Fulfill[T] | Reject
  type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T], Element]) | Element
  type AsyncFulfilled[T] = AbstractState[T] with Anon_DataErrorFalse[T]
  type AsyncInitial[T] = AbstractState[T] with Anon_Data
  type AsyncPending[T] = AbstractState[T] with Anon_DataError[T]
  type AsyncRejected[T] = AbstractState[T] with Anon_DataErrorFalseFinishedAt[T]
  type AsyncState[T] = AsyncInitial[T] | AsyncPending[T] | AsyncFulfilled[T] | AsyncRejected[T]
  type Cancel = AbstractAction with Anon_Cancel
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ js.Object, 
    /* controller */ AbortController, 
    js.Promise[T]
  ]
  type Fulfill[T] = AbstractAction with Anon_Fulfill[T]
  type PromiseFn[T] = js.Function2[/* props */ js.Object, /* controller */ AbortController, js.Promise[T]]
  type Reject = AbstractAction with Anon_Error
  type Start = AbstractAction with Anon_Payload
}
