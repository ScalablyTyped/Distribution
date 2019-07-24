package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncMod {
  type AsyncAction[T] = Start | Cancel | Fulfill[T] | Reject
  type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T], reactLib.reactMod.Global.JSXNs.Element]) | reactLib.reactMod.Global.JSXNs.Element
  type AsyncFulfilled[T] = AbstractState[T] with reactDashAsyncLib.Anon_DataErrorFalse[T]
  type AsyncInitial[T] = AbstractState[T] with reactDashAsyncLib.Anon_Data
  type AsyncPending[T] = AbstractState[T] with reactDashAsyncLib.Anon_DataError[T]
  type AsyncRejected[T] = AbstractState[T] with reactDashAsyncLib.Anon_DataErrorFalseFinishedAt[T]
  type AsyncState[T] = AsyncInitial[T] | AsyncPending[T] | AsyncFulfilled[T] | AsyncRejected[T]
  type Cancel = AbstractAction with reactDashAsyncLib.Anon_Cancel
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ js.Object, 
    /* controller */ stdLib.AbortController, 
    js.Promise[T]
  ]
  type Fulfill[T] = AbstractAction with reactDashAsyncLib.Anon_Fulfill[T]
  type PromiseFn[T] = js.Function2[/* props */ js.Object, /* controller */ stdLib.AbortController, js.Promise[T]]
  type Reject = AbstractAction with reactDashAsyncLib.Anon_Error
  type Start = AbstractAction with reactDashAsyncLib.Anon_Payload
}
