package typings.recompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[
    /* component */ typings.react.mod.ComponentType[TInner], 
    typings.react.mod.ComponentClass[TOutter, typings.react.mod.ComponentState]
  ]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = typings.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, typings.std.Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = typings.recompose.mod.HandleCreatorsStructure[TOutter] with (typings.recompose.mod.HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[
    /* initialProps */ TOutter, 
    typings.recompose.mod.HandleCreators[TOutter, THandlers]
  ]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ typings.recompose.recomposeStrings.HandleCreatorsHandlers with org.scalablytyped.runtime.TopLevel[THandlers]
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = org.scalablytyped.runtime.StringDictionary[typings.recompose.mod.mapper[TOutter, typings.recompose.mod.EventHandler]]
  type InferableComponentEnhancer[TInjectedProps] = typings.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ typings.react.mod.ComponentType[TInjectedProps], 
    typings.react.mod.ComponentClass[
      (typings.recompose.mod.Omit[TInjectedProps, /* keyof TInjectedProps */ java.lang.String]) with TNeedsProps, 
      typings.react.mod.ComponentState
    ]
  ]
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (typings.recompose.mod._ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[typings.std.Partial[TState]]]
  type StateHandlerMap[TState] = org.scalablytyped.runtime.StringDictionary[typings.recompose.mod.StateHandler[TState]]
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ typings.recompose.recomposeStrings.StateUpdaters with org.scalablytyped.runtime.TopLevel[TUpdaters]
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[typings.react.mod.ReactNode], 
    typings.react.mod.ReactElement
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = typings.recompose.mod.mapper[T, scala.Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, scala.Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
}
