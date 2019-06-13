package typings
package reactDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxMod {
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[TProps], 
    reactLib.reactMod.ComponentClass[TOwnProps, reactLib.reactMod.ComponentState]
  ]
  type ConnectedComponentClass[C /* <: reactLib.reactMod.ComponentType[_] */, P] = (reactLib.reactMod.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ComponentState
  ]) with (hoistDashNonDashReactDashStaticsLib.hoistDashNonDashReactDashStaticsMod.NonReactStatics[C, js.Object]) with reactDashReduxLib.Anon_WrappedComponent[C]
  type GetProps[C] = js.Any
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponentClass[js.Any, (Omit[GetProps[_], java.lang.String]) with TNeedsProps]
  ]
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (MapStateToProps[TStateProps, TOwnProps, State]) | scala.Null
  ]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ reactDashReduxLib.reactDashReduxLibStrings.Matching with js.Any
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[HandleThunkActionCreator[js.Any]] | (js.Tuple2[HandleThunkActionCreator[js.Any], HandleThunkActionCreator[js.Any]]) | (js.Tuple3[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ])
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ reactDashReduxLib.reactDashReduxLibStrings.ResolveThunks with TDispatchProps)
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ reactDashReduxLib.reactDashReduxLibStrings.Shared with js.Any
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, scala.Boolean]], 
    js.Any
  ]
}
