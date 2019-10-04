package typings.reactDashAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncMod {
  import typings.react.reactMod.ReactNode
  import typings.reactDashAsync.Anon_Cancel
  import typings.reactDashAsync.Anon_Data
  import typings.reactDashAsync.Anon_DataError
  import typings.reactDashAsync.Anon_DataErrorFalse
  import typings.reactDashAsync.Anon_DataErrorFalseFinishedAt
  import typings.reactDashAsync.Anon_Error
  import typings.reactDashAsync.Anon_Fulfill
  import typings.reactDashAsync.Anon_Payload
  import typings.std.AbortController
  import typings.std.Error
  import typings.std.Omit

  type AsyncAction[T] = Start | Cancel | Fulfill[T] | Reject
  type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T], ReactNode]) | ReactNode
  type AsyncFulfilled[T] = AbstractState[T] with Anon_DataErrorFalse[T]
  type AsyncInitial[T] = AbstractState[T] with Anon_Data
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: String */, T] = Omit[AsyncFulfilled[T] | AsyncInitial[T] | AsyncPending[T] | AsyncRejected[T], K]
  type AsyncPending[T] = AbstractState[T] with Anon_DataError[T]
  type AsyncRejected[T] = AbstractState[T] with Anon_DataErrorFalseFinishedAt[T]
  type AsyncState[T] = AsyncInitial[T] | AsyncPending[T] | AsyncFulfilled[T] | AsyncRejected[T]
  type Cancel = AbstractAction with Anon_Cancel
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ AsyncProps[T], 
    /* controller */ AbortController, 
    js.Promise[T]
  ]
  type Fulfill[T] = AbstractAction with Anon_Fulfill[T]
  type FulfilledChildren[T] = (js.Function2[/* data */ T, /* state */ AsyncFulfilled[T], ReactNode]) | ReactNode
  type InitialChildren[T] = (js.Function1[/* state */ AsyncInitial[T], ReactNode]) | ReactNode
  type PendingChildren[T] = (js.Function1[/* state */ AsyncPending[T], ReactNode]) | ReactNode
  type PromiseFn[T] = js.Function2[/* props */ AsyncProps[T], /* controller */ AbortController, js.Promise[T]]
  type Reject = AbstractAction with Anon_Error
  type RejectedChildren[T] = (js.Function2[/* error */ Error, /* state */ AsyncRejected[T], ReactNode]) | ReactNode
  type SettledChildren[T] = (js.Function1[/* state */ AsyncFulfilled[T] | AsyncRejected[T], ReactNode]) | ReactNode
  type Start = AbstractAction with Anon_Payload
}
