package typings.reactRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ typings.react.mod.ComponentType[TProps], 
    typings.react.mod.NamedExoticComponent[TOwnProps]
  ]
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  type ConnectedComponent[C /* <: typings.react.mod.ComponentType[_] */, P] = (typings.react.mod.NamedExoticComponent[typings.react.mod.global.JSX.LibraryManagedAttributes[C, P]]) with (typings.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typings.reactRedux.anon.WrappedComponent[C]
  
  type ConnectedProps[TConnector] = js.Any
  
  type GetProps[C] = typings.react.mod.ClassAttributes[typings.std.InstanceType[C]] with js.Any
  
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | typings.reactRedux.mod.InferThunkActionCreatorType[TActionCreator]
  
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  
  type InferableComponentEnhancer[TInjectedProps] = typings.reactRedux.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    typings.reactRedux.mod.ConnectedComponent[
      js.Any, 
      (typings.reactRedux.mod.Omit[
        typings.reactRedux.mod.GetProps[_], 
        /* keyof react-redux.react-redux.Shared<TInjectedProps, react-redux.react-redux.GetProps<any>> */ java.lang.String
      ]) with TNeedsProps
    ]
  ]
  
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (typings.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[typings.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    typings.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[typings.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (typings.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typings.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (typings.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typings.reactRedux.mod.MapDispatchToProps[TDispatchProps, TOwnProps])
  
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    typings.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]
  ]
  
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (typings.reactRedux.mod.MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (typings.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]) | scala.Null
  ]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactRedux.reactReduxStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[typings.reactRedux.mod.HandleThunkActionCreator[js.Any]] | (js.Tuple2[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple3[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typings.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ])
  
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typings.reactRedux.reactReduxStrings.ResolveThunks with org.scalablytyped.runtime.TopLevel[TDispatchProps])
  
  type RootStateOrAny = typings.reactRedux.mod.AnyIfEmpty[typings.reactRedux.mod.DefaultRootState]
  
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[typings.redux.mod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    typings.reactRedux.mod.Selector[S, TProps, TOwnProps]
  ]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactRedux.reactReduxStrings.Shared with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, scala.Boolean]], 
    js.Any
  ]
}
