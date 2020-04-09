package typings.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Async[T] = typings.react.mod.Component[
    typings.reactAsync.mod.AsyncProps[T], 
    typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]], 
    js.Any
  ]
  type AsyncChildren[T] = (js.Function1[
    /* state */ typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type AsyncFulfilled[T, S] = S with typings.reactAsync.AnonData[T]
  type AsyncInitial[T, S] = S with typings.reactAsync.AnonError
  type AsyncPending[T, S] = S with typings.reactAsync.AnonFinishedAt[T]
  type AsyncRejected[T, S] = S with typings.reactAsync.AnonIsFulfilled[T]
  type AsyncState[T, S /* <: typings.reactAsync.mod.AbstractState[T] */] = typings.reactAsync.mod.BaseAsyncState[T, S]
  type BaseAsyncState[T, S] = (typings.reactAsync.mod.AsyncInitial[T, S]) | (typings.reactAsync.mod.AsyncPending[T, S]) | (typings.reactAsync.mod.AsyncFulfilled[T, S]) | (typings.reactAsync.mod.AsyncRejected[T, S])
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typings.reactAsync.mod.AsyncProps[T], 
    /* controller */ typings.std.AbortController, 
    js.Promise[T]
  ]
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typings.reactAsync.mod.AsyncFulfilled[T, typings.reactAsync.mod.AbstractState[T]], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type GenericAsync = org.scalablytyped.runtime.Instantiable0[typings.reactAsync.mod.Async[js.Object]] with typings.reactAsync.AnonFulfilled
  type InitialChildren[T] = (js.Function1[
    /* state */ typings.reactAsync.mod.AsyncInitial[T, typings.reactAsync.mod.AbstractState[T]], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  /* Inlined react-async.react-async.AbstractAction['meta'] */
  type Meta = typings.reactAsync.reactAsyncStrings.counter
  type PendingChildren[T] = (js.Function1[
    /* state */ typings.reactAsync.mod.AsyncPending[T, typings.reactAsync.mod.AbstractState[T]], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type PromiseFn[T] = js.Function2[
    /* props */ typings.reactAsync.mod.AsyncProps[T], 
    /* controller */ typings.std.AbortController, 
    js.Promise[T]
  ]
  type ReducerAsyncState[T] = typings.reactAsync.mod.BaseAsyncState[T, typings.reactAsync.mod.ReducerBaseState[T]]
  type RejectedChildren[T] = (js.Function2[
    /* error */ typings.std.Error, 
    /* state */ typings.reactAsync.mod.AsyncRejected[T, typings.reactAsync.mod.AbstractState[T]], 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
  type SettledChildren[T] = (js.Function1[
    /* state */ (typings.reactAsync.mod.AsyncFulfilled[T, typings.reactAsync.mod.AbstractState[T]]) | (typings.reactAsync.mod.AsyncRejected[T, typings.reactAsync.mod.AbstractState[T]]), 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
}
