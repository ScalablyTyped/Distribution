package typings.recompose

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object recomposeMod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[/* component */ ComponentType[TInner], ComponentClass[TOutter, ComponentState]]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = HandleCreatorsStructure[TOutter] with (HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[/* initialProps */ TOutter, HandleCreators[TOutter, THandlers]]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ typings.recompose.recomposeStrings.HandleCreatorsHandlers with THandlers
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = StringDictionary[mapper[TOutter, EventHandler]]
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ ComponentType[TInjectedProps], 
    ComponentClass[(Omit[TInjectedProps, String]) with TNeedsProps, ComponentState]
  ]
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = StringDictionary[String]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (_ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[Partial[TState]]]
  type StateHandlerMap[TState] = StringDictionary[StateHandler[TState]]
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ typings.recompose.recomposeStrings.StateUpdaters with TUpdaters
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[ReactNode], 
    ReactElement
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = mapper[T, Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
}
