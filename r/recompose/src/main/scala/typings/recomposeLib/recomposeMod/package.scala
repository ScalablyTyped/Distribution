package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object recomposeMod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[TInner], 
    reactLib.reactMod.ReactNs.ComponentClass[TOutter, reactLib.reactMod.ReactNs.ComponentState]
  ]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, stdLib.Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = HandleCreatorsStructure[TOutter] with (HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[/* initialProps */ TOutter, HandleCreators[TOutter, THandlers]]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = recomposeLib.recomposeLibStrings.HandleCreatorsHandlers with THandlers
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[TInjectedProps], 
    reactLib.reactMod.ReactNs.ComponentType[(Omit[TInjectedProps, java.lang.String]) with TNeedsProps]
  ]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (_ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */js.Any, js.UndefOr[stdLib.Partial[TState]]]
  type StateUpdaters[TOutter, TState, TUpdaters] = recomposeLib.recomposeLibStrings.StateUpdaters with js.Any
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = mapper[T, scala.Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, scala.Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
  type reducerProps[TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */] = recomposeLib.recomposeLibStrings.reducerProps with js.Any
  // withState: https://github.com/acdlite/recompose/blob/master/docs/API.md#withState
  type stateProps[TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */] = recomposeLib.recomposeLibStrings.stateProps with js.Any
}
