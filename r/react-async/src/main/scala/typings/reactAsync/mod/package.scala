package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Async: typings.reactAsync.mod.GenericAsync = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Async").asInstanceOf[typings.reactAsync.mod.GenericAsync]
type Async[T] = typings.react.mod.Component[
typings.reactAsync.mod.AsyncProps[T], 
typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]], 
js.Any]

/**
  * createInstance allows you to create instances of Async that are bound to a specific promise.
  * A unique instance also uses its own React context for better nesting capability.
  */
@scala.inline
def createInstance[T](): typings.reactAsync.mod.AsyncConstructor[T] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactAsync.mod.AsyncConstructor[T]]
@scala.inline
def createInstance[T](defaultOptions: scala.Unit, displayName: java.lang.String): typings.reactAsync.mod.AsyncConstructor[T] = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typings.reactAsync.mod.AsyncConstructor[T]]
@scala.inline
def createInstance[T](defaultOptions: typings.reactAsync.mod.AsyncProps[T]): typings.reactAsync.mod.AsyncConstructor[T] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[typings.reactAsync.mod.AsyncConstructor[T]]
@scala.inline
def createInstance[T](defaultOptions: typings.reactAsync.mod.AsyncProps[T], displayName: java.lang.String): typings.reactAsync.mod.AsyncConstructor[T] = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typings.reactAsync.mod.AsyncConstructor[T]]

@scala.inline
def dispatchMiddleware[T](
  dispatch: js.Function2[
  /* action */ typings.reactAsync.mod.AsyncAction[T], 
  /* repeated */ js.Any, 
  scala.Unit
]
): js.Function2[
/* action */ typings.reactAsync.mod.AsyncAction[T], 
/* repeated */ js.Any, 
scala.Unit] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dispatchMiddleware")(dispatch.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* action */ typings.reactAsync.mod.AsyncAction[T], 
/* repeated */ js.Any, 
scala.Unit]]

/**
  * Universal global scope object. In the browser this is `self`, in Node.js and React Native it's `global`.
  * This file is excluded from coverage reporting because these globals are environment-specific so we can't test them all.
  */
@scala.inline
def globalScope: typings.reactAsync.mod.GlobalScope_ = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("globalScope").asInstanceOf[typings.reactAsync.mod.GlobalScope_]

@scala.inline
def init[T](hasInitialValuePromisePromiseFn: typings.reactAsync.anon.InitialValue[T]): (typings.reactAsync.mod.AsyncInitial[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncPending[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncFulfilled[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncRejected[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(hasInitialValuePromisePromiseFn.asInstanceOf[js.Any]).asInstanceOf[(typings.reactAsync.mod.AsyncInitial[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncPending[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncFulfilled[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncRejected[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]])]

@scala.inline
def neverSettle: js.Promise[scala.Nothing] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("neverSettle").asInstanceOf[js.Promise[scala.Nothing]]

@scala.inline
def reducer[T](
  state: (typings.reactAsync.mod.AsyncFulfilled[
  T, 
  typings.std.Pick[
    typings.reactAsync.mod.AbstractState[T], 
    typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
  ]
]) | (typings.reactAsync.mod.AsyncInitial[
  T, 
  typings.std.Pick[
    typings.reactAsync.mod.AbstractState[T], 
    typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
  ]
]) | (typings.reactAsync.mod.AsyncPending[
  T, 
  typings.std.Pick[
    typings.reactAsync.mod.AbstractState[T], 
    typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
  ]
]) | (typings.reactAsync.mod.AsyncRejected[
  T, 
  typings.std.Pick[
    typings.reactAsync.mod.AbstractState[T], 
    typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
  ]
]),
  action: typings.reactAsync.mod.AsyncAction[T]
): (typings.reactAsync.mod.AsyncInitial[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncPending[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncFulfilled[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncRejected[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(typings.reactAsync.mod.AsyncInitial[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncPending[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncFulfilled[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]]) | (typings.reactAsync.mod.AsyncRejected[
T, 
typings.std.Pick[
  typings.reactAsync.mod.AbstractState[T], 
  typings.reactAsync.reactAsyncStrings.initialValue | typings.reactAsync.reactAsyncStrings.counter | typings.reactAsync.reactAsyncStrings.promise
]])]

/* was `typeof useAsync` */
@scala.inline
def useAsync[T](options: typings.reactAsync.mod.AsyncOptions[T]): typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]]]
/* was `typeof useAsync` */
@scala.inline
def useAsync[T](promiseFn: typings.reactAsync.mod.PromiseFn[T]): typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]] = typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any]).asInstanceOf[typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]]]
@scala.inline
def useAsync[T](promiseFn: typings.reactAsync.mod.PromiseFn[T], options: typings.reactAsync.mod.AsyncOptions[T]): typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]] = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]]]

/**
  *
  * @param {RequestInfo} resource
  * @param {RequestInit} init
  * @param {FetchOptions} options
  * @returns {AsyncState<T, FetchRun<T>>}
  */
/* was `typeof useAsyncFetch` */
@scala.inline
def useFetch[T](resource: typings.std.RequestInfo, init: typings.std.RequestInit): typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.FetchRun[T]] = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.FetchRun[T]]]
@scala.inline
def useFetch[T](
  resource: typings.std.RequestInfo,
  init: typings.std.RequestInit,
  hasDeferJsonOptions: typings.reactAsync.mod.FetchOptions[T]
): typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.FetchRun[T]] = (typings.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any], hasDeferJsonOptions.asInstanceOf[js.Any])).asInstanceOf[typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.FetchRun[T]]]

type AsyncChildren[T] = (js.Function1[
/* state */ typings.reactAsync.mod.AsyncState[T, typings.reactAsync.mod.AbstractState[T]], 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode

type AsyncFulfilled[T, S] = S & typings.reactAsync.anon.Data[T]

type AsyncInitial[T, S] = S & typings.reactAsync.anon.Error

type AsyncPending[T, S] = S & typings.reactAsync.anon.FinishedAt[T]

type AsyncRejected[T, S] = S & typings.reactAsync.anon.IsFulfilled[T]

type AsyncState[T, S /* <: typings.reactAsync.mod.AbstractState[T] */] = typings.reactAsync.mod.BaseAsyncState[T, S]

type BaseAsyncState[T, S] = (typings.reactAsync.mod.AsyncInitial[T, S]) | (typings.reactAsync.mod.AsyncPending[T, S]) | (typings.reactAsync.mod.AsyncFulfilled[T, S]) | (typings.reactAsync.mod.AsyncRejected[T, S])

type DeferFn[T] = js.Function3[
/* args */ js.Array[js.Any], 
/* props */ typings.reactAsync.mod.AsyncProps[T], 
/* controller */ typings.std.AbortController, 
js.Promise[T]]

type FulfilledChildren[T] = (js.Function2[
/* data */ T, 
/* state */ typings.reactAsync.mod.AsyncFulfilled[T, typings.reactAsync.mod.AbstractState[T]], 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode

type GenericAsync = org.scalablytyped.runtime.Instantiable0[typings.reactAsync.mod.Async[js.Object]] & typings.reactAsync.anon.Fulfilled

type InitialChildren[T] = (js.Function1[
/* state */ typings.reactAsync.mod.AsyncInitial[T, typings.reactAsync.mod.AbstractState[T]], 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode

/* Inlined react-async.react-async.AbstractAction['meta'] */
type Meta = typings.reactAsync.reactAsyncStrings.counter

type PendingChildren[T] = (js.Function1[
/* state */ typings.reactAsync.mod.AsyncPending[T, typings.reactAsync.mod.AbstractState[T]], 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode

type PromiseFn[T] = js.Function2[
/* props */ typings.reactAsync.mod.AsyncProps[T], 
/* controller */ typings.std.AbortController, 
js.Promise[T]]

type ReducerAsyncState[T] = typings.reactAsync.mod.BaseAsyncState[T, typings.reactAsync.mod.ReducerBaseState[T]]

type RejectedChildren[T] = (js.Function2[
/* error */ typings.std.Error, 
/* state */ typings.reactAsync.mod.AsyncRejected[T, typings.reactAsync.mod.AbstractState[T]], 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode

type SettledChildren[T] = (js.Function1[
/* state */ (typings.reactAsync.mod.AsyncFulfilled[T, typings.reactAsync.mod.AbstractState[T]]) | (typings.reactAsync.mod.AsyncRejected[T, typings.reactAsync.mod.AbstractState[T]]), 
typings.react.mod.ReactNode]) | typings.react.mod.ReactNode
