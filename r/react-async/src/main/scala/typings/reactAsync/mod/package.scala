package typings.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncAction[T] = typings.reactAsync.mod.Start | typings.reactAsync.mod.Cancel | typings.reactAsync.mod.Fulfill[T] | typings.reactAsync.mod.Reject
  type AsyncChildren[T] = (js.Function1[/* state */ typings.reactAsync.mod.AsyncState[T], typings.react.mod.ReactNode]) | typings.react.mod.ReactNode
  type AsyncFulfilled[T] = typings.reactAsync.mod.AbstractState[T] with typings.reactAsync.AnonDataErrorFalse[T]
  type AsyncInitial[T] = typings.reactAsync.mod.AbstractState[T] with typings.reactAsync.AnonData
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: java.lang.String */, T] = typings.std.Omit[
    typings.reactAsync.mod.AsyncFulfilled[T] | typings.reactAsync.mod.AsyncInitial[T] | typings.reactAsync.mod.AsyncPending[T] | typings.reactAsync.mod.AsyncRejected[T], 
    K
  ]
  type AsyncPending[T] = typings.reactAsync.mod.AbstractState[T] with typings.reactAsync.AnonDataError[T]
  type AsyncRejected[T] = typings.reactAsync.mod.AbstractState[T] with typings.reactAsync.AnonDataErrorFalseFinishedAt[T]
  type AsyncState[T] = typings.reactAsync.mod.AsyncInitial[T] | typings.reactAsync.mod.AsyncPending[T] | typings.reactAsync.mod.AsyncFulfilled[T] | typings.reactAsync.mod.AsyncRejected[T]
  type Cancel = typings.reactAsync.mod.AbstractAction with typings.reactAsync.AnonCancel
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typings.reactAsync.mod.AsyncProps[T], 
    /* controller */ typings.std.AbortController, 
    js.Promise[T]
  ]
  type Fulfill[T] = typings.reactAsync.mod.AbstractAction with typings.reactAsync.AnonFulfill[T]
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typings.reactAsync.mod.AsyncFulfilled[T], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type InitialChildren[T] = (js.Function1[/* state */ typings.reactAsync.mod.AsyncInitial[T], typings.react.mod.ReactNode]) | typings.react.mod.ReactNode
  type PendingChildren[T] = (js.Function1[/* state */ typings.reactAsync.mod.AsyncPending[T], typings.react.mod.ReactNode]) | typings.react.mod.ReactNode
  type PromiseFn[T] = js.Function2[
    /* props */ typings.reactAsync.mod.AsyncProps[T], 
    /* controller */ typings.std.AbortController, 
    js.Promise[T]
  ]
  type Reject = typings.reactAsync.mod.AbstractAction with typings.reactAsync.AnonError
  type RejectedChildren[T] = (js.Function2[
    /* error */ typings.std.Error, 
    /* state */ typings.reactAsync.mod.AsyncRejected[T], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type SettledChildren[T] = (js.Function1[
    /* state */ typings.reactAsync.mod.AsyncFulfilled[T] | typings.reactAsync.mod.AsyncRejected[T], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type Start = typings.reactAsync.mod.AbstractAction with typings.reactAsync.AnonPayload
}
